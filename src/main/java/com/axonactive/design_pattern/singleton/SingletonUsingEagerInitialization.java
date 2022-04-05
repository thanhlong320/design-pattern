package com.axonactive.design_pattern.singleton;

//DO NOT USE
//DEFECT: Always create INSTANCE 1 time
public class SingletonUsingEagerInitialization {
    private static final SingletonUsingEagerInitialization INSTANCE = new SingletonUsingEagerInitialization();
    private SingletonUsingEagerInitialization(){}
    public static SingletonUsingEagerInitialization getInstance(){
        return INSTANCE;
    }
}
