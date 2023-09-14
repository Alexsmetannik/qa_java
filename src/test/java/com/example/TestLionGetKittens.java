package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestLionGetKittens {

    @Test
    public void getKittens() throws Exception {
        var l = new Lion("Самка");
        l.getKittens(1);
    }
}