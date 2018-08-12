package net.ninini.code.support;

import net.ninini.code.entity.parameter.HouseResourceParameter;
import net.ninini.code.entity.po.THouseResource;
import net.ninini.code.entity.po.THouseResourceExample;

import java.util.List;

public interface HouseResourceSupport {

    List<THouseResource> selectByExample(HouseResourceParameter parameter);


}
