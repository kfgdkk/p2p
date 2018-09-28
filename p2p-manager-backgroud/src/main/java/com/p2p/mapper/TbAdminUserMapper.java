package com.p2p.mapper;

import com.p2p.pojo.TbAdminUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2018/9/28 0028.
 */
public interface TbAdminUserMapper {
    @Select("select * from tb_admin_user where username=#{username} and password =#{password}")
    TbAdminUser selectUser(@Param("username") String username,@Param("password") String password);
}
