package com.company;

import java.util.Arrays;
import java.util.Iterator;

public class MyCollection<T extends Comparable<T>> implements Iterable<T> {
    private T[] array;

    Integer count = 0;

    public MyCollection(T[] array){
        this.array = array;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
//                return array[++count] != null;
                return count != array.length;
            }

            @Override
            public T next() {
                return array[count++];
            }
        };
    }

    public T[] sort(){
//        T[] newArr = (T[]) new Object[this.array.length];
        T[] newArr = Arrays.copyOf(this.array, this.array.length);
        Arrays.sort(newArr, ((o1, o2) -> o1.compareTo(o2)));
        return newArr;
    }
}
