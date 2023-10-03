package com.example.animal.tests;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalGetFoodTestException {
    @Test
    public void animalUnknownGetFoodTest() {

        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Animal animal = new Animal();
            animal.getFood("неизвестный");
        });
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());

    }
}
}
