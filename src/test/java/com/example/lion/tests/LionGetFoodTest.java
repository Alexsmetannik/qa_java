package com.example.lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodTest {

    @Mock
    Feline feline;

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(feline);
        List<String> listPredator = List.of("Животные, Птицы, Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(listPredator);
        List<String> result = lion.getFood();
        assertEquals("Food for lions is not correct", listPredator, result);
    }
}