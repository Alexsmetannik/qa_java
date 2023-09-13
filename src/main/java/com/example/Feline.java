package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {


    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public int getKittens(int kittensCount) {
        return getKittens(1);
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }
}