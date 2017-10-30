package com.netease.ad.nex.controller;

import com.netease.ad.nex.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by stenio on 2017/10/25.
 */
@RestController
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    public DemoController(){
        System.out.println("demo controller");
    }

    @Autowired
    private DemoService demoService;

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/test2")
    public Object test2() {
        System.out.println(demoService);
        Map<String, Object> map = new HashMap<>();
        map.put("a", 1);
        Map<String, Object> b = new HashMap<>();
        b.put("c", "ss");
        map.put("b", b);
        logger.info("test2");
        logger.error("test2");
        return map;
    }

    @RequestMapping("/test3")
    public Object test3() {
        return demoService.insert();
    }
}
