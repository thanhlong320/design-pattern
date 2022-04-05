package com.axonactive.design_pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class SortedItems {
    private SortStrategy sortStrategy;
    private List<String> items = new ArrayList<>();

    public void setSortStrategy(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }
    public void sort(){
        sortStrategy.sort(items);
    }
}
