package com.tantan.jvm.designpattern.bridge;

/**
 * 
 * Description: 桥接模式
 * 将抽象化与实现化解耦，使得二者可以独立变化
 * 
 * 使用抽象类,避免和接口太耦合
 * 
 * 降低抽象化 和实现话的耦合度
 * 
 * 
 * 就通过对Bridge类的调用，实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用
 * 
 *  
 * 区分抽象类和接口开来  ,提供一个桥梁给目标类去访问一些东西
 */
public class Test {

	public static void main(String[] args) {

		Bridge bridge = new MyBridge();

		/* 调用第一个对象 */
		Sourceable source1 = new SourceSub1();
		bridge.setSource(source1);
		bridge.method();

		/* 调用第二个对象 */
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source2);
		bridge.method();
	}
}
