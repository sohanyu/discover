package net.ninini.code.dao.mysql;

import java.util.List;
import net.ninini.code.entity.po.THomeSlider;
import net.ninini.code.entity.po.THomeSliderExample;
import org.apache.ibatis.annotations.Param;

public interface THomeSliderMapper {
    long countByExample(THomeSliderExample example);

    int deleteByExample(THomeSliderExample example);

    int deleteByPrimaryKey(Long pid);

    int insert(THomeSlider record);

    int insertSelective(THomeSlider record);

    List<THomeSlider> selectByExampleWithBLOBs(THomeSliderExample example);

    List<THomeSlider> selectByExample(THomeSliderExample example);

    THomeSlider selectByPrimaryKey(Long pid);

    int updateByExampleSelective(@Param("record") THomeSlider record, @Param("example") THomeSliderExample example);

    int updateByExampleWithBLOBs(@Param("record") THomeSlider record, @Param("example") THomeSliderExample example);

    int updateByExample(@Param("record") THomeSlider record, @Param("example") THomeSliderExample example);

    int updateByPrimaryKeySelective(THomeSlider record);

    int updateByPrimaryKeyWithBLOBs(THomeSlider record);

    int updateByPrimaryKey(THomeSlider record);
}