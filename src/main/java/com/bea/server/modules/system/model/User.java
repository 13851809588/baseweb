package com.bea.server.modules.system.model;

import lombok.ToString;

import java.util.Date;

@ToString
public class User {
    /**
     * 标识
     */
    private Integer userid;

    /**
     * 用户组id
     */
    private Integer usergroupid;

    private Integer roleid;

    /**
     * 登录名
     */
    private String loginname;

    /**
     * 用户名
     */
    private String username;

    /**
     * 证书序列号
     */
    private String certsn;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 手机
     */
    private String mobilephone;

    /**
     * ip范围
     */
    private String ipaddress;

    /**
     * 口令策略标识
     */
    private Integer policyid;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态
            1 : 正常
            2 : 删除
            3 : 锁定
     */
    private Integer status;

    /**
     * 是否系统内置
            0 : 不内置
            1 : 内置
     */
    private Boolean issysdefault;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 最近登录时间
     */
    private Date lastlogintime;

    /**
     * 填写的采用主题的css样式名称
     */
    private String themetype;

    /**
     * IP前缀
     */
    private Integer prefix;

    private String startstandardip;

    private String endstandardip;

    private Boolean verifyipaddr;

    private Integer updatepwdcount;

    /**
     * 描述
     */
    private String description;

    /**
     * 获取标识
     *
     * @return userID - 标识
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置标识
     *
     * @param userid 标识
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取用户组id
     *
     * @return userGroupID - 用户组id
     */
    public Integer getUsergroupid() {
        return usergroupid;
    }

    /**
     * 设置用户组id
     *
     * @param usergroupid 用户组id
     */
    public void setUsergroupid(Integer usergroupid) {
        this.usergroupid = usergroupid;
    }

    /**
     * @return roleID
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取登录名
     *
     * @return loginName - 登录名
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * 设置登录名
     *
     * @param loginname 登录名
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    /**
     * 获取用户名
     *
     * @return userName - 用户名
     */
    public String getUsername(

    ) {

        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取证书序列号
     *
     * @return certsn - 证书序列号
     */
    public String getCertsn() {
        return certsn;
    }

    /**
     * 设置证书序列号
     *
     * @param certsn 证书序列号
     */
    public void setCertsn(String certsn) {
        this.certsn = certsn;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取电话
     *
     * @return telephone - 电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置电话
     *
     * @param telephone 电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取手机
     *
     * @return mobilePhone - 手机
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
     * 设置手机
     *
     * @param mobilephone 手机
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    /**
     * 获取ip范围
     *
     * @return ipAddress - ip范围
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * 设置ip范围
     *
     * @param ipaddress ip范围
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    /**
     * 获取口令策略标识
     *
     * @return policyID - 口令策略标识
     */
    public Integer getPolicyid() {
        return policyid;
    }

    /**
     * 设置口令策略标识
     *
     * @param policyid 口令策略标识
     */
    public void setPolicyid(Integer policyid) {
        this.policyid = policyid;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取状态
            1 : 正常
            2 : 删除
            3 : 锁定
     *
     * @return status - 状态
            1 : 正常
            2 : 删除
            3 : 锁定
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
            1 : 正常
            2 : 删除
            3 : 锁定
     *
     * @param status 状态
            1 : 正常
            2 : 删除
            3 : 锁定
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取是否系统内置
            0 : 不内置
            1 : 内置
     *
     * @return isSysDefault - 是否系统内置
            0 : 不内置
            1 : 内置
     */
    public Boolean getIssysdefault() {
        return issysdefault;
    }

    /**
     * 设置是否系统内置
            0 : 不内置
            1 : 内置
     *
     * @param issysdefault 是否系统内置
            0 : 不内置
            1 : 内置
     */
    public void setIssysdefault(Boolean issysdefault) {
        this.issysdefault = issysdefault;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取最近登录时间
     *
     * @return lastLoginTime - 最近登录时间
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * 设置最近登录时间
     *
     * @param lastlogintime 最近登录时间
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * 获取填写的采用主题的css样式名称
     *
     * @return themeType - 填写的采用主题的css样式名称
     */
    public String getThemetype() {
        return themetype;
    }

    /**
     * 设置填写的采用主题的css样式名称
     *
     * @param themetype 填写的采用主题的css样式名称
     */
    public void setThemetype(String themetype) {
        this.themetype = themetype;
    }

    /**
     * 获取IP前缀
     *
     * @return preFix - IP前缀
     */
    public Integer getPrefix() {
        return prefix;
    }

    /**
     * 设置IP前缀
     *
     * @param prefix IP前缀
     */
    public void setPrefix(Integer prefix) {
        this.prefix = prefix;
    }

    /**
     * @return startStandardIP
     */
    public String getStartstandardip() {
        return startstandardip;
    }

    /**
     * @param startstandardip
     */
    public void setStartstandardip(String startstandardip) {
        this.startstandardip = startstandardip;
    }

    /**
     * @return endStandardIP
     */
    public String getEndstandardip() {
        return endstandardip;
    }

    /**
     * @param endstandardip
     */
    public void setEndstandardip(String endstandardip) {
        this.endstandardip = endstandardip;
    }

    /**
     * @return verifyIPAddr
     */
    public Boolean getVerifyipaddr() {
        return verifyipaddr;
    }

    /**
     * @param verifyipaddr
     */
    public void setVerifyipaddr(Boolean verifyipaddr) {
        this.verifyipaddr = verifyipaddr;
    }

    /**
     * @return updatePwdCount
     */
    public Integer getUpdatepwdcount() {
        return updatepwdcount;
    }

    /**
     * @param updatepwdcount
     */
    public void setUpdatepwdcount(Integer updatepwdcount) {
        this.updatepwdcount = updatepwdcount;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

}