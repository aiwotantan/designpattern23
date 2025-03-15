package com.tantan.jvm.designpattern.mediator;

//目标对象1
public class User2 extends User {

	public User2(Mediator mediator) {
		//调用父类的构造方法：返回这个中介者对象
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user2 exe!");
	}

}
