package com.tantan.jvm.designpattern.singleton;

//单例
public class Singleton {

	//初始化对象：只会初始化一次：static
	private static Singleton instance = new Singleton();  
	
	/* 私有构造方法，防止被实例化 */
	private Singleton() {
	}
	
	/* 静态工程方法，创建实例 */  
    public static Singleton getInstance() {  
        return instance;  
    } 
    
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return instance;  
    }
	
}
