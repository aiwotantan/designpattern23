package com.tantan.jvm.designpattern.chainofresponsibility;

//主抽象类： 提供下级的节点引用
public abstract class AbstractHandler {

	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

}
