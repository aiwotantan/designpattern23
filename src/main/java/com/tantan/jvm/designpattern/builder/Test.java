package com.tantan.jvm.designpattern.builder;

import com.tantan.jvm.designpattern.factory.factory.Sender;

/**
 * 建造者模式：是工厂模式+test的结合
 * Description:工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，
 * 用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。
 */
public class Test {

	public static void main(String[] args) {
		
		//传入指定数值：需要新建对象个数
		Builder builder = new Builder();
		
		//调用指定方法：建造指定对象
		builder.produceMailSender(10);
		
		for (Sender s : builder.getList()) {
			
			System.out.println(s);
		}
	}
}
