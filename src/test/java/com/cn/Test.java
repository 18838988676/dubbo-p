package com.cn;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:springmvc.xml");
		context.start();
		System.err.println("dubbo �ṩ���Ѿ������ˡ���������������������������");
		
		try {
			System.in.read();//��������˳�������
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
