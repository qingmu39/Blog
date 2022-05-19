package com.ksz.blog.vo;

public enum  ErrorCode {

    ACCOUNT_EXIST(10004,"账号已存在"),

    PARAMS_ERROR(10001,"参数有误"),
    PARAMS_NULL(10003,"用户名或密码为空,请重新输入"),
    ACCOUNT_PWD_NOT_EXIST(10002,"用户名或密码不存在"),
    TOKEN_NOT_EXIST(10005,"token检查失败"),
    NO_PERMISSION(70001,"无访问权限"),
    SESSION_TIME_OUT(90001,"会话超时"),
    NO_LOGIN(90002,"未登录"),;

    private int code;
    private String msg;

    ErrorCode(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

