package com.bea.server.modules.system.service;

import com.bea.server.common.core.service.IService;
import com.bea.server.modules.system.model.User;

import java.util.List;
import java.util.Map;

public interface UserService  extends IService<User> {

    List<User> finda(Map<?,?> map);
}
