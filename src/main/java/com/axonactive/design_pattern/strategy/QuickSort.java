package com.axonactive.design_pattern.strategy;

import java.util.List;

public class QuickSort implements SortStrategy{
    @Override
    public void sort(List<String> items) {
        System.out.println("Quick sort");
    }
}
