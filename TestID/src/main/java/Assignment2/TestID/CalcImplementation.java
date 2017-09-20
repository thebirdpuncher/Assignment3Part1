package Assignment2.TestID;

public class CalcImplementation 
{
	CalcInterface obj;
	int a, b;
	
	public int addition(int a, int b)
	{
		return obj.add(a, b);		
	}
	
	public int subtraction(int a, int b)
	{
		return obj.subtract(a, b);
	}
	
	public int multiplication(int a, int b)
	{
		return obj.multiply(a, b);
	}
	
	public double division(int a, int b)
	{
		return obj.divide(a, b);
	}
	
	public void setObj(CalcInterface obj)
	{
		this.obj = obj;
	}
}
