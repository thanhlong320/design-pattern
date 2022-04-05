package com.axonactive.design_pattern.strategy;

public class Main {
    public static void main(String[] args) {
        SortedItems sortedItems = new SortedItems();
        sortedItems.setSortStrategy(new QuickSort());
        sortedItems.sort();
        System.out.println("-----");
        sortedItems.setSortStrategy(new MergeSort());
        sortedItems.sort();
    }
}
