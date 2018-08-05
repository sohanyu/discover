package net.ninini.code.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.google.common.collect.Maps;
import net.ninini.code.annotation.RequestLog;
import net.ninini.code.dao.test.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class TestController {

    @Autowired
    TestMapper testDao;

    @RequestLog
    @RequestMapping("/test2")
    @Cacheable(value="users", key="#name")
    public Object hello(@RequestParam String name) {
        Map map = Maps.newHashMap();
        map.put("hello", testDao.test());
        System.out.println("执行");
        return map.toString();

    }

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/redis")
    public Object set() {
        redisTemplate.opsForValue().set("test:set", "testValue1");
        return redisTemplate.opsForValue().get("test:set");
    }

}
