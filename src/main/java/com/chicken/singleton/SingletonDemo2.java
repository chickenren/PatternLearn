package com.chicken.singleton;

/**
 * 懒汉式
 * 线程安全 延迟加载
 * 效率低
 * @author chickmen
 * @version 2018/9/18
 * @since 2018/9/18
 */
public class SingletonDemo2 {
    private static SingletonDemo2 singletonDemo2;

    public static synchronized SingletonDemo2 getInstance() {
        if (singletonDemo2 == null) {
            singletonDemo2 = new SingletonDemo2();
        }
        return singletonDemo2;
    }

    private SingletonDemo2() {

    }
}
