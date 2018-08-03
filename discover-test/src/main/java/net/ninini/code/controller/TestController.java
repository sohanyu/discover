package net.ninini.code.controller;

import com.google.common.collect.Maps;
import net.ninini.code.annotation.RequestLog;
import net.ninini.code.dao.test.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class TestController {

    @Value("${location}")
    public String test;

    @Autowired
    TestMapper testDao;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + test;
    }

    @RequestMapping("/test")
    public Object test(@RequestParam String name) {
        Map map = Maps.newHashMap();
        map.put("hello", name);
        return map;
    }

    @RequestLog
    @RequestMapping("/test2")
    public Object hello(@RequestParam String name) {
        Map map = Maps.newHashMap();
        map.put("hello", testDao.test());
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
