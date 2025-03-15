package com.tantan.jvm.designpattern.chainofresponsibility;

//节点类：继承主类：能获取下一个节点
public class MyHandler extends AbstractHandler implements Handler {

	private String name;

	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void operator() {
		System.out.println(name + "deal!");
		
		//获取下一个节点的handler ：若下一个节点不为null 则表示继续执行
		//依次类推,使用递归的方式,遍历link链式结构
		if (getHandler() != null) {
			getHandler().operator();
		}
	}
}
