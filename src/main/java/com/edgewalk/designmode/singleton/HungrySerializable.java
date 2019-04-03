package com.edgewalk.designmode.singleton;

import java.io.Serializable;

class HungrySerializable implements Serializable {
    private static HungrySerializable instance = new HungrySerializable();

    // 私有化构造方法,其他类不能访问构造方法,也就不能Singleton s = new HungrySerializable()了
    private HungrySerializable() {
    }

    // 对外提供一个公共访问的接口,调用方法时,就给你返回一个本类的对象
    public static HungrySerializable getInstance() {
        return instance;
    }

    public Object readResolve() {
        return instance;
    }

}