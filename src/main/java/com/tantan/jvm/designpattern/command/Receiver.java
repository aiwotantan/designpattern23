package com.tantan.jvm.designpattern.command;

public class Receiver {

	//接受者：执行命令：自己响应
	public void action() {
		System.out.println("command received!");
	}
}
