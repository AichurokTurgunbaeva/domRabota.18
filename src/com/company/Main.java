package com.company;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {


    Sheep sheep1 = new Sheep(20,5,"F","Sugar Pie");
    Sheep sheep2 = new Sheep(21,6,"M","Mittens");
    Sheep sheep3 = new Sheep(22,3,"F","Vanilla");
    Sheep[] sheep5 = {sheep1, sheep2, sheep3};

    Sheep sheep4 = new Sheep(23,4,"M","Sherbert");
    Sheep[] sheep6 = {sheep4};

    Cow cow1 = new Cow (55,2,"M","Magic");
    Cow cow2 = new Cow(75,4,"F","Betsie");
    Cow cow3 = new Cow(68,3,"M","Bossy");
    Cow cow4 = new Cow(44,1,"F","Daisy");
    Cow cow5 = new Cow(38,1,"M","Nellie");
    Cow[] cows = {cow1, cow2, cow3, cow4, cow5};

    Cow cow6 = new Cow(64,5,"F","Onyx");
    Cow[] cows7 = {cow6};

    Horse horse1 = new Horse(90,5,"F","Lilly","White");
    Horse horse2 = new Horse(100,4,"M","Alex","Black");
    Horse[] horses = {horse1, horse2};

    Horse horse3 = new Horse(89,3,"F","Luna","Grey");
    Horse[] horses4 = {horse3};


    Farm farm1 = new Farm("Batken", cows, sheep5,  horses,"Aichurok");
    Farm farm2 = new Farm("Chuy", cows7,  sheep6,  horses4,"Ulukbek");
    
    }
}
