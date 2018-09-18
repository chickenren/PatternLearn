package com.chicken.singleton;

import java.lang.reflect.Constructor;

/**
 * @author chickmen
 * @version 2018/9/18
 * @since 2018/9/18
 */
public class SingletonClient {
    public static void main(String[] args) throws Exception{
        SingletonDemo1 s1 = SingletonDemo1.getInstance();
        SingletonDemo1 s2 = SingletonDemo1.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        Constructor<SingletonDemo1> dc = SingletonDemo1.class.getDeclaredConstructor(null);
        dc.setAccessible(true);
        SingletonDemo1 s3 = dc.newInstance();
        System.out.println(s3);
    }
}
