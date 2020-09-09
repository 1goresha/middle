package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random r = new Random();

        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = r.nextInt(100);
        }

        MyCollection myCollection = new MyCollection(arr);

        for (Integer i :
                myCollection) {
            System.out.println(i);
        }
    }
}
