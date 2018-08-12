package net.ninini.code.support.impl;

import net.ninini.code.dao.mysql.THouseResourceMapper;
import net.ninini.code.entity.parameter.HouseResourceParameter;
import net.ninini.code.entity.po.THouseResource;
import net.ninini.code.entity.po.THouseResourceExample;
import net.ninini.code.support.HouseResourceSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseResourceSupportImpl implements HouseResourceSupport {

    @Autowired
    THouseResourceMapper tHouseResourceMapper;

    @Cacheable(value="users", key="#parameter.pid")
    @Override
    public List<THouseResource> selectByExample(HouseResourceParameter parameter) {
        System.out.println("执行");
        return tHouseResourceMapper.selectByExampleWithBLOBs(parameter.getExample());
    }


}
