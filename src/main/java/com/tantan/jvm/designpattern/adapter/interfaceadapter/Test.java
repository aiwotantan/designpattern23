package com.tantan.jvm.designpattern.adapter.interfaceadapter;

/**
 * 
 * Description:Adapter 适配器模式
 * 
 * 接口适配器
 * 
 * 接口的适配器是这样的：有时我们写的一个接口中有多个抽象方法，
 * 当我们写该接口的实现类时，必须实现该接口的所有方法，这明显有时比较浪费，
 * 因为并不是所有的方法都是我们需要的，有时只需要某一些
 */
public class Test {

	public static void main(String[] args) {

		//旨在目标类，调用指定的方法，实现接口：无须全部实现：  由上级父类去实现全部接口方法：
		//子类1 和子类2 复写：覆盖：指定自己所需要的方法：然后可以调用，并依次调用自己所需的方法执行
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();

		
		//父级类：只实现自己需要的方法：重写父类的方法：为覆盖
		source1.method1();
		source1.method2();
		
		source2.method1();
		source2.method2();
	}
}
