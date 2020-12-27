package com.devfecta.maven.basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.devfecta.maven.Basics;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	Basics app = new Basics();

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	assertTrue(true);
    }
    
    @Test
    public void displayArrayTest() {
    	assertEquals(app.displayArray(), "test");
    }
}
