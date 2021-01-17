package ru.geekbrains.animals;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= 500) {
                System.out.printf("%s ran %s meters\n", name, distance);
        }else{
            runOverTheLimits(distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance >= 0 && distance <= 10) {
            System.out.printf("%s swam %s meters\n", name, distance);
        }else{
            swimOverTheLimits(distance);
        }
    }


}
