package com.tantan.jvm.designpattern.chainofresponsibility;

//主接口
public interface Handler {
	
	//接口：提供,操作方法供节点使用
	public void operator();
}
