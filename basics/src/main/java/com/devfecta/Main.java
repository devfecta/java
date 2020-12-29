package com.devfecta;

import com.devfecta.arrays.ArrayExample;
import com.devfecta.arrays.CollectionExample;
import com.starwars.SwApi;

public class Main {
	
	public static void main( String[] args )
    {
		SwApi swapi = new SwApi();
		
		ArrayExample arrayExample = new ArrayExample(swapi);
		System.out.println("\r\r");
		CollectionExample collectionExample = new CollectionExample(swapi);
		
        
    }
}
