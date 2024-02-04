package main;

import main.clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 05), new Illness("Лишай")); //Создаём экземпляр класса

        Animal fish = new Animal("Немо", new Owner("Кирилл Иванович"),
                LocalDate.of(2022, 6, 17), new Illness("Амнезия"));

        Animal duck = new Animal("Скрудж", new Owner("Ирина Геннадьевна"),
                LocalDate.of(2020, 11, 27), new Illness("Ожирние"));

        System.out.println("Это пацент - Кот!");
        System.out.println("Имя пацента: " + cat.getNickName());
        System.out.println(cat.getOwner());
        System.out.println("Болезнь: " + cat.getIllness());
        cat.toGo(true);
        cat.fly (false);
        cat.swim(false);
        System.out.println("===============================");

        System.out.println("Это пацент - Рыбка!");
        System.out.println("Имя пацента: " + fish.getNickName());
        System.out.println(fish.getOwner());
        System.out.println("Болезнь: " + fish.getIllness());
        fish.toGo(false);
        fish.fly (false);
        fish.swim(true);
        System.out.println("===============================");

        System.out.println("Это пацент - Утка!");
        System.out.println("Имя пацента: " + duck.getNickName());
        System.out.println(duck.getOwner());
        System.out.println("Болезнь: " + duck.getIllness());
        duck.toGo(true);
        duck.fly (true);
        duck.swim(true);
        System.out.println("===============================");

//        System.out.println(cat.getNickName());
//        cat.setIllness(new Illness(null));
//        System.out.println("Болезнь:" + cat.getIllness());


        Animal testAnimal = new Animal();
        System.out.println(testAnimal.getNickName());

        cat.lifeCycle();

        Animal catty = new Cat();
        Animal doggie = new Dog();
        Dog goodBoy = new Dog();

        System.out.println(doggie.getType());
        System.out.println(catty.getType());

        System.out.println(catty);

        Cat.meow();

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(catty);
        animals.add(goodBoy);
        animals.add(cat);

        int i = 0;
        for (Animal animal : animals){
            System.out.println(i + " "+ animal);
            i++;
        }

    }
}