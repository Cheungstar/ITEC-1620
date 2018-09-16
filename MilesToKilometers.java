//******************************************************************************************************************************************************************

//		MilesToKilometers.java

//		Wilson Cheung

//******************************************************************************************************************************************************************

import java.util.Scanner;

public class MilesToKilometers
{
	public static void main(String[] args)
	{
		final double CONVERSIONRATE = 1.60935; //the conversion factor for miles into km
		double Miles, Km;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the distance in miles that should be converted into kilometers:");
		Miles = s.nextDouble(); //user enters a number
		Km = Miles * CONVERSIONRATE;
		System.out.println(Miles + " miles converted into kilomters is " + Km + "km.");
	}
}