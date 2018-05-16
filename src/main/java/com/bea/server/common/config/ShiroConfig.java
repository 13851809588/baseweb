package com.bea.server.common.config;


import com.bea.server.common.shiro.CustomCertCredentialsMatcher;
import com.bea.server.common.shiro.ShiroDBCertRealm;
import com.bea.server.common.shiro.ShiroDBPasswdRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * shiro 配置
 */
@Configuration
public class ShiroConfig {

    private static final Logger log = LoggerFactory.getLogger(ShiroConfig.class);

    @Bean
    public static LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public static DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
        return new DefaultAdvisorAutoProxyCreator();
    }

    @Bean
    public ShiroDBPasswdRealm shiroDBPasswdRealm() {
        ShiroDBPasswdRealm shiroDBPasswdRealm = new ShiroDBPasswdRealm();
        shiroDBPasswdRealm.setCredentialsMatcher(hashedCredentialsMatcher());
        return shiroDBPasswdRealm;
    }

    @Bean
    public ShiroDBCertRealm shiroDBCertRealm() {
        ShiroDBCertRealm shiroDBCertRealm = new ShiroDBCertRealm();
        shiroDBCertRealm.setCredentialsMatcher(customCertCredentialsMatcher());
        return shiroDBCertRealm;
    }

    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("md5");//散列算法:这里使用MD5算法;
        hashedCredentialsMatcher.setHashIterations(2);//散列的次数，比如散列两次，相当于 md5(md5(""));
        return hashedCredentialsMatcher;
    }

    @Bean
    public CustomCertCredentialsMatcher customCertCredentialsMatcher() {
        return new CustomCertCredentialsMatcher();
    }


}
