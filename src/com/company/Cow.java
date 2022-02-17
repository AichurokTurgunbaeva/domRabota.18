package com.company;

import java.util.Arrays;

public class Cow extends AbstractAnimal{
    public Cow() {
    }

    public Cow(double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Cow{}";
    }
}

