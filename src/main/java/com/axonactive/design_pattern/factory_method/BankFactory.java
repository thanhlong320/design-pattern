package com.axonactive.design_pattern.factory_method;

public class BankFactory {
    private BankFactory(){}

    public static Bank getBank(BankEnum bankEnum){
        switch (bankEnum){
            case TPBank:
                return new TPBank();
            case VietcomBank:
                return new VietcomBank();
            default:
                throw new IllegalArgumentException("This Bank enum is not supported");
        }
    }

}
