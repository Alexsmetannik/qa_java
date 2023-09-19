package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAnimalGetFood {

    protected Animal animal = new Animal();

    @Test
    public void getFood() throws Exception {
        animal.getFood("Травоядное");
        System.out.println(animal.getFood("Травоядное"));
    }
}