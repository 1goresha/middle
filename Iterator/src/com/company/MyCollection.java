package com.company;

import java.util.Iterator;

public class MyCollection implements Iterable<Integer> {
    private Integer[] array;

    Integer count = -1;

    public MyCollection(Integer[] array){
        this.array = array;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return array[++count] != null;
            }

            @Override
            public Integer next() {
                return array[count];
            }
        };
    }
}
