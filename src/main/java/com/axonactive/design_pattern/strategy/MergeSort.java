package com.axonactive.design_pattern.strategy;

import java.util.List;

public class MergeSort implements SortStrategy{
    @Override
    public void sort(List<String> items) {
        System.out.println("Merge sort");
    }
}
