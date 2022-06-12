package com.geektach.testapp;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    Math math;

    @Before
    public void install() {
        math = new Math();
    }

    @Test
    public void simpleAddTest() {
        assertEquals("12", math.add("6", "6"));
    }

    @Test
    public void letterAddTest() {
        assertEquals("Буквы складывать нельзя", math.add("6", "a"));
    }

    @Test
    public void spaceAddTest() {
        assertEquals("C пробелами нельзя", math.add("12", " "));
    }

    @Test
    public void minusAddTest() {
        assertEquals("Отрицательное нельзя", math.add("12", "-6"));
    }

    @Test
    public void nullAddTest() {
        assertEquals("Поле не должно быть пустым", math.add("12", null));
    }

    @Test
    public void withDotAddTest() {
        assertEquals("18", math.add("12", "6.2"));  // домашка
    }





    @Test
    public void simpleDivisionTest() {
        assertEquals("1", math.division("4", "4"));
    }

    @Test
    public void spaceDivisionTest() {
        assertEquals("C пробелами нельзя", math.division("12", " "));
    }

    @Test
    public  void zeroDivisionTest() {
        assertEquals("На ноль делить нельзя", math.division("12", "0"));
    }

    @Test
    public void nullDivisionTest() {
        assertEquals("Поле не должно быть пустым", math.division("12", null));
    }

    @Test
    public void withDotDivisionTest() {
        assertEquals("Только целые числа", math.division("12", "6.2"));  // домашка
    }

    @Test
    public void minusDivisionTest() {
        assertEquals("Отрицательное нельзя", math.division("12", "-6"));
    }

    @After
    public void detach() {
        math = null;
    }
}
