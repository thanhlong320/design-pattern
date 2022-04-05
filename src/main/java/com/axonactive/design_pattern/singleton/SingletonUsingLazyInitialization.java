package com.axonactive.design_pattern.singleton;

//Best practice
public class SingletonUsingLazyInitialization {
    private static SingletonUsingLazyInitialization instance ;
    private SingletonUsingLazyInitialization(){}
    public static SingletonUsingLazyInitialization getInstance(){
        if(instance == null){
            return new SingletonUsingLazyInitialization();
        }
        return instance;
    }
}
