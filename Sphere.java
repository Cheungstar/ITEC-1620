//******************************************************************************************************************************************************************

//		Sphere.java

//		Wilson Cheung

//******************************************************************************************************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class Sphere
{
	public static void main(String[] args)
	{
		//Final float PI = 22/7 (used before learning about math.PI)
		double radius, volume, surfaceArea;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the radius of the sphere:");
		radius = s.nextDouble();
		volume = Math.PI * 4 / 3 * Math.pow(radius, 3);
		surfaceArea = 4 * Math.PI * Math.pow(radius, 3);
		//Round the decimals in the printed answer to 4 decimal places for the question stated
		DecimalFormat fmt = new DecimalFormat("0.####");
		System.out.println("The volume of the sphere is " + fmt.format(volume) + ".");
		System.out.println("The surface area of the sphere is " + fmt.format(surfaceArea) + ".");
	}
}