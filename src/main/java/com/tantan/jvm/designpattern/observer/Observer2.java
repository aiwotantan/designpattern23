package com.tantan.jvm.designpattern.observer;

//观察者对象：实现公共的接口：在vector中循环执行这个方法
public class Observer2 implements Observer {

	@Override
	public void update() {
		
		System.out.println("observer2 has received!");  
	}

}
