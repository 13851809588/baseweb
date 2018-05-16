package com.bea.server.common.core.service.impl;

import com.bea.server.common.core.dao.BaseDao;
import com.bea.server.common.core.service.IService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public abstract class BaseService<T, D extends BaseDao<T>> implements IService<T> {
    protected D dao;

    @Autowired
    public void setDao(D dao){
        this.dao = dao;
    }

    public D getDao()
    {
        return dao;
    }

    @Override
    public boolean insert(T entity) {
        int rows = dao.insert(entity);
        return rows == 1;
    }


    @Override
    public boolean delete(Object key) {
        int rows = dao.delete(key);
        return rows == 1;
    }

    @Override
    public boolean delete(Object[] keys) {
        boolean isSuccess = true;
        for (Object key : keys) {
            if (!delete(key)) {
                isSuccess = false;
                break;
            }
        }
        return isSuccess;
    }

    @Override
    public boolean update(T entity) {
        int rows = dao.update(entity);
        return rows == 1;
    }

    @Override
    public T getById(Object key) {
        return dao.getById(key) ;
    }

    @Override
    public List<T> find(Map<?, ?> map) {
        return dao.find(map);
    }

    @Override
    public PageInfo<T> pageQuery(Map<?, ?> map, Page<?> page) {
        PageHelper.startPage(page.getStartRow(), page.getPageSize());
        return new PageInfo<>(dao.pageQuery(map));
    }

    @Override
    public Long count(Map<?, ?> map) {
        return dao.count(map);
    }
}
