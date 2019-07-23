package com.chicken.singleton.main;

import com.chicken.singleton.SingletonDemo3;

import java.lang.reflect.Constructor;

/**
 * 通过在单例中的私有构造函数增加判断并进行异常处理来防止反射破坏单例
 *
 * @author chickmen
 * @version 2018/9/18
 * @since 2018/9/18
 */
public class ReflectSingletonClient {
    public static void main(String[] args) throws Exception {
        SingletonDemo3 s1 = SingletonDemo3.getInstance();
        SingletonDemo3 s2 = SingletonDemo3.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        Constructor<SingletonDemo3> cs3 = SingletonDemo3.class.getDeclaredConstructor();
        cs3.setAccessible(true);
        SingletonDemo3 s3 = cs3.newInstance();
        System.out.println(s3);
    }

}
