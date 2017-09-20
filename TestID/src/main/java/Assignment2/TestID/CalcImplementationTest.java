package Assignment2.TestID;

import junit.framework.TestCase;


import org.mockito.*;


public class CalcImplementationTest extends TestCase 
{

	CalcImplementation testObj;
	int a;
	int b;
	
	protected void setUp() throws Exception 
	{
		a = 10;
		b = 5;
		testObj = new CalcImplementation();
		
		CalcInterface calk = mock(CalcInterface.class);
		when(calk.add(a, b)).thenReturn(a+b);
		when(calk.subtract(a, b)).thenReturn(a-b);
		when(calk.multiply(a, b)).thenReturn(a*b);
		when(calk.divide(a, b)).thenReturn((double) (a/b));
		
		testObj.setObj(calk);
	}

	protected void tearDown() throws Exception 
	{		
		testObj = null;
		a = 0;
		b = 0;
	}
	
	public void testAddition() 
	{
		assertEquals(15, testObj.addition(a, b));
	}
	
	public void testSubtraction()
	{
		assertEquals(5, testObj.subtraction(a, b));
	}
	
	public void testMultiplication()
	{
		assertEquals(50, testObj.multiplication(a, b));
	}
	
	public void testDivision()
	{
		assertEquals(2.0, testObj.division(a, b));
	}
	


}
