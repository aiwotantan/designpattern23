package com.tantan.jvm.designpattern.mediator;

/**
 * 
 * Description:中介者模式
 * 
 * 中介者模式也是用来降低类类之间的耦合的，因为如果类类之间有依赖关系的话，
 * 不利于功能的拓展和维护，因为只要修改一个对象，其它关联的对象都得进行修改。
 * 如果使用中介者模式，只需关心和Mediator类的关系，具体类类之间的关系及调度交给Mediator就行，
 * 这有点像spring容器的作用
 * 
 * User类统一接口，User1和User2分别是不同的对象，二者之间有关联，
 * 如果不采用中介者模式，则需要二者相互持有引用，这样二者的耦合度很高，
 * 为了解耦，引入了Mediator类，提供统一接口，MyMediator为其实现类，
 * 里面持有User1和User2的实例，用来实现对User1和User2的控制。
 * 这样User1和User2两个对象相互独立，他们只需要保持好和Mediator之间的关系就行，
 * 剩下的全由MyMediator类来维护！
 * 
 */
public class Test {

	public static void main(String[] args) {
		
		//有参数的构造方法：在抽象类中：子类实现这个抽象类：则子类也应该要实现同等参数的构造方法
		
		Mediator mediator = new MyMediator();
		
		
		//创建意义上的中介者：同时也执行这个方法：创建两个对象
		mediator.createMediator();
		
		
		//user1和user2才是真正的目标对象
		//引入Mediator中介者对象：是为了降低User1和User2的耦合度
		//由这个中介者对象帮两个对象去执行这个方法
		mediator.workAll();
	}
}
