package com.zccpro.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zccpro.model.User;

@Mapper
public interface UserMapper {
	@Select("select * from user where name = #{name}")
	User findUserByName(@Param("name") String name);
}
