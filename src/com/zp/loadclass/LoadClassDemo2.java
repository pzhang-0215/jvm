package com.zp.loadclass;

/**
 * <h3>jvm</h3>
 * <p>类加载器的使用</p>
 *
 * @author : zp
 * @date : 2020-06-29 20:46
 **/
public class LoadClassDemo2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.str);
    }
}

class MyParent2{
    public static final String str = "hello world";
    static {
        System.out.println("MyParent2 static block");
    }
}