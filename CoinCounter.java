//******************************************************************************************************************************************************************

//		CoinCounter.java

//		Wilson Cheung

//******************************************************************************************************************************************************************

import java.util.Scanner;

public class CoinCounter
{
	public static void main(String[] args)
	{
		double penny, nickel, dime, quarter, total;
		Scanner s = new Scanner(System.in);
		System.out.println("How many pennies were in the jar:");
		penny = s.nextDouble();
		System.out.println("How many nickels were in the jar:");
		nickel = s.nextDouble();
		System.out.println("How many dimes were in the jar:");
		dime = s.nextDouble();
		System.out.println("How many quarters were in the jar:");
		quarter = s.nextDouble();
		total = (penny/100) + (nickel/20) + (dime/10) + (quarter/4);
		System.out.println("With " + penny + " pennies, " + nickel + " nickels, " + dime + " dimes, and " + quarter + " quarters:");
		System.out.println("There were $" + total + " in the jar of coins");
	}
}