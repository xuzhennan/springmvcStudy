package com.xuzn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "/helloView",method = RequestMethod.GET)
    public String hello(){
        //System.out.println("hello");
        return "hello";
    }


    @RequestMapping(value = "/homeView",method = RequestMethod.GET)
    public String home(){
        //System.out.println("home");
        return "home";
    }
}
