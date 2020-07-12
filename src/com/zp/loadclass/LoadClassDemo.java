package com.zp.loadclass;

/**
 * <h3>jvm</h3>
 * <p>类加载器的使用</p>
 * 对于静态字段来说，只有直接定义了该字段的类才会被初始化；eg:System.out.println(MyChild1.str);
 *  当一个类初始化时，要求其父类全部都已经被初始化了；eg：System.out.println(MyChild1.str2);
 * @author : zp
 * @date : 2020-06-29 12:42
 **/
public class LoadClassDemo {
    public static void main(String[] args) {
        System.out.println(MyChild1.str);
//        System.out.println(MyChild1.str2);
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