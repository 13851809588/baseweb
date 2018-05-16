package com.bea.server.modules.system.service.impl;

import com.bea.server.common.core.service.impl.BaseService;
import com.bea.server.modules.system.dao.UserDao;
import com.bea.server.modules.system.model.User;
import com.bea.server.modules.system.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl extends BaseService<User, UserDao> implements UserService {

    @Override
    public List<User> finda(Map<?, ?> map) {
        return dao.find(map);
    }
}
