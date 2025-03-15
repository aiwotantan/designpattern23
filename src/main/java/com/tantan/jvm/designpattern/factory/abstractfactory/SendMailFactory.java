package com.tantan.jvm.designpattern.factory.abstractfactory;

import com.tantan.jvm.designpattern.factory.factory.MailSender;
import com.tantan.jvm.designpattern.factory.factory.Sender;

public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();  
	}

}
