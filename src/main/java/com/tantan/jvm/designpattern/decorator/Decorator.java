package com.tantan.jvm.designpattern.decorator;

//装饰者
public class Decorator implements Sourceable {

	// 属性为目标类对象
	private Sourceable source;

	
	//需要把被装饰/加工  的对象传进来。  装饰工具类和 指定被装饰对象 
	//需要实现共同的接口，执行同一个方法，但是额外会执行一些装饰方法
	public Decorator(Sourceable source) {

		this.source = source;
	}

	@Override
	public void method() {

		//执行装饰方法：额外的内容
		System.out.println("before decorator!");
		
		//执行核心目标方法
		source.method();
		
		//执行装饰方法：额外的内容
		System.out.println("after decorator!");
	}

}
