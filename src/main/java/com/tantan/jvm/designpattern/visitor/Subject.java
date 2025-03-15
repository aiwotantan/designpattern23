package com.tantan.jvm.designpattern.visitor;

public interface Subject {

	public void accept(Visitor visitor);

	public String getSubject();
}
