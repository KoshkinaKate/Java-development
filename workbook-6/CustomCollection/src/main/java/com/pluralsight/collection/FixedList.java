package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items= new ArrayList<>(); //initializing as an empty array list
    }

    public void add (T item){
        if (items.size() < maxSize){
            items.add(item);
        }else{
            System.out.println("Max is reached");
        }
    }
    public List<T> getItems() {
        return items;
    }
}
