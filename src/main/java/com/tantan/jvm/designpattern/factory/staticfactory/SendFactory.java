package com.tantan.jvm.designpattern.factory.staticfactory;

import com.tantan.jvm.designpattern.factory.factory.MailSender;
import com.tantan.jvm.designpattern.factory.factory.Sender;
import com.tantan.jvm.designpattern.factory.factory.SmsSender;

/**
 * 
 * Description:静态工厂方法模式
 * 
 */
public class SendFactory {
	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
}
