package com.tantan.jvm.designpattern.templatemethod;

//目标方法
public class Plus extends AbstractCalculator {

	@Override
	public int calculate(int num1, int num2) {

		System.out.println("Plus");
		return num1 + num2;  
	}

}
