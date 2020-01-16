package com.clt.blog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author clt
 * @create 2020/1/16 17:35
 */

@Controller
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        logger.error("into");
        return "index";
    }



    @RequestMapping("/test")
    public  String test(){
        return "index.html";
    }

}
