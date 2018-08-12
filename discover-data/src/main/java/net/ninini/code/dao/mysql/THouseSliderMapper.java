package net.ninini.code.dao.mysql;

import java.util.List;
import net.ninini.code.entity.po.THouseSlider;
import net.ninini.code.entity.po.THouseSliderExample;
import org.apache.ibatis.annotations.Param;

public interface THouseSliderMapper {
    long countByExample(THouseSliderExample example);

    int deleteByExample(THouseSliderExample example);

    int deleteByPrimaryKey(Long pid);

    int insert(THouseSlider record);

    int insertSelective(THouseSlider record);

    List<THouseSlider> selectByExampleWithBLOBs(THouseSliderExample example);

    List<THouseSlider> selectByExample(THouseSliderExample example);

    THouseSlider selectByPrimaryKey(Long pid);

    int updateByExampleSelective(@Param("record") THouseSlider record, @Param("example") THouseSliderExample example);

    int updateByExampleWithBLOBs(@Param("record") THouseSlider record, @Param("example") THouseSliderExample example);

    int updateByExample(@Param("record") THouseSlider record, @Param("example") THouseSliderExample example);

    int updateByPrimaryKeySelective(THouseSlider record);

    int updateByPrimaryKeyWithBLOBs(THouseSlider record);

    int updateByPrimaryKey(THouseSlider record);
}