package com.p2p.service;

import com.p2p.util.Response;

/**
 * Created by Administrator on 2018/9/28 0028.
 */
public interface AdminUserService {
    Response selectUser(String username, String password);
}
