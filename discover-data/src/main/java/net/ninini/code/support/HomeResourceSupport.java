package net.ninini.code.support;

import net.ninini.code.entity.bo.HomeResourceBO;
import net.ninini.code.entity.parameter.HomeResourceParameter;
import net.ninini.code.entity.po.THomeResource;

import java.util.List;

public interface HomeResourceSupport {

    List<THomeResource> getHomeResourceListBase(HomeResourceParameter homeResourceParameter);

    List<HomeResourceBO> getHomeResourceList(HomeResourceParameter homeResourceParameter);


}
