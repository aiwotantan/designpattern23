package com.tantan.jvm.designpattern.templatemethod;

//模板方法模式：顶层抽象类  ：模板类
public abstract class AbstractCalculator {

	
	//模板类：提供一些模板方法：子类无须再重写
	/* 主方法，实现对本类其它方法的调用 */
	public final int calculate(String exp, String opt) {
		
		System.out.println("AbstractCalculator");
		int array[] = split(exp, opt);
		
		//这个是，父类调用当前对象的方法： 
		//当子类调用这个方法时：此时的this为子类对象：所以这个是反向来调用子类中的重写方法
		
		
		//回旋踢：回过头来调用自己的方法：表面上是调自己的抽象方法：实则调用自己的方法
		return this.calculate(array[0], array[1]);
//		return calculate(array[0], array[1]);
	}

	
	//子类需要重写应用的这个方法即可
	/* 被子类重写的方法 */
	abstract public int calculate(int num1, int num2);

	
	
	//提供
	public int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
