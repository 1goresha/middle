package com.company;

public class Car implements Comparable<Car>{

    private String name;
    private int countOfWheels;
    private int price;
    private int weight;



    public Car(String name, int countOfWheels, int price, int weight) {
        this.name = name;
        this.countOfWheels = countOfWheels;
        this.price = price;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", countOfWheels=" + countOfWheels +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.price - o.price;
    }
}
