package com.p2p.service.impl;

import com.p2p.mapper.TbAdminUserMapper;
import com.p2p.pojo.TbAdminUser;
import com.p2p.service.AdminUserService;
import com.p2p.util.Response;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/9/28 0028.
 */
@Service
public class AdminUserServiceImpl implements AdminUserService{
    @Resource
    TbAdminUserMapper adminUserMapper;
    @Override
    public Response selectUser(String username, String password) {
        TbAdminUser tbAdminUser = adminUserMapper.selectUser(username, password);
        if(tbAdminUser!=null){
            return Response.build().setStatus("1");
        }else{
            return Response.build().setStatus("0");
        }
    }
}
