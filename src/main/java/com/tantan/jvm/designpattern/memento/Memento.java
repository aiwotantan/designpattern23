package com.tantan.jvm.designpattern.memento;

//备忘录类
public class Memento {

	private String value;

	//传入值：备忘录已有值储存
	public Memento(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
