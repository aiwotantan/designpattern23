package com.tantan.jvm.designpattern.adapter.classadapter;

//适配工具

/**
 *     访问权限   类   包  子类  其他包
 *     public     ∨   ∨   ∨     ∨
 *
 *     protect    ∨   ∨   ∨     ×
 *
 *     default    ∨   ∨   ×     ×
 *
 *     private    ∨   ×   ×     ×
 */
public class Adapter extends Source implements Targetable {  
	  
    @Override  
    public void method2() {

        this.method1();//不能继承private
        System.out.println("this is the targetable method!");  
    }  
}  