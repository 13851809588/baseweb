package com.bea.server.common.core.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface IService<T> {

    /**
     * 插入数据实体
     * @param entity 数据实体
     * @return 插入记录条数
     */
    boolean insert(T entity);

    /**
     * 根据ID删除数据实体
     * @param key 主键
     * @return 删除记录条数
     */
    boolean delete(Object key);

    /**
     * 删除对个数据实体
     * @return 删除记录条数
     */
    boolean delete(Object[] keys);

    /**
     * 更新数据实体
     * @param entity 数据实体
     * @return 更新记录条数
     */
    boolean update(T entity);

    /**
     * 根据ID获取数据实体
     * @param key 主键
     * @return 数据实体
     */
    T getById(Object key);

    /**
     * 查询所有记录
     * @return  实体列表
     */
    List<T> find(Map<?,?> map);

    /**
     * 分页查询数据
     * @param map map参数
     * @return 实体列表
     */
    PageInfo<T> pageQuery(Map<?,?> map, Page<?> page);

    /**
     * 按条件查询记录数
     * @param map map参数
     * @return 记录数
     */
    Long count(Map<?,?> map);



}
