package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestLionDoesHaveMane {

    @Test
    public void doesHaveMane() throws Exception{
        var l = new Lion("Самка");
        l.doesHaveMane();
    }
}