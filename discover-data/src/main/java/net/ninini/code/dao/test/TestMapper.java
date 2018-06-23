package net.ninini.code.dao.test;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface TestMapper {
    Object test();
}
