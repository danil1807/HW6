package ru.geekbrains.animals;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
    @Override
    public void run(int distance) {
        if (0 <= distance && distance <= 200) {
            System.out.printf("%s ran %s meters\n", name, distance);
        }else{
            runOverTheLimits(distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.printf("Cats can't swim, so %s didn't swim\n", name);
    }
}
