package com.chicken.singleton;

/**
 * 静态内部类
 * 延迟加载，线程安全，效率高
 * @author chickmen
 * @version 2018/9/18
 * @since 2018/9/18
 */
public class SingletonDemo3 {
    private static class SingletonStaticCls {
        private final static SingletonDemo3 s = new SingletonDemo3();
    }

    public static SingletonDemo3 getInstance() {
        return SingletonStaticCls.s;
    }

    private SingletonDemo3() {
        /**
         * 防止通过反射而破坏单例
         */
        if(SingletonStaticCls.s != null){
            throw new RuntimeException();
        }
    }

}
