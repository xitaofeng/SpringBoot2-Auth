package com.monster.auth.dao;

import com.monster.auth.pojo.po.RbacRole;

public interface RbacRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RbacRole record);

    int insertSelective(RbacRole record);

    RbacRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RbacRole record);

    int updateByPrimaryKey(RbacRole record);
}