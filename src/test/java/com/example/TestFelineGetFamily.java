package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestFelineGetFamily {

    protected Feline feline = new Feline();

    @Test
    public void getFamily() {
        feline.getFamily();
        System.out.println(feline.getFamily());
    }
}