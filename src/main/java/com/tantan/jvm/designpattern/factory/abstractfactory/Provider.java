package com.tantan.jvm.designpattern.factory.abstractfactory;

import com.tantan.jvm.designpattern.factory.factory.Sender;

//抽象工程模式
public interface Provider {

	public Sender produce();  
}
