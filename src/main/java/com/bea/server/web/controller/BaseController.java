package com.bea.server.web.controller;

import com.github.pagehelper.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    HttpServletRequest request;

    protected void getPageParameter(Page<?> page){
        Integer pageDisStart = Integer.parseInt(request.getParameter("iDisplayStart"));
        Integer pageSize = Integer.parseInt(request.getParameter("iDisplayLength"));
        page.setStartRow(pageDisStart);
        page.setPageSize(pageSize);
    }


}
