package com.example.cat.tests;

import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatGetSoundTest {

    @Mock
    Feline feline;

    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        var expectedGetSound = "Мяу";
        var result = cat.getSound();
        assertEquals("Sound by cats is not correct", expectedGetSound, result);
    }
}