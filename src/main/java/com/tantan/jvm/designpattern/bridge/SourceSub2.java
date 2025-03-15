package com.tantan.jvm.designpattern.bridge;

//目标类2
public class SourceSub2 implements Sourceable {

	@Override
	public void method() {
		System.out.println("this is the second sub!");  
	}

}
