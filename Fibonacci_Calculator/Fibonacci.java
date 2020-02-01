import java.util.Scanner;
/**
 * 
 * @author mjjtr
 *
 * this class calculates the fibonacci sequence up to a certain place specified by the user via raw input
 */
public class Fibonacci 
{
	
	public static void main(String[] args)
	{
		System.out.println("Up to what place would you like to calculate the Fibonacci Sequence?");
		Scanner scano =new Scanner(System.in);
		int place = scano.nextInt();
		
		
		
		
		fibFinder(place-1,0, 0, 1);
	}
	
	
	
	
	/**
	 * @param limit
	 * @param tripCount
	 * @param prev
	 * @param next
	 * 
	 * This is a recursive method that calls itself to find a fibonocci number up to a certain place
	 * this method keeps count by passing the count variable through as a param
	 */
	public static void fibFinder(int limit, int tripCount, int prev, int next)
	{
		if(limit != tripCount)
		{
			int result = prev + next;
			
			
            prev = next;
            next = result;
			
		
            tripCount++;
			
			
			fibFinder(limit, tripCount, prev, next);
		}
		else 
		{
			System.out.println("The Fibonacci Sequence to the " + limit + " place, goes to " + prev);
		}
	}
}
