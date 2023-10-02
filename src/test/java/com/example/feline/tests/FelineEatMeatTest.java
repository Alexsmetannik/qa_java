package com.example.feline.tests;

import com.example.Animal;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.*;

public class FelineEatMeatTest {

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        var expectedTextEatMeat = "[Животные, Птицы, Рыба]";
        var result = feline.eatMeat().toString();
        assertEquals("Food for felines is not correct", expectedTextEatMeat, result);
    }
}