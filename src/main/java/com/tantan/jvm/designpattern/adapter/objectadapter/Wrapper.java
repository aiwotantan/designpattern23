package com.tantan.jvm.designpattern.adapter.objectadapter;

import com.tantan.jvm.designpattern.adapter.classadapter.Source;
import com.tantan.jvm.designpattern.adapter.classadapter.Targetable;

//适配工具
public class Wrapper implements Targetable {

	private Source source;

	//传入对象：匹配次对象的方法
	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {

		System.out.println("this is the targetable2 method!");
	}

}
