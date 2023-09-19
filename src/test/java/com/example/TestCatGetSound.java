package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

//@RunWith(MockitoJUnitRunner.class)
public class TestCatGetSound {

   // @Mock
    protected Feline feline = new Feline();

    protected Cat cat = new Cat(feline);
    @Test
    public void getSound() {
        Assert.assertEquals("Мяу", cat.getSound());
        System.out.println(cat.getSound());
    }
}