package com.axonactive.design_pattern.factory_method;

public class BankManagement {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankEnum.VietcomBank);
        String bankName = bank.getName();
        System.out.println(bankName);
    }
}
