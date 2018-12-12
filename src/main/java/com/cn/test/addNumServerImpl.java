package com.cn.test;

import org.springframework.stereotype.Service;

import com.cn.server.AddNumServer;

@Service("wmcaddSUMServer")
public class addNumServerImpl implements AddNumServer{

	public String  sum(Integer a, Integer b, Integer c) {
		String string="亲爱的消费者，，，三位数相加的值："+(a+b+c);
		System.out.println("我是服务提供者，为你提供sum方法");
		return string;
	}

}
