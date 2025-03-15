package com.tantan.jvm.designpattern.strategy;


//提供同意的方法:接口：和模板方法模式区别于，一个是用接口，一个是应抽象类。
//用户使用初始化接口，内核为指定逻辑对象，执行接口中的方法，实为执行内核对象中的方法。
public interface ICalculator {

	public int calculate(String exp);  
}
