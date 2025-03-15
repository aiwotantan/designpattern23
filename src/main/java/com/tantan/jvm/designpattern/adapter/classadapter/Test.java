package com.tantan.jvm.designpattern.adapter.classadapter;

/**
 * 
 * Description:Adapter 适配器模式
 * 
 * 类适配器
 * 
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，
 * 目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里，
 */
public class Test {

	public static void main(String[] args) {
		
		//公共接口，包含method1 和method2 因为是多态，接口对象只会调用接口中的方法：但是内核是指定对象
		//adapter 只有method1
		Targetable target = new Adapter();
		
		//调用自己的
		target.method1();
		
		//调用父类的
		target.method2();
	}

}
