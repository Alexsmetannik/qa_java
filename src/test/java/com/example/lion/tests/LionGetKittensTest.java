package com.example.lion.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensTest {

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(feline);
        var expectedGetKittens = 1;
        var result = feline.getKittens();
        Mockito.when(feline.getKittens()).thenReturn(expectedGetKittens);
        assertEquals("Count of lions is not correct", expectedGetKittens, lion.getKittens());
    }
}