package com.tantan.jvm.designpattern.strategy;

/**
 * 
 * Description:策略模式
 * 
 * 策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。
 * 因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 */
public class Test {

	public static void main(String[] args) {
		
		String exp = "2+8";
		ICalculator cal = new Plus();
		
		//决定权在用户：想执行什么方法就执行什么方法：主要看接口的内核
		//内核为执行加的方法：所以调用公共的方法为+
		
		//调用父类的指定的方法：和模板方法模式有点类似
		//模板方法模式：在父类模板类中，执行抽象方法：实则调用子类的方法
		//策略模式：在子类中：调用父类的方法
		int result = cal.calculate(exp);
		System.out.println(result);
	}
}
