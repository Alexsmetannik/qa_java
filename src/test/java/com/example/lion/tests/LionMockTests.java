package com.example.lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTests {

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

    @Test
    public void getKittens() {
        Lion lion = new Lion(feline);
        var expectedGetKittens = 1;
        var result = feline.getKittens();
        Mockito.when(result).thenReturn(expectedGetKittens);
        assertEquals("Count of lions is not correct", expectedGetKittens, lion.getKittens());
    }

    @Test
    public void sexException() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Null");
        });
        var expectedTextLionSexException = "Используйте допустимые значения пола животного - самей или самка";
        assertEquals("Unknown sex of lion", expectedTextLionSexException, exception.getMessage());
    }
}