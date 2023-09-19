package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestFelineGetKittens {

    protected Feline feline = new Feline();

    @Test
    public void getKittens() {
        int kittensCount = feline.getKittens(1);
        assertEquals(1, kittensCount);
        System.out.println(feline.getKittens(1));
    }
}