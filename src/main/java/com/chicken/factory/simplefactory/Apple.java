package com.chicken.factory.simplefactory;

/**
 * @author chickmen
 * @version 2018/9/18
 * @since 2018/9/18
 */
public class Apple implements IFruit {
    @Override
    public void message() {
        System.out.println("大家好，我是苹果");
    }
}
