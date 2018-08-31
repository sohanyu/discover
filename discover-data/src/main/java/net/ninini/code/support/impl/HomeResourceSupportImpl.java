package net.ninini.code.support.impl;

import net.ninini.code.dao.mysql.THomeResourceMapper;
import net.ninini.code.entity.bo.HomeResourceBO;
import net.ninini.code.entity.parameter.HomeResourceParameter;
import net.ninini.code.entity.po.THomeResource;
import net.ninini.code.support.HomeResourceSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeResourceSupportImpl implements HomeResourceSupport {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    THomeResourceMapper tHomeResourceMapper;


    @Override
    public List<THomeResource> getHomeResourceListBase(HomeResourceParameter parameter) {
        logger.info("缓存没有命中");
        return tHomeResourceMapper.selectByExampleWithBLOBs(parameter.getExample());
    }

    @Cacheable(value = "home", key = "#parameter.pid")
    @Override
    public List<HomeResourceBO> getHomeResourceList(HomeResourceParameter parameter) {
        logger.info("缓存没有命中");
        List<THomeResource> list = tHomeResourceMapper.selectByExampleWithBLOBs(parameter.getExample());
        List<HomeResourceBO> result = new ArrayList<>();
        list.forEach(home -> {
            HomeResourceBO homeResourceBO = new HomeResourceBO(home);
            result.add(homeResourceBO);
        });
        return result;
    }
}
