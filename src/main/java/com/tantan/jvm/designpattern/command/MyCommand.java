package com.tantan.jvm.designpattern.command;

public class MyCommand implements Command {

	private Receiver receiver;

	//传入士兵：接受者：使得这个命令可以被这个士兵去执行
	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	//命令的执行者
	@Override
	public void exe() {
		receiver.action();
	}

}
