package com.ksz.blog.service;

import com.ksz.blog.dao.pojo.SysUser;
import com.ksz.blog.vo.Result;
import com.ksz.blog.vo.params.LoginParam;
import org.springframework.stereotype.Service;



public interface LoginService {
    /**
     * 登录
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    Result logout(String token);

    Result register(LoginParam loginParam);
}

