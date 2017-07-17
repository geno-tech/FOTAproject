package com.spring.test1;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public class TestDAO extends SqlSessionDaoSupport{
	public int getCountTest(){
		return getSqlSession().selectOne("testSQL");
	}
}
