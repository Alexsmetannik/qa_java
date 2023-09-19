package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestLionEatMeat {

    @Test
    public void eatMeat() throws Exception  {
        var l = new Lion("Самка");
        l.eatMeat();
        System.out.println(l.eatMeat());
    }
}