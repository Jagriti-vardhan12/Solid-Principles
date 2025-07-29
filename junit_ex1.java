package com.jv.ex;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals; // when checking the condition
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll; // it will run before all the test cases
import org.junit.jupiter.api.BeforeEach; //
import org.junit.jupiter.api.Disabled; //skip the test cases
import org.junit.jupiter.api.DisplayName; //it will display the name
import org.junit.jupiter.api.Test;

class add2Number
{
	int add2Num(int a,int b)
	{
		return a+b;
	}
}

class evenOrOdd
{
	public boolean isEven(int x)
	{
		return x%2==0;
	}
}

class junit_ex1 {

	@Test
	@DisplayName("this is a demo testcase")
	@Disabled // it skipped 
	
	void test() {
		System.out.println("hello good morning");
	}
	
	@Test
	@DisplayName(" assertEquals(actualValue, expectedValue) ")
	@Disabled
	void test2values()
	{
		int actualValue = 5;
		int expectedValues = 5;
		
		int unExpectedValue = 4;
		assertEquals(actualValue, expectedValues);
		assertNotEquals(unExpectedValue, actualValue);
		
	}
	
	@Test
	@DisplayName("class 2 add number")
	@Disabled
	void test2NumbersAdding()
	{
		add2Number add=new add2Number();
		int actualAddNumber =add.add2Num(2, 3);
		
		int expectedValues = 5;
		assertEquals(actualAddNumber, expectedValues);
		}
	@Test
	@DisplayName("asserTrue for Even or odd")
	@Disabled
	void checkEvenOrOdd()
	{
		evenOrOdd e=new evenOrOdd();
		
		assertTrue(e.isEven(4));
		assertFalse(e.isEven(7));
	}
//	@Test
//	@DisplayName("asserTrue for Even or odd")
//	void checkEvenOrOdd1()
//	{
//		evenOrOdd e=new evenOrOdd();
//		
//		assertTrue(e.isEven(4));
//		assertFalse(e.isEven(7));
//	}
//	
//	@Test
//	void testObjectCreation()
//	{
//		//String str=new String("hello");
//		//assertNotNull(str);
//		String str2="rk";
//		assertNull(str2);
//	}
	
	//testFixture
//	@BeforeAll // before all the 6 test cases
//	@BeforeEach //before each test cases
//	@AfterAll // after all the 6 test cases
//	@AfterEach //after each test cases
	
	@BeforeAll
	@Test
	@Disabled
	static void testObjectCreation2()
	{
		System.out.println("i m running all the 6 before test cases!");
	}
	
	@BeforeEach
	@Test
	@Disabled
    void testObjectCreation3()
	{
		System.out.println("before each test cases");
	}
	
	@AfterAll
	@Test
	@Disabled
	static void testObjectCreation4()
	{
		System.out.println("after all the 6  test cases");
	}
	
	@AfterEach
	@Test
	@Disabled
     void testObjectCreation5()
	{
		System.out.println("after each  test cases");
	}
	
	@Test
    @DisplayName(" xyz")
	@Disabled
    void testAllDetails()
    {
    	String name="jv";
    	int age=22;
    	String city="patna";
    	
    	assertAll("User details xyz",
    			
    			()->assertEquals("jv", name),
    			()->assertTrue(age>20),
    			()->assertNotNull(city));
    	}
	
	@Test
    @DisplayName(" 123")
    void testDivideByzero()
    {
    	assertThrows(Exception.class,
    			()->
    	{
    		int result=10/0;
    	}
    	);
    }	
}
