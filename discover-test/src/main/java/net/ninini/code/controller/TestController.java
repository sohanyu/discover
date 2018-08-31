package net.ninini.code.controller;

import com.google.common.collect.Maps;
import net.ninini.code.annotation.RequestLog;
import net.ninini.code.dao.mysql.THomeResourceMapper;
import net.ninini.code.entity.parameter.HomeResourceParameter;
import net.ninini.code.support.HomeResourceSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class TestController {


    @Autowired
    THomeResourceMapper tHouseResourceMapper;

    @Autowired
    HomeResourceSupport homeResourceSupport;

    @RequestLog
    @RequestMapping("/test2")
    //@Cacheable(value="users", key="#name")
    public Object hello(@RequestParam String name) {
        Map map = Maps.newHashMap();
        map.put("hello", tHouseResourceMapper.selectByPrimaryKey(0L));
        System.out.println("执行");
        return map;

    }

    @RequestLog
    @RequestMapping("/test")
    //@Cacheable(value="users", key="#name")
    public Object hello1(@RequestParam String name) {
        Map map = Maps.newHashMap();
//        HomeResourceParameter p = new HomeResourceParameter();
//        p.setPid(222L);
//        map.put("data", homeResourceSupport.selectByExample(p));
        return map;

    }

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/redis")
    public Object set() {
        redisTemplate.opsForValue().set("test:set", "testValue1");
        return redisTemplate.opsForValue().get("test:set");
    }

}
