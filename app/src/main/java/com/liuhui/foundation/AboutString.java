package com.liuhui.foundation;

/**
 * Created by liuhui on 2020/8/16.
 */
class AboutString {
    public static void main(String[] args) {
//        test();
        for (int i = 0; i < 10; i++) {
            testRun();
            System.out.println("-------------------------------");
        }
    }

    /**
     * thread.run()会先执行完thread中run()的回调，然后才会执行下面的方法
     */
    private static void testRun() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("1");
            }
        };
        thread.run();
        System.out.println("2");
    }

    private static void test() {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str1 == str2);//true
        System.out.println(str3 == str4);//false
    }
}
