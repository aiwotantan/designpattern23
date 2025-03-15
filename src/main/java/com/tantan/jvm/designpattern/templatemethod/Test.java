package com.tantan.jvm.designpattern.templatemethod;

/**
 * 
 * Description:
 * 
 *         策略模式和模板方法模式区别于，一个是用接口，一个是应抽象类。
 *         用户使用初始化接口，内核为指定逻辑对象，执行接口中的方法，实为执行内核对象中的方法。
 *         还有一点不同的时：（顶层模板类）父类中的方法：会被子类调用：且这个模板方法中会自己调用抽象方法
 *         但是功能会调用子类的方法。
 *         间接实现了：子类调用父类的模板方法：然后也调用了子类实现父类的抽象方法
 */
public class Test {

	public static void main(String[] args) {

		String exp = "8+8";

		AbstractCalculator cal = new Plus();

		
		//这个是，父类调用当前对象的方法： 
		//当子类调用这个方法时：此时的this为子类对象：所以这个是反向来调用子类中的重写方法
		//回旋踢：回过头来调用自己的方法：表面上是调自己的抽象方法：实则调用自己的方法
		
		//可以继承：但是不能够被重写
		int result = cal.calculate(exp, "\\+");

		System.out.println(result);

	}
}
