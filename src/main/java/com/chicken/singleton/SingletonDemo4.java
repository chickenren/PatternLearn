package com.chicken.singleton;

/**
 * 枚举模式单例
 * 线程安全，效率高，无法通过反序列化破坏
 * 不能延迟加载
 * @author chickmen
 * @version 2018/9/18
 * @since 2018/9/18
 */
public enum SingletonDemo4 {
    INSTANCE;

    private SingletonDemo4() {

    }
}
