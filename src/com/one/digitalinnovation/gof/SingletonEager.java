package com.one.digitalinnovation.gof;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    public SingletonEager() {
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
