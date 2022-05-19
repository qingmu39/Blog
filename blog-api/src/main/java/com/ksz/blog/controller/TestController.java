package com.ksz.blog.controller;


import com.ksz.blog.dao.pojo.SysUser;
import com.ksz.blog.utils.UserThreadLocal;
import com.ksz.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public Result test(){
//        SysUser
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }

}

