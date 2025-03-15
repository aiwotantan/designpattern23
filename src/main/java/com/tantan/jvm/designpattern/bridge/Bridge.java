package com.tantan.jvm.designpattern.bridge;

/**
 * 
 * Description: 桥梁类
 *
 *         将抽象化与实现化解耦，使得二者可以独立变化
 * 
 *         使用抽象类,避免和接口太耦合
 * 
 *         降低抽象化 和实现话的耦合度
 */
public abstract class Bridge {

	private Sourceable source;

	// 根据目标类：执行目标制定的方法
	public void method() {
		source.method();
	}

	public Sourceable getSource() {
		return source;
	}

	// 传入目标类：
	public void setSource(Sourceable source) {
		this.source = source;
	}

}
