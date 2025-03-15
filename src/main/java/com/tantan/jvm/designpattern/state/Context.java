package com.tantan.jvm.designpattern.state;

//逻辑处理类：状态模式的切换类 
public class Context {

	private State state;

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	//状态核心类值判断，执行不同的方法时：所有的逻辑处理都在这个里面执行。：这个method是
	public void method() {
		if (state.getValue().equals("state1")) {
			state.method1();
		} else if (state.getValue().equals("state2")) {
			state.method2();
		}
	}
}
