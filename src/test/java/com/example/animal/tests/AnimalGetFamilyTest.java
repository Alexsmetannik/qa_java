package com.example.animal.tests;

import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalGetFamilyTest {

    @Test
    public void getFamily() throws Exception {
        Animal animal = new Animal();
        var expectedTextGetFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        var result = animal.getFamily();
        assertEquals("Family of animals is not correct",expectedTextGetFamily, result);
    }
}