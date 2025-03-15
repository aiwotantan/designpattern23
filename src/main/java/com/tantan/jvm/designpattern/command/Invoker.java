package com.tantan.jvm.designpattern.command;


//司令：发送命令者
public class Invoker {

	private Command command;

	//把命令传入进来。
	public Invoker(Command command) {
		this.command = command;
	}
	
	//响应命令中的执行方法：命令中有执行方法
	public void action() {
		command.exe();
	}
}
