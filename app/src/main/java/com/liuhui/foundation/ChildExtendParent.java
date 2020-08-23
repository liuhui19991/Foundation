package com.liuhui.foundation;

/**
 * Created by liuhui on 2020/8/16.
 */
class ChildExtendParent {
    public static void main(String[] args) {
//        testChildExtendParent();
        testFun();
    }

    /**
     * 此题考查关键是父类fun()的修饰符
     * 如果是private则child.test()输出Parent fun()
     * 如果是public 则child.test()输出Child fun()
     */
    private static void testFun() {
        Child child = new Child();
        child.test();
        child.fun();
    }

    private static void testChildExtendParent() {
        Parent parent = new Child();
        parent = new Child();
    }
}
