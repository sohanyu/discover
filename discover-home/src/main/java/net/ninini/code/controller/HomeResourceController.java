package net.ninini.code.controller;


import net.ninini.code.annotation.RequestLog;
import net.ninini.code.entity.parameter.HomeResourceParameter;
import net.ninini.code.service.HomeResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResourceController {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    HomeResourceService homeResourceService;

    @RequestLog
    @RequestMapping("/home-resource")
    public Object getHomeResourceList(HomeResourceParameter homeResourceParameter) {
        return homeResourceService.getHomeResourceList(homeResourceParameter);
    }
}
