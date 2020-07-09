package com.zp.loadclass;

/**
 * <h3>jvm</h3>
 * <p>类加载器的使用</p>
 *
 * @author : zp
 * @date : 2020-06-29 22:59
 **/
public class LoadClassDemo4 {
    public static void main(String[] args) {
//        MyParent4 myParent4 = new MyParent4();
        MyParent4[] myParent4s = new MyParent4[1];
        System.out.println(myParent4s.getClass());

        MyParent4[][] myParent4s1 = new MyParent4[1][1];
        System.out.println(myParent4s1.getClass());
    }

}
class MyParent4{
    static {
        System.out.println("MyParent4 static block");
    }
}