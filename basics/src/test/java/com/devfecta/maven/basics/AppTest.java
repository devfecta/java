package com.devfecta.maven.basics;

//import java.lang.reflect.Type;

import org.junit.jupiter.api.*;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.devfecta.arrays.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	static ArrayExample arrayExample = new ArrayExample();
	
	@BeforeAll
	public static void initial() {
		
	}

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
    	//System.out.println(arrayExample.characterName);
    	//assertEquals(arrayExample.characterName.getClass(), "String");
    }
}
