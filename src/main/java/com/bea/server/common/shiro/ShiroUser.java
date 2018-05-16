package com.bea.server.common.shiro;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class ShiroUser {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户登录名称
     */
    private String loginName;
    /**
     * 用户显示名称
     */
    private String userName;
    /**
     * 登录ticket
     */
    private String ticket;
    /**
     * 签名值
     */
    private String singnData;
    /**
     * 用户证书
     */
    private String userCert;
    /**
     * 登录类型
     */
    private String loginType;

    public ShiroUser(String userId,String loginName,String userName){
        this.userId = userId;
        this.loginName = loginName;
        this.userName = userName;
    }

}
