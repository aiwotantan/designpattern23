package com.tantan.jvm.designpattern.factory.staticfactory;

import com.tantan.jvm.designpattern.factory.factory.Sender;

/**
 * 静态工厂模式
 * Description:将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 */
public class Test {
	
	public static void main(String[] args) {
		
		//静态对象直接调用方法
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}
