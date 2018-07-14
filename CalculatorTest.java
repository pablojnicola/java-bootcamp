import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest{
	
	@Test
	public void testSum() {
		
		int result= Calculator.sum(8,2);
		int expectedResult=10 // 8 + 2 = 10
		assertEquals(expectedResult, result);		
		
	}
	
	@Test
	public void testRest() {
		
		int result= Calculator.rest(8,2);
		int expectedResult=6 // 8 - 2 = 6
		assertEquals(expectedResult, result);	
		
	}
	
}