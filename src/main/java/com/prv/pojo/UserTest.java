package com.prv.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
*
* @author eric
* @date 2020年11月4日  新建
*/
@TableName(value="user_test")
@Data
public class UserTest {
	private Long id;
	private String name;
	private String hobby;
	private Integer age2;	
}
