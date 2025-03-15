package com.tantan.jvm.designpattern.visitor;

public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {
		
		//收到核心类：执行核心类的方法：拒绝过渡依赖于核心类
		System.out.println("visit the subject："+sub.getSubject());  
	}

}
