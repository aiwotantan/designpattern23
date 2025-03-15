package com.tantan.jvm.designpattern.flyweight;

/**
 * 
 * Description:享元模式
 * 
 * 
 * 享元模式的主要目的是实现对象的共享，即共享池，
 * 当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。
 * 
 */
public class Test {

	
	public static void main(String[] args) {
		
		//FlyWeightFactory负责创建和管理享元单元，当一个客户端请求时，
		//工厂需要检查当前对象池中是否有符合条件的对象，如果有，就返回已经存在的对象，如果没有，则创建一个新对象，FlyWeight是超类。
		
	}
}
