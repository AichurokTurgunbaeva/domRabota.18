package com.company;

import java.util.Arrays;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("Sheep at Farm-1: ");
        AbstractAnimal sheep1 = new Sheep(20, 5, "F", "Sugar Pie");
        AbstractAnimal sheep2 = new Sheep(21, 6, "M", "Mittens");
        AbstractAnimal sheep3 = new Sheep(22, 3, "F", "Vanilla");
        Sheep[] sheep5 = {(Sheep) sheep1, (Sheep) sheep2, (Sheep) sheep3};
        int counter = 0;
        for (Sheep a : sheep5) {
            if (a.getClass().getName().equals("com.company.Sheep")) {
                sheep5[counter] = (Sheep) a;
                counter++;
                System.out.println(a.getNickName() + " " + a.getAge() + " " + a.getGender() + " " +
                        a.getWeight() + " kg.");
            }
        }
        System.out.println("---------------------------");
        System.out.println("Sheep at Farm-2: ");
        AbstractAnimal sheep4 = new Sheep(23, 4, "M", "Sherbert");
        Sheep[] sheep6 = {(Sheep) sheep4};
        int counter1 = 0;
        for (Sheep b : sheep5) {
            if (b.getClass().getName().equals("com.company.Sheep")) {
                sheep5[counter1] = (Sheep) b;
                counter1++;
                System.out.println(b.getNickName() + " " + b.getAge() + " " + b.getGender() + " " +
                        b.getWeight() + " kg.");
            }
        }
        System.out.println("---------------------------");
        System.out.println("Cows at Farm-1: ");
        AbstractAnimal cow1 = new Cow(55.5, 2, "M", "Magic");
        AbstractAnimal cow2 = new Cow(75.4, 4, "F", "Betsie");
        AbstractAnimal cow3 = new Cow(68.6, 3, "M", "Bossy");
        AbstractAnimal cow4 = new Cow(44.8, 1, "F", "Daisy");
        AbstractAnimal cow5 = new Cow(38.7, 1, "M", "Nellie");
        Cow[] cows = {(Cow) cow1, (Cow) cow2, (Cow) cow3, (Cow) cow4, (Cow) cow5};
        int counter2 = 0;
        for (Cow c : cows) {
            if (c.getClass().getName().equals("com.company.Cow")) {
                cows[counter2] = (Cow) c;
                counter2++;
            }
            System.out.println(c.getNickName() + " " + c.getAge() + " " + c.getGender() + " " + c.getWeight() + " kg.");
        }
        System.out.println("---------------------------");
        System.out.println("Cows at Farm-2: ");
        AbstractAnimal cow6 = new Cow(64.1, 5, "F", "Onyx");
        Cow[] cows7 = {(Cow) cow6};
        int counter3 = 0;
        for (Cow d : cows) {
            if (d.getClass().getName().equals("com.company.Cow")) {
                cows[counter3] = (Cow) d;
                counter3++;
            }
            System.out.println(d.getNickName() + " " + d.getAge() + " " + d.getGender() + " " + d.getWeight() + " kg");
        }
        System.out.println("---------------------------");
        System.out.println("Horses at Farm-1: ");
        AbstractAnimal horse1 = new Horse(90.5, 5, "F", "Lilly", "White");
        AbstractAnimal horse2 = new Horse(100.6, 4, "M", "Alex", "Black");
        Horse[] horses = {(Horse) horse1, (Horse) horse2};
        int counter4 = 0;
        for (Horse e : horses) {
            if (e.getClass().getName().equals("com.company.Horse")) {
                horses[counter4] = (Horse) e;
                counter4++;
                System.out.println(e.getNickName() + " " + e.getAge() + " " + e.getColor() + " color " + e.getWeight() + " kg " +
                        e.getGender());
            }
        }
        System.out.println("---------------------------");
        System.out.println("Horses at Farm-2: ");
        AbstractAnimal horse3 = new Horse(89.4, 3, "F", "Luna", "Grey");
        Horse[] horses4 = {(Horse) horse3};
        int counter5 = 0;
        for (Horse f : horses) {
            if (f.getClass().getName().equals("com.company.Horse")) {
                horses[counter5] = (Horse) f;
                counter5++;
                System.out.println(f.getNickName() + " " + f.getAge() + " " + f.getColor() + " color " +
                        f.getWeight() + " kg " +
                        f.getGender());
            }
        }

        Farm farm1 = new Farm("Batken", cows, sheep5, horses, "Aichurok");

             System.out.println(farm1);

        Farm farm2 = new Farm("Chuy", cows7, sheep6, horses4, "Ulukbek");

             System.out.println(farm2);
    }
}

