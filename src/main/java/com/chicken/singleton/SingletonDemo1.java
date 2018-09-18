package com.chicken.singleton;

/**
 * 饿汉式单例
 *
 * 线程安全，效率高
 * 不能延迟加载
 *
 * @author chickmen
 * @author chickmen
 */
public class SingletonDemo1 {

    private static SingletonDemo1 ourInstance = new SingletonDemo1();

    public static SingletonDemo1 getInstance() {
        return ourInstance;
    }

    private SingletonDemo1() {
    }
}
