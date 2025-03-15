package com.tantan.jvm.designpattern.decorator;

//目标类
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("Source：the original method!");  
	}

}
