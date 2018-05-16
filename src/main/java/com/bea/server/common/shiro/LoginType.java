package com.bea.server.common.shiro;

import lombok.ToString;

@ToString
public enum LoginType {

    /**
     * 登录类型
     * USER("user") 用户登录类型
     * CERT("cert") 证书登录类型
     */
    USER("user"),  CERT("cert");

    private String type;

    LoginType(String type) {
        this.type = type;
    }

}
