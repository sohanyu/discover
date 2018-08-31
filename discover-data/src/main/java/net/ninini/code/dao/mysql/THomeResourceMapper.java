package net.ninini.code.dao.mysql;

import java.util.List;
import net.ninini.code.entity.po.THomeResource;
import net.ninini.code.entity.po.THomeResourceExample;
import org.apache.ibatis.annotations.Param;

public interface THomeResourceMapper {
    long countByExample(THomeResourceExample example);

    int deleteByExample(THomeResourceExample example);

    int deleteByPrimaryKey(Long pid);

    int insert(THomeResource record);

    int insertSelective(THomeResource record);

    List<THomeResource> selectByExampleWithBLOBs(THomeResourceExample example);

    List<THomeResource> selectByExample(THomeResourceExample example);

    THomeResource selectByPrimaryKey(Long pid);

    int updateByExampleSelective(@Param("record") THomeResource record, @Param("example") THomeResourceExample example);

    int updateByExampleWithBLOBs(@Param("record") THomeResource record, @Param("example") THomeResourceExample example);

    int updateByExample(@Param("record") THomeResource record, @Param("example") THomeResourceExample example);

    int updateByPrimaryKeySelective(THomeResource record);

    int updateByPrimaryKeyWithBLOBs(THomeResource record);

    int updateByPrimaryKey(THomeResource record);
}