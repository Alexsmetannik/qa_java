package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

//@RunWith(MockitoJUnitRunner.class)
public class TestFelineEatMeat {

    //@Mock
    protected Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {

        String eatFood = String.join(", ", feline.eatMeat());
        assertEquals("Животные, Птицы, Рыба", eatFood);
        System.out.println(feline.eatMeat());

    }
}