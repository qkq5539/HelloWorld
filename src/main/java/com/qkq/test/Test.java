package com.qkq.test;

/**
 * Created by Administrator on 2017/7/30.
 */
public class Test {
    public static void main(String... args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("张三");
        helloWorld.setAddress("南窑头");
        System.out.print(helloWorld.getAddress());
        System.out.print(helloWorld.getName());
    }
}
