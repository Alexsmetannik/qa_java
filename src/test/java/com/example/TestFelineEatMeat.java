package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestFelineEatMeat {

    @Test
    public void eatMeat() throws Exception {
        var f = new Feline();
        String eatFood = String.join(", ", f.eatMeat());
        assertEquals("Животные, Птицы, Рыба", eatFood);
    }
}