package com.tantan.jvm.designpattern.chainofresponsibility;

/**
 * 
 * Description:责任链模式
 * 
 * 此处强调一点就是，链接上的请求可以是一条链，可以是一个树，还可以是一个环，
 * 模式本身不约束这个，需要我们自己去实现，
 * 同时，在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给多个对象。
 * 
 * 
 * 类似于组合模式：结果为一个link链表:树形结构
 * 
 * 此外实现的代码结构方式不一样，但是基本一致
 * 
 */
public class Test {

	public static void main(String[] args) {
		
		MyHandler h1 = new MyHandler("h1");
		MyHandler h2 = new MyHandler("h2");
		MyHandler h3 = new MyHandler("h3");

		//设置：h1存有第二个节点引用
		h1.setHandler(h2);
		//h2节点二存有第三个节点
		h2.setHandler(h3);

		//节点一执行操作方法：此方法中可有执行遍历所有下级节点的操作：实现递归
		h1.operator();

	}
}
