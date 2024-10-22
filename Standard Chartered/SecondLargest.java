//find 2nd largest element in array
import java.util.* ;
import java.io.*; 
public class SecondLargest 
{
    public static int findSecondLargest(int n, int[] arr) 
    {
        if (n < 2) return -1;

        // Initialize first and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) 
        {
          //compare number with largest and second largest
          //if >largest, assign it to largest
          //prev value of largest=secondlargest
            // Update largest and secondLargest accordingly
            if (arr[i] > largest) 
            {
                secondLargest = largest;
                largest = arr[i];
            } 
			//if largest>number>secondlargest assign it to secondlargest
            else if (arr[i] > secondLargest && arr[i] != largest) 
            {
                secondLargest = arr[i];
            }
        }
		//if all elements are equal,only first if will execute in 1st iteration only.

        // If secondLargest was not updated, return -1 (no distinct second largest element)
        if (secondLargest == Integer.MIN_VALUE) return -1;

        return secondLargest;
    }
}
