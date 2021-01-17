/*1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных. (не справился)
 */
package ru.geekbrains.animals;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int distance);

    public void runOverTheLimits(int distance){
        System.out.printf("There is no way %s could have run %s meters\n", name, distance);
    }

    public void swimOverTheLimits(int distance){
        System.out.printf("There is no way %s could have swam %s meters\n", name, distance);
    }

    public abstract void swim(int distance);

}
