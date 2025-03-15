package com.tantan.jvm.designpattern.strategy;

public class Plus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		
		//调用父类的指定的方法：和模板方法模式有点类似
		//模板方法模式：在父类模板类中，执行抽象方法：实则调用子类的方法
		//策略模式：在子类中：调用父类的方法
		int arrayInt[] = split(exp, "\\+");
		return arrayInt[0] + arrayInt[1];
	}

}
