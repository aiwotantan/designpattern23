package com.tantan.jvm.designpattern.state;

//状态目标：核心类
public class State {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
	//改变不同的值：执行不同的方法：
	//所以说：指定属性为任意值时：指向的方法都会在状态核心类中都实现出来。只需要根据这个状态/命令去执行
	public void method1() {
		System.out.println("execute the first opt!");
	}

	public void method2() {
		System.out.println("execute the second opt!");
	}
}
