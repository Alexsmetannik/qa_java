package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestLionGetFood {

    @Test
    public void getFood() throws Exception {
        var l = new Lion("Самка");
        l.getFood();
        System.out.println(l.getFood());
    }
}