package com.tantan.jvm.designpattern.factory.factory;

public class SmsSender implements Sender {

	@Override
	public void Send() {

		System.out.println("this is sms sender!");  
	}

}
