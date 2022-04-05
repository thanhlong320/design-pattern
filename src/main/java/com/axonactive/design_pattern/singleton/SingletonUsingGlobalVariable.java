package com.axonactive.design_pattern.singleton;

//DO NOT USE
//Break rule Encapsulation
public class SingletonUsingGlobalVariable {
    public static final SingletonUsingGlobalVariable INSTANCE = new SingletonUsingGlobalVariable();
    private SingletonUsingGlobalVariable(){}
}
