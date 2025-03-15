package com.tantan.jvm.designpattern.bridge;

//目标类1
public class SourceSub1 implements Sourceable {

	@Override
	public void method() {

		System.out.println("this is the first sub!");  
	}

}
