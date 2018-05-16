package com.bea.server.modules.system.dao;

import com.bea.server.common.core.dao.BaseDao;
import com.bea.server.modules.system.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseDao<User>{

}
