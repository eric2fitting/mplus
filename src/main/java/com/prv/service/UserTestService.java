package com.prv.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prv.dao.UserMapper;
import com.prv.pojo.UserTest;

/**
*
* @author eric
* @date 2020年11月4日  新建
*/
@Service
public class UserTestService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	public UserTest queryById(Long id) {
		return userMapper.selectById(id);
	}

	public void saveList() {
		UserTest userTest = new UserTest();
		userTest.setAge(3);
		userTest.setName("老大");
		UserTest userTest1 = new UserTest();
		userTest1.setAge(2);
		userTest1.setName("老二");
		List<UserTest> list =new ArrayList<>();
		list.add(userTest);
		list.add(userTest1);
		boolean saveBatch = userServiceImpl.saveBatch(list);

		System.out.println(saveBatch);
		
	}
	
//	public List<UserTest> queryById(String name;Integer age) {
//		return userMapper.selectList(new );
//	}
}
