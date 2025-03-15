package com.tantan.jvm.designpattern.factory.abstractfactory;

import com.tantan.jvm.designpattern.factory.factory.Sender;
import com.tantan.jvm.designpattern.factory.factory.SmsSender;

public class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {

		return new SmsSender();  
	}

}
