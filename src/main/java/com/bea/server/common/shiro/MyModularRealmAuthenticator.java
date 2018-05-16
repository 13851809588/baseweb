package com.bea.server.common.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.slf4j.LoggerFactory;

public class MyModularRealmAuthenticator extends ModularRealmAuthenticator {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MyModularRealmAuthenticator.class);;

    @Override
    protected AuthenticationInfo doAuthenticate(AuthenticationToken authenticationToken) throws AuthenticationException {
        assertRealmsConfigured();

        return super.doAuthenticate(authenticationToken);
    }
}
