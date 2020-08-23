package com.liuhui.foundation;

/**
 * Created by liuhui on 2020/8/16.
 */
class ObjectAndConstant {
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

    /**
     * 输出结果为goodaAc
     */
    public static void main(String[] args) {
        ObjectAndConstant objectAndConstant = new ObjectAndConstant();
        objectAndConstant.change(objectAndConstant.str, objectAndConstant.ch);
        System.out.print(objectAndConstant.str);
        System.out.println(objectAndConstant.ch);
    }

    public void change(String str,char[] chars) {
        str = "better";
        ch[1] = 'A';
    }
}
