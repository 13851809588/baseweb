package com.bea.server.common.core.dao;

import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

/**
 * 范型数据访问MyBatis实现
 *
 * @author yanjun
 */
public interface BaseDao<T> {

    /**
     * 插入数据实体
     * @param entity 数据实体
     * @return 插入记录条数
     */
    int insert(T entity);

    /**
     * 根据ID删除数据实体
     * @param key 主键
     * @return 删除记录条数
     */
    int delete(Object key);

    /**
     * 更新数据实体
     * @param entity 数据实体
     * @return 更新记录条数
     */
    int update(T entity);

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
     * 查询符合条件的所有记录
     * @param map
     * @return 实体列表
     */
    List<T> query(Map<?,?> map);

    /**
     * 分页查询数据
     * @param map map参数
     * @return 实体列表
     */
    Page<T> pageQuery(Map<?,?> map);

    /**
     * 按条件查询记录数
     * @param map map参数
     * @return 记录数
     */
    Long count(Map<?,?> map);
}
