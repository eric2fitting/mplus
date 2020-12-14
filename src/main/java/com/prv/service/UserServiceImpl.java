package com.prv.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.prv.dao.UserMapper;
import com.prv.pojo.UserTest;

/**
*
* @author eric
* @date 2020年12月2日  新建
*/

public class UserServiceImpl extends ServiceImpl<UserMapper, UserTest> implements UserService{

}
