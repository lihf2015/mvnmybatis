package com.andy.dao;

import com.andy.model.UserDto;

public interface UserDtoMapper {
    int deleteByPrimaryKey(Integer id);

    public int insert(UserDto record);

    int insertSelective(UserDto record);

    UserDto selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDto record);

    int updateByPrimaryKey(UserDto record);
}