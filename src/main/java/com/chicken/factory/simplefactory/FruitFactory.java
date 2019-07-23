package com.chicken.factory.simplefactory;

/**
 * 简单工厂
 *
 * @author chickmen
 * @version 2018/9/18
 * @since 2018/9/18
 */
public class FruitFactory {

    public static IFruit getFruitByType(String type) {
        IFruit fruit = null;
        if("apple".equals(type)){
            fruit = new Apple();
        }else if("banana".equals(type)){
            fruit = new Banana();
        }else if("orange".equals(type)){
            fruit = new Banana();
        }
        return fruit;
    }
}
