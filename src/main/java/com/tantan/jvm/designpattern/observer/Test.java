package com.tantan.jvm.designpattern.observer;

/**
 * 
 * Description:观察者模式
 * 
 * ：MySubject类就是我们的主对象，Observer1和Observer2是依赖于MySubject的对象，
 * 当MySubject变化时，Observer1和Observer2必然变化。AbstractSubject类中定义着需要监控的对象列表，
 * 可以对其进行修改：增加或删除被监控对象，且当MySubject变化时，负责通知在列表内存在的对象。
 * 
 * 
 * 观察者对象存于主对象的vector中：线程安全：synchronize 
 * 核心方式实现循环该vector,且调用各自的公共方法，此方法来源于一个接口
 * 
 * 
 * 
 * 有链式结构的思想：上级节点受到影响，下级节点必须改变。比如根节点和子节点之间的变化
 */
public class Test {

	public static void main(String[] args) {
		
		//多态接口,初始化内核对象为主对象
		Subject sub = new MySubject();
		
		//添加观察者值主方法的vector中
		sub.add(new Observer1());
		sub.add(new Observer2());

		//执行操作：逻辑方法
		sub.operation();
	}
}
