import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static int Experiment(int arraySize) 
    {
        Random random = new Random();

        // Create two arrays of arraySize (10^3, 10^4, etc)
        int[] array1 = new int[arraySize];
        int[] array2 = new int[arraySize];

        // Generate random 6 digit numbers for the arrays
        for (int i = 0; i < arraySize; i++) 
        {
            array1[i] = 100000 + random.nextInt(900000); 
            array2[i] = 100000 + random.nextInt(900000);
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        // Perform binary search and return the number of common values
        int commonValues = findCommonValuesCount(array1, array2);
        return commonValues;
    }

    // Method to find the number of common values using binary search
    private static int findCommonValuesCount(int[] array1, int[] array2) 
    {
        int count = 0;
        for (int value : array1) 
        {
            if (Arrays.binarySearch(array2, value) >= 0) 
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        // Read the user input and close it to reduce memory leakage
        try (Scanner input = new Scanner(System.in)) 
        {
            System.out.print("Enter the number of times to run the operation: ");
            
            int trials = input.nextInt(); 
    
            // Run the operation the specified number of times for each array size
            for (int size = 3; size <= 6; size++) 
            {
                int arraySize = (int) Math.pow(10, size);
                System.out.println("Size: 10^" + size);
                int sumOfCommonValues = 0;
                for (int i = 0; i < trials; i++) 
                {
                    int commonValues = Experiment(arraySize);
                    System.out.println("Number of common values: " + commonValues);
                    sumOfCommonValues += commonValues;
                }
                double average = (double) sumOfCommonValues / trials;
                System.out.println("Average number of common values: " + average);
                System.out.println();
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
