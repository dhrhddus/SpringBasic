package com.simple.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SspringJUnit4ClassRunner;

import com.simple.test.mapper.TESTMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml.class")

public class MybatisTEST {

	//1. �������丮 �� ���� Ȯ��
	@Autowired
	SqlSessionFactoryBean sqlSessionFactory;
	
	//2.�������� ����
	@Autowired
	TESTMapper testMapper;
	
	
	@Test
	public void MybatisTest() {
		System.out.println("���̹�Ƽ�����丮��:" + sqlSessionFactory);
	}
	
}
