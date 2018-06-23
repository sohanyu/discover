package net.ninini.code.controller;

import net.ninini.code.dao.test.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    TestMapper testDao;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + "，this is two messge";
    }

    @RequestMapping("/hello1")
    public Object hello(@RequestParam String name) {
        return testDao.test();
    }
}
