package Lab_Activity10Dec.Lab_Activity10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FibonacciSampleTest {
	static FibonacciSample fibonacci;

	@BeforeAll
	static void init()
	{
	 fibonacci =new FibonacciSample();
	}
	@Test
	void testNegative()
	{
		assertEquals(-1,-1);
	}

	@Test
	void testZero()
	{
		assertEquals(0,0);
	}
	
	@Test
	void testOneValue()
	{
		assertEquals(1,1);
	}
	
	@Test
	void testFibo()
	{
		assertEquals(10,10);
	}
}