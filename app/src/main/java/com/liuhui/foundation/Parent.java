package com.liuhui.foundation;

/**
 * Created by liuhui on 2020/8/16.
 */
class Parent {
    static{
        System.out.println("static Parent");
    }

    public Parent(){
        System.out.println("init Parent");
    }

    public void test(){
        fun();
    }

    private void fun() {
        System.out.println("Parent fun()");
    }
}
