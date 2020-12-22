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
	private Integer age;
	private String hobby;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
