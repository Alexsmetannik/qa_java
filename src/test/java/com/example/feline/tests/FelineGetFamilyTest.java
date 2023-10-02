package com.example.feline.tests;

import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.*;

public class FelineGetFamilyTest {

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        var expectedTextGetFamily = "Кошачьи";
        var result = feline.getFamily();
        assertEquals("Family of felines is not correct", expectedTextGetFamily,result);
    }
}