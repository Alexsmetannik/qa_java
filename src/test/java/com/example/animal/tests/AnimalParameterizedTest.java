package com.example.animal.tests;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

        private final String kindAnimal;
        private final List<String> food;

        public AnimalParameterizedTest(String kindAnimal, List<String> food) {
                this.kindAnimal = kindAnimal;
                this.food = food;
            }

        @Parameterized.Parameters
        public static Object[][] getAnimalParameters() {
            return new Object[][]{
                    {"Травоядное", List.of("Трава", "Различные растения")},
                    {"Хищник", List.of("Животные", "Птицы", "Рыба")},
            };
        }

        @Test
        public void getFood() throws Exception {
            Animal animal = new Animal();
            assertEquals("Food for animals is not correct", food, animal.getFood(kindAnimal));
        }
}