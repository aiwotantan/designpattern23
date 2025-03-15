package com.tantan.jvm.designpattern.facade;

//外观模式提供者：
public class Computer {

	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}

	public void startup() {
		System.out.println("start the computer!");
		
		//类似黑色测试：提供给外面一个大的功能，内部实现一些很多小的功能，整合起来
		
		//类似于map-reduce 分离聚合：旨在给外界提供功能，内部怎么实现，我们自己定
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("start computer finished!");
	}

	public void shutdown() {
		System.out.println("begin to close the computer!");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("computer closed!");
	}
}
