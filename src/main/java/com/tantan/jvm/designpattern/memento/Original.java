package com.tantan.jvm.designpattern.memento;

//起始类
public class Original {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
	//传入值：用户创建备忘录
	public Original(String value) {
		this.value = value;
	}

	//创建备忘录
	public Memento createMemento() {
		return new Memento(value);
	}

	//value值已修改：重新储存备忘录
	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}
}
