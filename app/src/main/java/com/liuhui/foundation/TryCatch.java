package com.liuhui.foundation;


/**
 * 此问题返回值为10，return a的时候只是插入执行了finally中的代码，并不会对返回打包的数据产生影响
 * Created by liuhui on 2020/8/16.
 */
class TryCatch {
    public static void main(String[] args) {
        int a = test();
        System.out.println("a is:" + a);
    }

    public static int test() {
        int a = 0;
        try {
            a = 10;
            System.out.println("in the try");
//            throw new NullPointerException();
            return a;
        } catch (NullPointerException exception) {
            System.out.println("in the catch");
            a = 20;
            return a;
        } finally {
            System.out.println("in the finally");
            a = 30;
            System.out.println("sss");
        }
    }
}
