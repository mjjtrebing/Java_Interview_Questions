

public class SumsOf2
{
    public static void main(String[] args)
    {
        int[] array = {2, 9, 18, 5, 0, 3, 6 ,9};
        int target = 8;

        int[] result = twoSum(array, target);

        System.out.print("Array position [" + result[0] +", " + result[1] + "] equals " + target);
    }

    public static int[] twoSum(int[] nums, int target)
    {
        int[] targetSums = new int[2];
        int sum;
        for(int i=0; i<nums.length; i++)
        {
        	if(nums[i] <= target)//This if statement is here to cut down on trips through the array
        	{
        		for(int j=i+1; j<nums.length; j++)
        		{
        			if((nums[i] + nums[j]) == target)
        			{
        				targetSums[0] = i;
        				targetSums[1] = j;
        			}
        		}
        	}
        	else
        	{
        		i++;
        	}
        }
        return targetSums;
    }
}
