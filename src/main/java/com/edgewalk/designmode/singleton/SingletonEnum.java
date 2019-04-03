package com.edgewalk.designmode.singleton;

public enum SingletonEnum {
    INSTANCE;

    public void whateverMethod() {
        //Singleton.INSTANCE这个对象永远是单例的
    }
}