package com.tantan.jvm.designpattern.visitor;

//核心主类：执行接收访问者：传递当前对象：在访问者中执行这个当前对象的方法：核心类：拒绝依赖
public class MySubject implements Subject {

	//接收访问者
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	
	//拒绝依赖：直接到访问者中去执行
	@Override
	public String getSubject() {

		return "love";
	}

}
