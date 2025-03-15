package com.tantan.jvm.designpattern.strategy;

//辅助类 ：策略类
public class AbstractCalculator {

	
	//调用父类的指定的方法：和模板方法模式有点类似
	//模板方法模式：在父类模板类中，执行抽象方法：实则调用子类的方法
	//策略模式：在子类中：调用父类的方法
	//子类会来调用这个方法：这个为公共的方法
	public int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
 