package net.ninini.code.controller;

import com.google.common.collect.Maps;
import net.ninini.code.dao.test.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class TestController {

    @Autowired
    TestMapper testDao;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + "，this is two messge";
    }

    @RequestMapping("/test")
    public Object test(@RequestParam String name) {
        Map map = Maps.newHashMap();
        map.put("hello", name);
        return map;
    }

    @RequestMapping("/test2")
    public Object hello(@RequestParam String name) {
        Map map = Maps.newHashMap();
        map.put("hello", testDao.test());
        return map;

    }
}
