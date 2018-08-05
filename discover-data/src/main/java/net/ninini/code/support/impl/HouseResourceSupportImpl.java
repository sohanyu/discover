package net.ninini.code.support.impl;

import net.ninini.code.dao.mysql.THouseResourceMapper;
import net.ninini.code.entity.THouseResource;
import net.ninini.code.entity.THouseResourceExample;
import net.ninini.code.support.HouseResourceSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseResourceSupportImpl implements HouseResourceSupport {

    @Autowired
    THouseResourceMapper tHouseResourceMapper;


    @Override
    public long countByExample(THouseResourceExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(THouseResourceExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Long pid) {
        return 0;
    }

    @Override
    public int insert(THouseResource record) {
        return 0;
    }

    @Override
    public int insertSelective(THouseResource record) {
        return 0;
    }

    @Override
    public List<THouseResource> selectByExampleWithBLOBs(THouseResourceExample example) {
        return null;
    }

    @Override
    public List<THouseResource> selectByExample(THouseResourceExample example) {
        return null;
    }

    @Override
    public THouseResource selectByPrimaryKey(Long pid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(THouseResource record, THouseResourceExample example) {
        return 0;
    }

    @Override
    public int updateByExampleWithBLOBs(THouseResource record, THouseResourceExample example) {
        return 0;
    }

    @Override
    public int updateByExample(THouseResource record, THouseResourceExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(THouseResource record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(THouseResource record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(THouseResource record) {
        return 0;
    }
}
