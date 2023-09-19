package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.*;

//@RunWith(MockitoJUnitRunner.class)
public class TestCatGetFood {

   // @Mock
    protected Feline feline = new Feline();

    protected Cat cat = new Cat(feline);

    @Test
    public void getFood() throws Exception{
        /*
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "123"));

        cat.getFood();
        Mockito.verify(feline).eatMeat();
         */
        cat.getFood();
        System.out.println(cat.getFood());
    }
}