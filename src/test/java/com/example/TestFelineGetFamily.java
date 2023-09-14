package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestFelineGetFamily {

    @Test
    public void getFamily() {
        var f = new Feline();
        f.getFamily();
    }
}