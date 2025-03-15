package com.tantan.jvm.designpattern.factory.factory;

public class MailSender implements Sender{

	@Override
	public void Send() {
		System.out.println("this is mail sender!");  
	}

}
