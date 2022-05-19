package com.ksz.blog.vo;

import lombok.Data;

@Data
public class LoginUserVo {
	//与页面交互

    private Long id;

    private String account;

    private String nickname;

    private String avatar;
}

