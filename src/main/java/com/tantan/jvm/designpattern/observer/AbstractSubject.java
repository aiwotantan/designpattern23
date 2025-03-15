package com.tantan.jvm.designpattern.observer;

import java.util.Enumeration;
import java.util.Vector;

//主类：为抽象方法
public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<Observer>();

	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}

	
	//观察者：核心方法：把所有观察者存于线程安全的vector中：获取元素时
	//循环，执行所有元素共同的方法,所以说，需要一个接口来提供一个公共的方法
	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumo = vector.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}

}
