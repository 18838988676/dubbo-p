package com.cn;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:springmvc.xml");
		context.start();
		System.err.println("dubbo 提供者已经启动了。。。。。。。。。。。。。。");
		
		try {
			System.in.read();//按任意键退出。。。
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
