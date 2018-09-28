package com.p2p.controller;

import com.p2p.service.AdminUserService;
import com.p2p.util.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/9/28 0028.
 */
@RestController
public class UserController {
    @Resource
    AdminUserService adminUserService;
    @RequestMapping("/account/login")
    public Response login(String username,String password){
        return adminUserService.selectUser(username,password);
    }

}
