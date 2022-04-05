package com.axonactive.design_pattern.abstract_factory;

public class PlasticFactory implements FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
