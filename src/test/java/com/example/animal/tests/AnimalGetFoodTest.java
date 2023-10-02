package com.example.animal.tests;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {

        private final String kindAnimal;
        private final String food;

        public AnimalGetFoodTest(String kindAnimal, String food) {
                this.kindAnimal = kindAnimal;
                this.food = food;
            }

        @Parameterized.Parameters
        public static Object[][] getAnimalParameters() {
            return new Object[][]{
                    {"Травоядное", List.of("Трава", "Различные растения").toString()},
                    {"Хищник",List.of("Животные", "Птицы", "Рыба").toString()},
            };
        }

        @Test
        public void getFood() throws Exception {
            Animal animal = new Animal();
            assertEquals("Food for animals is not correct", food, animal.getFood(kindAnimal).toString());
        }
}