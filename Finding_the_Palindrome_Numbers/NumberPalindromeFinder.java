
public class NumberPalindromeFinder {

	public static void main(String[] args) 
	{
		int[] palArray= {12, 32123, -737, 0, 2039458};
		for(int var : palArray)
		{
			System.out.println(isPalindrome(var));
		}
	}
	
	public static String isPalindrome(int x) {
        String int2String=Integer.toString(x);
        boolean bool = false;
        String reversed = "";
        for(int i =0; i<int2String.length(); i++)
        {
            reversed = int2String.charAt(i) + reversed;
        }
        
        if(reversed.equals(int2String))
        {
            bool = true;
        }
        return x + " is a palindrome: " + bool;
        
    }

}
