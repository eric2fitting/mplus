package com.prv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prv.pojo.UserTest;
import com.prv.service.UserTestService;

/**
*
* @author eric
* @date 2020年11月4日  新建
*/
@RestController
public class TestController {
	@Autowired
	private UserTestService userTestService;
	
	@RequestMapping("/test1")
	public String test1() {
		return "ok";
	}
	
	@RequestMapping("/test2")
	public String test2() {
		UserTest user = userTestService.queryById(1L);
		return user==null ? "null" : user.toString();
	}

	@RequestMapping("/test3")
	public String test3() {
		return "新分支";
	}

	@RequestMapping("/saveList")
	public String saveList() {
		userTestService.saveList();
		
		return "saveAll";
	}
}
