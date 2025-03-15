package com.tantan.jvm.designpattern.adapter.interfaceadapter;

//目标1类：只需要调用method1
public class SourceSub1 extends Wrapper2 {

	//自己只需method1:只为调用method1 不需要调用method2 ,所以不需要重写method2
	@Override
	public void method1() {
		
		System.out.println("SourceSub1:the sourceable interface's first Sub1!");  
	}
}
