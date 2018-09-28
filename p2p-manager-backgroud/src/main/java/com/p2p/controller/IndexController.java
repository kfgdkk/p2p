package com.p2p.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/9/27 0027.
 */
@RestController
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "success back";
    }
}
