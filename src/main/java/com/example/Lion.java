package com.example;

import java.util.List;

public class Lion extends Animal implements Predator{

    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }


    @Override
    public List<String> eatMeat() throws Exception {
        return null;
    }

    @Override
    public int getKittens(int kittensCount) {
        return getKittens(1);
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return getFood("Хищник");
    }
}