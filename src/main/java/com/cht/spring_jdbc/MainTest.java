package com.cht.spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cht.spring_jdbc.impl.CostDaoImpl;

public class MainTest {
	public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("/applicationContext.xml");
        CostDaoImpl daoImpl=(CostDaoImpl) context.getBean("costDaoImpl");
        System.out.println(daoImpl.find());
	}
}
