package com.example.animal.tests;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalNotParameterizedTests {

    @Test
    public void getFamily() {
        Animal animal = new Animal();
        var expectedTextGetFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        var result = animal.getFamily();
        assertEquals("Family of animals is not correct",expectedTextGetFamily, result);
    }

    @Test
    public void getFoodException() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Animal animal = new Animal();
            animal.getFood("null");
        });
        var expectedTextGetFoodException = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        assertEquals("Unknown kind of animal", expectedTextGetFoodException, exception.getMessage());
    }
}