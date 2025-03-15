package com.tantan.jvm.designpattern.memento;

/**
 * 
 * Description:备忘录模式
 * 
 * 新建原始类时，value被初始化为egg，后经过修改，将value的值置为niu，
 * 最后倒数第二行进行恢复状态，结果成功恢复了。 “备份-恢复”模式 最形象
 * 
 * 
 * Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，
 * 用来保存value值。Memento类是备忘录类，Storage类是存储备忘录的类，
 * 持有Memento类的实例
 * 
 * 用一个类来储存上次所传对象值：等需要的时候，再把它拿出来使用：更新值和对象
 * 
 * 
 * 类似于link链式结构：有级联的关系。。
 */
public class Test {

	public static void main(String[] args) {
		// 创建原始类
		Original origi = new Original("egg");

		// 创建备忘录
		Storage storage = new Storage(origi.createMemento());

		// 修改原始类的状态
		System.out.println("初始化状态为：" + origi.getValue());
		
		//重新建立值
		origi.setValue("niu");
		System.out.println("修改后的状态为：" + origi.getValue());

		// 回复原始类的状态
		
		//重新新建备忘录类：重新储存值：更新对象  
		
		//获取旧备忘录中的值：获取旧值 ：重新储存旧值
		origi.restoreMemento(storage.getMemento());
		
		//输出旧值
		System.out.println("恢复后的状态为：" + origi.getValue());
	}
}
