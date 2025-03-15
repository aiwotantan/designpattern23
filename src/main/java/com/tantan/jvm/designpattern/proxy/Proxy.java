package com.tantan.jvm.designpattern.proxy;

//代理工具
public class Proxy implements Sourceable {

	// 自定义：自初始化一个对象：只代理执行指定方法
	private Source source;

	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void method() {

		//代理中执行的额外方法
		before();
		
		//目标类核心实现方法
		source.method();
		
		//代理指定额外的方法
		after();
	}

	private void after() {
		System.out.println("after proxy!");
	}

	private void before() {
		System.out.println("before proxy!");
	}
}
