package com.chicken.factory.simplefactory;

/**
 * 简单工厂方法调用
 * @author chickmen
 * @version 2018/9/18
 * @since 2018/9/18
 */
public class FactoryClient {
    public static void main(String[] args) {
        String fruitType = "banana";
        IFruit apple = FruitFactory.getFruitByType(fruitType);
        apple.message();
    }
}
