package com.zp.loadclass;

import java.util.UUID;

/**
 * <h3>jvm</h3>
 * <p>类加载器的使用</p>
 *
 * @author : zp
 * @date : 2020-06-29 22:49
 **/
public class LoadClassDemo3 {
    public static void main(String[] args) {
        System.out.println(MyParent3.str);
    }
}

class MyParent3{
    public static final String str = UUID.randomUUID().toString();
    static {
        System.out.println("MyParent3 static code");
    }
}