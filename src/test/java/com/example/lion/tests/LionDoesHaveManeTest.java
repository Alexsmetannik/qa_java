package com.example.lion.tests;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {

    private final String sex;
    private final Boolean result;

    public LionDoesHaveManeTest(String sex, Boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getLionParameters() {
        return new Object[][]{
                {"Самец",true},
                {"Самка",false}
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex);
        assertEquals("Info about mane is not correct", result, lion.doesHaveMane());
    }
}