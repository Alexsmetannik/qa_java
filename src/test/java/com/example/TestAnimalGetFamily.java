package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAnimalGetFamily {

    protected Animal animal = new Animal();

    @Test
    public void getFamily() {
        animal.getFamily();
        System.out.println(animal.getFamily());
    }
}