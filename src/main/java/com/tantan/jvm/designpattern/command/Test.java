package com.tantan.jvm.designpattern.command;

/**
 * 
 * Description: 命令模式
 * 
 * 命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分开
 */
public class Test {

	public static void main(String[] args) {

		//新建一个接受命令者
		Receiver receiver = new Receiver();
		
		//创建一个命令
		Command cmd = new MyCommand(receiver);
		
		//创建一个发送命令者
		Invoker invoker = new Invoker(cmd);
		
		//开始发送命令：命令去响应：接受者去执行
		invoker.action();
	}
}
