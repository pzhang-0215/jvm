package com.zp.loadclass;

/**
 * <h3>jvm</h3>
 * <p>类加载器的使用</p>
 *  类加载器的使用
 * @author : zp
 * @date : 2020-06-29 12:42
 **/
public class LoadClassDemo {
    public static void main(String[] args) {
//        System.out.println(MyChild1.str);

        System.out.println(MyChild1.str2);
    }
}

class MyParent1{
    public static String str = "hello world";
    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1{
    public static String str2 = "welcome";
    static {
        System.out.println("MyChild1 static block");
    }
}