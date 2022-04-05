package com.axonactive.design_pattern.abstract_factory;

public class WoodChair implements Chair{
    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}
