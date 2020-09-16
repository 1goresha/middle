package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random r = new Random();

        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        MyCollection myCollection = new MyCollection(arr);

        for (Integer i :
                myCollection) {
            System.out.println(i);
        }

//        int a = 0;
//        int b = 0;
//        System.out.println(++a);
//        System.out.println(b++);

        String s = "hello";
        System.out.println(s.toUpperCase());

        String s1 = "hi, how are you?";
        System.out.println(s1.toUpperCase());
        System.out.println(s1);

        System.out.println(s1.indexOf("how"));
    }
}
