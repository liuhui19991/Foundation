package com.liuhui.foundation;

/**
 * Created by liuhui on 2020/8/16.
 */
class Child extends Parent {
    static {
        System.out.println("static Child");
    }

    public Child(){
        System.out.println("init Child");
    }

    public void fun(){
        System.out.println("Child fun()");
    }
}
