package com.tantan.jvm.designpattern.factory.factory;

/**普通工厂模式
 * 
 * Description:就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 */
public class Test {

	public static void main(String[] args) {
		
		/**
		 * 根据指令去匹配，获取指定对象
		 * 返回对象为一个多态行接口，内核为一个实现此多态接口的实现类
		 */
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.Send();
		
		Sender sender2 = factory.produce("mail");
		
		sender2.Send();
	}
}
