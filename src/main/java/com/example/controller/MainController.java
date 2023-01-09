package com.example.controller;


import com.example.listener.TestEvent;
import com.example.pojo.UserData;
import com.example.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class MainController {
    @Resource
    TestService service;
    @Resource
    ApplicationContext context;
//    @Value("${test.name}")
    String name;
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
//        Logger logger = LoggerFactory.getLogger(MainController.class);
//        logger.info("有人访问了登录页面");
        //这里就用Session代替ID吧
//        MDC.put("reqId", request.getSession().getId());
//        log.info("有人访问了登录页面");
//        service.test();
//        System.out.println("我是同步方法");
        context.publishEvent(new TestEvent("有人访问了登录界面！"));
        return "login";
    }
}
