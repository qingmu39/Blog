package com.ksz.blog.service;

import com.ksz.blog.dao.pojo.SysUser;
import com.ksz.blog.vo.Result;
import com.ksz.blog.vo.UserVo;

public interface SysUserService {

    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    Result findUserByToken(String token);

    SysUser findUserByAccount(String account);

    void save(SysUser sysUser);

    UserVo findUserVoById(Long authorId);
}
