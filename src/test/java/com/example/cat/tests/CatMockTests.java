package com.example.cat.tests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTests {

    @Mock
    Feline feline;

    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> listPredator = List.of("Животные, Птицы, Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(listPredator);
        List<String> result = cat.getFood();
        assertEquals("Food for cats is not correct", listPredator, result);
    }

    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        var expectedGetSound = "Мяу";
        var result = cat.getSound();
        assertEquals("Sound by cats is not correct", expectedGetSound, result);
    }
}