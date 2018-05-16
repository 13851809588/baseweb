-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user` (
  `userid` bigint(20) NOT NULL,
  `username` varchar(4000) NOT NULL,
  `fullname` varchar(4000) NOT NULL,
  `password` varchar(60) NOT NULL,
  `telephone` varchar(60) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `mobile` varchar(60) DEFAULT NULL,
  `description` varchar(4000) DEFAULT NULL,
  `sysflag` bigint(20) NOT NULL DEFAULT '0',
  `ipauth` bigint(20) NOT NULL DEFAULT '0',
  `startip` varchar(48) DEFAULT NULL,
  `endip` varchar(48) DEFAULT NULL,
  `changepwdtag` bigint(20) NOT NULL,
  `changepwddate` datetime DEFAULT NULL,
  `statusflag` bigint(20) NOT NULL DEFAULT '0',
  `organizationid` bigint(20) DEFAULT  NULL,
  `passwdpolicyid` bigint(20) DEFAULT NULL,
  `groupid` bigint(20) DEFAULT NULL,
  `isadmin` bigint(20) NOT NULL,
  `themeid` bigint(20) DEFAULT '0',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_usr_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role` (
  `roleid` varchar(20) NOT NULL,
  `rolename` varchar(60) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `roletype` varchar(2) NOT NULL,
  `creatorid` varchar(20) DEFAULT NULL,
  `deriveid` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for t_sys_group
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_group`;
CREATE TABLE `t_sys_group` (
  `groupid` bigint(20) NOT NULL,
  `groupname` varchar(60) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `sysflag` bigint(20) NOT NULL DEFAULT '0',
  `statusflag` bigint(20) NOT NULL DEFAULT '0',
  `creatorid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`groupid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for t_sys_module
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_module`;
CREATE TABLE `t_sys_module` (
  `modid` varchar(20) NOT NULL,
  `modname` varchar(60) NOT NULL,
  `isstandard` varchar(2) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `syscode` varchar(255) DEFAULT NULL,
  `modlevel` varchar(20) DEFAULT NULL,
  `uppermodid` varchar(128) DEFAULT NULL,
  `isadmin` varchar(2) DEFAULT NULL,
  `url` varchar(512) DEFAULT NULL,
  `isvalid` varchar(2) DEFAULT NULL,
  `modcode` varchar(256) NOT NULL,
  `iconpath` varchar(256) DEFAULT NULL,
  `displayorder` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`modid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_sys_function`;
CREATE TABLE `t_sys_function` (
  `funcid` varchar(20) NOT NULL,
  `funcname` varchar(50) DEFAULT NULL,
  `modid` varchar(256) DEFAULT NULL,
  `premission` varchar(60) DEFAULT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `isvalid` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`funcid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for t_organization
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_organization`;
CREATE TABLE `t_organization` (
  `organizationid` bigint(20) NOT NULL,
  `organizationname` varchar(255) NOT NULL,
  `organizationlevel` bigint(20) NOT NULL,
  `parentid` bigint(20) DEFAULT NULL,
  `tel` varchar(60) DEFAULT NULL,
  `principal` varchar(256) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `description` varchar(4000) DEFAULT NULL,
  `sysflag` bigint(20) DEFAULT NULL,
  `organizationcode` varchar(255) NOT NULL,
  `attachment` varchar(4000) DEFAULT NULL,
  PRIMARY KEY (`organizationid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for t_sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user_role`;
CREATE TABLE `t_sys_user_role` (
  `userid` varchar(20) NOT NULL,
  `roleid` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for t_sys_role_module
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role_module`;
CREATE TABLE `t_sys_role_module` (
  `roleid` varchar(20) NOT NULL,
  `modid` varchar(20) NOT NULL,
  `modcode` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_usr_role_func
-- ----------------------------
DROP TABLE IF EXISTS `t_usr_role_func`;
CREATE TABLE `t_usr_role_func` (
  `roleid` varchar(20) NOT NULL,
  `funcid` varchar(20) NOT NULL,
  `funccode` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


