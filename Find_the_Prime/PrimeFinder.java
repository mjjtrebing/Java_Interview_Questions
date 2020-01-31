import java.util.Scanner;
/**
 * @name: PrimeFinder.java
 * @author: Matthew Trebing
 *
 * The purpose of this program is to detect prime numbers
 * when executed you have 2 options, search if a single number is a prime number, or search a range 
 * of numbers to detect if there are prime numbers in that range.
 */



public class PrimeFinder
{


	public static void main (String args[])
	{
		Scanner scano = new Scanner(System.in);
		print(scano);
	}



	/**
	 * @param: Scanner object
	 *
	 * This message simply prints out the initial starting messages.
	 * This method also uses user input using the scanner class
	 */
	public static void print(Scanner optimusPrime) //Don't worry, Optimus Prime will find all the deceptive numbers
	{

		System.out.println("Enter the number of which you would like:");
		System.out.println("\n1  Would you like to search a range of numbers for prime numbers?");
		System.out.println("\n2  Would you like to test a single number for being a prime number\n");
		
		String choice = optimusPrime.next();
		
		if(choice.equals("1"))
		{
			rangeSearch(optimusPrime);
		}
		if(choice.equals("2"))
		{
			singleSearch(optimusPrime);
		}
		

	}


	/**
	 * @param:Scanner object
	 *
	 * This method searches a range of numbers for prime numbers. 
	 * This range is provided by the user input.
	 */
	public static void rangeSearch(Scanner optimusPrime)
	{
		System.out.print("what number do you want to start with: ");
		String strNumber = optimusPrime.next();
		int number1 = Integer.parseInt(strNumber);


		boolean prime = true;

		System.out.print("what number do you want to end with: ");
		strNumber = optimusPrime.next();
		int number2 = Integer.parseInt(strNumber);

		String primeList ="";

		for (int i = number1; i<number2; i++)
		{
			prime = true;
			for (int j=2; j<i-1; j++)
			{
				if ((i % j) == 0)
				{
					prime = false;
					j = i-1;
				}
			}

			if (prime)
			{

				primeList+=", " + i;
			}
		}

		System.out.print("\n\n" + primeList.substring(1, primeList.length()) + " are all the prime number between " + number1 + " and " + number2);

		
	}


	/**
	 * @param: Scanner Object
	 *
	 * This method searches a single number if it is a prime number and returns a false if it is not at prime which will print out a resulting message.
	 */
	public static void singleSearch(Scanner optimusPrime)
	{


		System.out.print("Please enter a number to test if it is a prime: ");

		boolean prime = true;
		String strNumber = optimusPrime.next();

		int number = Integer.parseInt(strNumber);

		for (int i=2; i<number-1; i++)
		{
			if ((number % i) == 0)
			{
				prime = false;
				i = number-1;
			}
		}
		
		if(prime)
		{
			System.out.print("\n" + number + " is a prime");

		}
		else
		{
			System.out.print("\n" + number + " is NOT a prime");
		}
	}






















}
