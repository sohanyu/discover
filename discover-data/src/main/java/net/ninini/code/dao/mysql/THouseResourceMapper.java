package net.ninini.code.dao.mysql;

import java.util.List;
import net.ninini.code.entity.THouseResource;
import net.ninini.code.entity.THouseResourceExample;
import org.apache.ibatis.annotations.Param;

public interface THouseResourceMapper {
    long countByExample(THouseResourceExample example);

    int deleteByExample(THouseResourceExample example);

    int deleteByPrimaryKey(Long pid);

    int insert(THouseResource record);

    int insertSelective(THouseResource record);

    List<THouseResource> selectByExampleWithBLOBs(THouseResourceExample example);

    List<THouseResource> selectByExample(THouseResourceExample example);

    THouseResource selectByPrimaryKey(Long pid);

    int updateByExampleSelective(@Param("record") THouseResource record, @Param("example") THouseResourceExample example);

    int updateByExampleWithBLOBs(@Param("record") THouseResource record, @Param("example") THouseResourceExample example);

    int updateByExample(@Param("record") THouseResource record, @Param("example") THouseResourceExample example);

    int updateByPrimaryKeySelective(THouseResource record);

    int updateByPrimaryKeyWithBLOBs(THouseResource record);

    int updateByPrimaryKey(THouseResource record);
}