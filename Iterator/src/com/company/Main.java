package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Car[] arr = new Car[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomObject();
        }

        MyCollection<Car> myCollection = new MyCollection<>(arr);

        for (Car i :
                myCollection.sort()) {
            System.out.println(i);
        }

//        int a = 0;
//        int b = 0;
//        System.out.println(++a);
//        System.out.println(b++);

//        String s = "hello";
//        System.out.println(s.toUpperCase());
//
//        String s1 = "hi, how are you?";
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1);
//
//        System.out.println(s1.indexOf("how"));
    }

    public static Car getRandomObject(){
        Random r = new Random();

        String[] names = {"lada", "skoda", "mitsubishi", "renault", "peugeot", "mercedes benz", "alpha romeo", "BMW", "fiat", "audi"};
        String name = names[r.nextInt(names.length - 1)];
        int countOfWheel = 4;
        int price = r.nextInt(100000 - 10000) + 10000;
        int weight = r.nextInt(2000 - 1000) + 1000;

        return new Car(name, countOfWheel, price, weight);
    }
}
