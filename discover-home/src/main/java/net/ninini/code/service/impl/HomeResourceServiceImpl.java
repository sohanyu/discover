package net.ninini.code.service.impl;

import net.ninini.code.entity.bo.HomeResourceBO;
import net.ninini.code.entity.parameter.HomeResourceParameter;
import net.ninini.code.service.HomeResourceService;
import net.ninini.code.support.HomeResourceSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeResourceServiceImpl implements HomeResourceService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    HomeResourceSupport homeResourceSupport;


    @Override
    public List<HomeResourceBO> getHomeResourceList(HomeResourceParameter homeResourceParameter) {
        logger.info("ServiceImpl");
        return homeResourceSupport.getHomeResourceList(homeResourceParameter);
    }
}
