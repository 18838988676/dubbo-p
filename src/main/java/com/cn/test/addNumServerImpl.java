package com.cn.test;

import org.springframework.stereotype.Service;

import com.cn.server.AddNumServer;

@Service("wmcaddSUMServer")
public class addNumServerImpl implements AddNumServer{

	public String  sum(Integer a, Integer b, Integer c) {
		String string="�װ��������ߣ�������λ����ӵ�ֵ��"+(a+b+c);
		System.out.println("���Ƿ����ṩ�ߣ�Ϊ���ṩsum����");
		return string;
	}

}
