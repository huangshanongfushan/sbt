package com.duplicall.sbt.controller;

import com.duplicall.sbt.service.IUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by raymond on 2016/6/7.
 */
@Controller
public class TestController {
    Logger logger = LoggerFactory.getLogger(TestController.class);
    @Resource
    IUser userImpl;

    @RequestMapping("index")
    public String test2() {
        return "index";
    }
}
