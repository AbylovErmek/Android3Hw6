package com.geektech.android3hw6;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    Math math;
    @Before
    public void setUp() {
        math = new Math();
        System.out.println("Before");
    }


    @Test
    public void add() {
        assertEquals(6,math.add(2,4));
        System.out.println("add test");
    }

    @Test
    public void subtract() {
        assertEquals(-2,math.sub(2,4));
        System.out.println("subtract test");
    }

    @Test
    public void multiply() {
        assertEquals(8,math.mult(2,4));
        System.out.println("multiply test");
    }

    @Test
    public void divide() {
        assertEquals(2,math.div(4,2));
        assertEquals(0,math.div(12,0));
        System.out.println("divide test");
    }
    @Test
    public void reverse(){
        String[] result = new String[]{"World","Hello","Hmm,"};
        assertEquals(result,math.reverseWords("Hmm, Hello World"));
        System.out.println("revers test");
    }
    @After
    public void tearDown() {
        System.out.println("After");
    }
}
