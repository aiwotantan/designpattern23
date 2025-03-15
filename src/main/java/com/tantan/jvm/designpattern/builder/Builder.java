package com.tantan.jvm.designpattern.builder;

import com.tantan.jvm.designpattern.factory.factory.MailSender;
import com.tantan.jvm.designpattern.factory.factory.Sender;
import com.tantan.jvm.designpattern.factory.factory.SmsSender;

import java.util.ArrayList;
import java.util.List;

//建造者模式
public class Builder {

	private List<Sender> list = new ArrayList<Sender>();

	//建造指定的对象：mailSender :所需参数为个数：多少个
	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	//建造指定的对象：smsSender :所需参数为个数：多少个
	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}

	public List<Sender> getList() {
		return list;
	}

	public void setList(List<Sender> list) {
		this.list = list;
	}
	
	
}
