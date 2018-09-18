package com.chicken.factory.simplefactory;

/**
 * 简单工厂
 *
 * @author chickmen
 * @version 2018/9/18
 * @since 2018/9/18
 */
public class FruitFactory {

    public static IFruit getFruitByType(Class<? extends IFruit> cls) {
        IFruit iFruit = null;
        try {
            iFruit = cls.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iFruit;

    }
}
