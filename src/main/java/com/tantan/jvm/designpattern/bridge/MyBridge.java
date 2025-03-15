package com.tantan.jvm.designpattern.bridge;

//自定义桥接类：
public class MyBridge extends Bridge {

	@Override
	public void method() {
	
		//重写：覆盖父类的方法：使用传入目标类执行核心方法
		//此前目标类已传入父类中
		getSource().method();
	}
}
