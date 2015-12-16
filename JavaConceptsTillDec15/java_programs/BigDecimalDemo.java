import java.math.*;
import java.lang.*;
import java.io.*;

public class BigDecimalDemo
{
	public static void main(String[] args)
	{
		BigDecimal myBigDecimal;
		double number = 10;
		double power = 2;
		int factor = 12;
		BigDecimal annualInterestInPercent = new BigDecimal("10");
		BigDecimal divisor = new BigDecimal("3");
		BigDecimal two = new BigDecimal("2");
		BigDecimal monthlyInterestInPercent = annualInterestInPercent.add(two).divide(divisor, 5, RoundingMode.CEILING);
		System.out.println("monthlyInterestInPercent is " + monthlyInterestInPercent);
	
		double value = Math.pow(number, power);
	//	monthlyInterestInPercent = monthlyInterestInPercent.multiply(Math.pow(annualInterestInPercent, two));
		
		BigDecimal myNumber = BigDecimal.valueOf(2*5);
		System.out.println("myNumber = "+myNumber);
	}
}
