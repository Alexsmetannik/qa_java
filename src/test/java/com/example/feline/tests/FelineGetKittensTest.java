package com.example.feline.tests;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.*;

public class FelineGetKittensTest {

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        var expectedGetKittens = 1;
        var result = feline.getKittens();
        assertEquals("Count of felines is not correct",expectedGetKittens, result);
    }
}