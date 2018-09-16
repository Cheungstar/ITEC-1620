import java.util.Scanner;

public class VowelCounter 
{
	public static void main(String[] args)
	{
		int aCount = 0, eCount = 0, iCount =0, oCount = 0, uCount = 0, yCount = 0, otherCount = 0;
		String input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string:");
		input = scan.nextLine();
		for (int count = 0; count < input.length(); count++)
		{
			char letter = input.charAt(count);
			if (letter == 'a')
				aCount++;
			else if (letter == 'e')
				eCount++;
			else if (letter == 'i')
				iCount++;
			else if (letter == 'o')
				oCount++;
			else if (letter == 'u')
				uCount++;
			else if (letter == 'y')
				yCount++;
			else
				otherCount++;
		}
		System.out.println("Number of each lowercase vowels in the string:");
		System.out.println("a: " + aCount);
		System.out.println("e: " + eCount);
		System.out.println("i: " + iCount);
		System.out.println("o: " + oCount);
		System.out.println("u: " + uCount);
		System.out.println("y: " + yCount);
		System.out.println("other: " + otherCount);
	}	
}
