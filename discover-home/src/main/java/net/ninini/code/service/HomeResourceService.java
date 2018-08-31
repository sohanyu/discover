package net.ninini.code.service;

import net.ninini.code.entity.bo.HomeResourceBO;
import net.ninini.code.entity.parameter.HomeResourceParameter;
import net.ninini.code.entity.po.THomeResource;

import java.util.List;

public interface HomeResourceService {

    /**
     * 获取房源列表
     * @param homeResourceParameter
     * @return
     */
    List<HomeResourceBO> getHomeResourceList(HomeResourceParameter homeResourceParameter);
}
