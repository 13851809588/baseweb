package com.bea.server.web.controller;

import com.bea.server.common.core.pojo.RespData;
import com.bea.server.common.core.pojo.RespTData;
import com.bea.server.modules.system.model.User;
import com.bea.server.modules.system.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController extends  BaseController{

    @Autowired
    private UserService userService;

    @GetMapping("/pageQuery")
    public RespTData pageQuery(HttpServletRequest request,
                               @RequestParam(required = false, defaultValue = "1") int userid){
        Map<String,Object> map = new HashMap<String,Object>();
        Page<?> page = new Page<>();
        getPageParameter(page);
        PageInfo<User> pageInfo = userService.pageQuery(map,page);
        return RespTData.ok(pageInfo);
    }

    @GetMapping("/query")
    public RespData query() {
        Map<String,Object> map = new HashMap<String,Object>();
        List<User> users = userService.find(map);
        return RespData.ok(users);
    }

}
