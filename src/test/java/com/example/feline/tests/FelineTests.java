package com.example.feline.tests;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.*;

public class FelineTests {

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        var expectedTextEatMeat = "[Животные, Птицы, Рыба]";
        var result = feline.eatMeat().toString();
        assertEquals("Food for felines is not correct", expectedTextEatMeat, result);
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        var expectedTextGetFamily = "Кошачьи";
        var result = feline.getFamily();
        assertEquals("Family of felines is not correct", expectedTextGetFamily,result);
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        var expectedGetKittens = 1;
        var result = feline.getKittens();
        assertEquals("Count of felines is not correct", expectedGetKittens, result);
    }
}