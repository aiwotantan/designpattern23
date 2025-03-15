package com.tantan.jvm.designpattern.mediator;

//实现一个中介者
public class MyMediator implements Mediator {

	private User user1;
	private User user2;

	public User getUser1() {
		return user1;
	}

	public User getUser2() {
		return user2;
	}

	@Override
	public void createMediator() {

		//创建中介者：初始化两个对象：传入中介者当前对象：this
		user1 = new User1(this);
		user2 = new User2(this);

	}

	@Override
	public void workAll() {

		//所有初始化逻辑类都执行一个接口中的公共的方法
		user1.work();
		user2.work();
	}

}
