package com.prv.dao;

import java.util.Collection;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.prv.pojo.UserTest;

/**
*
* @author eric
* @date 2020年11月4日  新建
*/
public interface UserMapper extends BaseMapper<UserTest>{
	int insertBatch(@Param("items") Collection<UserTest> collections);
	int insertBatchSomeColumn(List<UserTest> entityList);
}
