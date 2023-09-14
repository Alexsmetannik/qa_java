package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestFelineGetKittens {

    @Test
    public void getKittens() {
        var f = new Feline();
        int kittensCount = f.getKittens(0);
        assertEquals(0, kittensCount);
    }
}