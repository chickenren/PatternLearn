package com.chicken.singleton;

public class SingletonDemo1 {
    private static SingletonDemo1 ourInstance = new SingletonDemo1();

    public static SingletonDemo1 getInstance() {
        return ourInstance;
    }

    private SingletonDemo1() {
    }
}
