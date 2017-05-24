package com.zccpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zccpro.dao.UserMapper;
import com.zccpro.model.User;

@RestController
@RequestMapping({"/home"})
public class UserController {
	@Autowired
	UserMapper userMapper;
	
	@RequestMapping(value = "/user")
	public String user(){
		User user = userMapper.findUserByName("1name");
		return user.getName()+"------"+user.getAge();
	}
}
