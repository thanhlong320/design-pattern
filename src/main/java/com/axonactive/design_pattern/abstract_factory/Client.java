package com.axonactive.design_pattern.abstract_factory;

public class Client {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory1 = FurnitureFactory.getFactory(MaterialType.PLASTIC);
        Chair chair1 = factory1.createChair();
        chair1.create();
        Table table1 = factory1.createTable();
        table1.create();
        System.out.println("-----");
        FurnitureAbstractFactory factory2 = FurnitureFactory.getFactory(MaterialType.WOOD);
        Chair chair2 = factory2.createChair();
        chair2.create();
        Table table = factory2.createTable();
        table.create();
    }
}
