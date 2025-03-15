package com.tantan.jvm.designpattern.state;

/**
 * 
 * Description:状态模式
 * 
 * 类似于link 链式结构：有级联关系：一个改变,其他都改变
 * 
 * 状态模式就两点：1、可以通过改变状态来获得不同的行为。2、你的好友能同时看到你的变化。
 * 
 * 就是说：　一个类的属性改变时：也会执行不同的方法
 * 
 * 
 * 根据这个特性，状态模式在日常开发中用的挺多的，尤其是做网站的时候，我们有时希望根据对象的某一属性，
 * 区别开他们的一些功能，比如说简单的权限控制等。
 */
public class Test {

	public static void main(String[] args) {

		State state = new State();
		Context context = new Context(state);

		
		//改变不同的值：执行不同的方法：
		//所以说：指定属性为任意值时：指向的方法都会在状态核心类中都实现出来。只需要根据这个状态/命令去执行
		
		//所有状态指定的值都会在核心类中实现
		
		// 设置第一种状态
		state.setValue("state1");
		
		//状态模式的切换类 执行指定的方法：这个只有一个,但是决定指定哪一个：由这个来决定
		context.method();

		// 设置第二种状态
		state.setValue("state2");
		context.method();
	}
}
