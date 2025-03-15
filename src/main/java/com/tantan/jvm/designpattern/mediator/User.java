package com.tantan.jvm.designpattern.mediator;

public abstract class User {

	private Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}

	//有参数的构造方法：在抽象类中：子类实现这个抽象类：则子类也应该要实现同等参数的构造方法
	public User(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void work();

}
