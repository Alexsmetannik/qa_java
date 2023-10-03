package com.example.lion.tests;


import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LionSexExceptionTest {

    @Test
    public void sexException() {

        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Null");
        });

        var expectedTextLionSexException = "Используйте допустимые значения пола животного - самей или самка";

        assertEquals("Unknown sex of lion", expectedTextLionSexException, exception.getMessage());
    }
}
