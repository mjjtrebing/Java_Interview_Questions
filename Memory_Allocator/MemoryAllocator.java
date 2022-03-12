import java.util.Scanner;

/**
 * 
 * @author mjjtr
 *
 *This interview question I encountered on 3/12/2022
 *I could not understand what the interview question was asking. It seemed that there were two inputs,
 *the first was an int that would indicate the size of the int array that came as the second input.
 *The second input was an array of inputs that ranged in value from negative to positive.
 *The constraints however seem to be that the numbers in the array must be 1 <= currentArrayPosition <= firstInputNumber.
 *This seems pretty straight forward however the examples as well as the "expected" output seem to disregard this constraint.
 *This is why I am coding this now shortly after this interview assessment, for myself.
 *
 *The reason this is called Memory Allocator is because that was the theme of the word problem.
 */
public class MemoryAllocator {
	
	/*
	 * SUGGESTED INPUT
	 * input1: 7
	 * input2: [4, 18, -9, 1, -44, 6, 0] 
	 */
	public static void main(String[] args) 
	{
		int finalOutput = 0;
		Scanner scano = new Scanner(System.in);
		System.out.print("First input: what is the size of the next array? \n");
		int sizeReq = scano.nextInt();
		System.out.println("please enter some value that enter between 1 and the number you previously entered.\n");
		int[] array = new int[sizeReq];
		for(int i= 0; i<sizeReq; i++ )
		{
			array[i] = scano.nextInt();
			System.out.print("\n");
			if(1 <= array[i] && array[i] <= sizeReq)
			{
				finalOutput += array[i];
			}
		}
		System.out.print("OUTPUT: " + finalOutput);
	}
	

}
