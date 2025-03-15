package com.tantan.jvm.designpattern.memento;

//储存类
public class Storage {

	private Memento memento;
	
	//新建储存器：传入备忘录：用户储存备忘录中值
	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
