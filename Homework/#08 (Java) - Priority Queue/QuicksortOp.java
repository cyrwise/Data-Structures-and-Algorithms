import java.util.Random;
import java.util.Stack;

public class QuicksortOp 
{
    private static final int[] ARRAY_SIZES = {1000, 10000, 100000, 1000000}; // Array sizes 10^3 - 10^6
    private static final int MAX_M = 30; // Maximum M value at 30

    public static void main(String[] args) 
    {
        for (int arraySize : ARRAY_SIZES) 
        {
            double[] array = generateRandomArray(arraySize);
            for (int m = 0; m <= MAX_M; m++) 
            {
                long startTime = System.nanoTime();
                quickSortIterative(array, 0, array.length - 1, m);
                long endTime = System.nanoTime();
                double averageTime = (endTime - startTime) / 1000000.0; // convert to milliseconds
                System.out.printf("M: %d, Array Size: %d, Average Time: %.2f ms%n", m, arraySize, averageTime);
            }
        }
    }

    private static double[] generateRandomArray(int size) 
    {
        Random random = new Random();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) 
        {
            array[i] = random.nextDouble() * 1000; // Generate random doubles between 0 and 1000
        }
        return array;
    }

    private static void quickSortIterative(double[] a, int lo, int hi, int m) 
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(lo);
        stack.push(hi);

        while (!stack.isEmpty()) 
        {
            hi = stack.pop();
            lo = stack.pop();

            if (hi - lo < m) 
            {
                insertionSort(a, lo, hi);
            } 
            else 
            {
                int pivotIndex = getPivot(a, lo, hi);
                int[] partitionPoints = partition(a, lo, hi, pivotIndex);
                if (partitionPoints[0] - lo > hi - partitionPoints[1]) 
                {
                    stack.push(lo);
                    stack.push(partitionPoints[0] - 1);
                    stack.push(partitionPoints[1] + 1);
                    stack.push(hi);
                } 
                else 
                {
                    stack.push(partitionPoints[1] + 1);
                    stack.push(hi);
                    stack.push(lo);
                    stack.push(partitionPoints[0] - 1);
                }
            }
        }
    }

    private static int getPivot(double[] a, int lo, int hi) 
    {
        // pivot selection via median of three elements
        int mid = lo + (hi - lo) / 2;
        if (a[lo] > a[mid]) swap(a, lo, mid);
        if (a[lo] > a[hi]) swap(a, lo, hi);
        if (a[mid] > a[hi]) swap(a, mid, hi);
        return mid; // Return the median as the pivot
    }

    private static void insertionSort(double[] a, int lo, int hi) 
    {
        for (int i = lo + 1; i <= hi; i++) 
        {
            double key = a[i];
            int j = i - 1;
            while (j >= lo && a[j] > key) 
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    private static int[] partition(double[] a, int lo, int hi, int pivotIndex) 
    {
        double pivot = a[pivotIndex];
        int lt = lo, gt = hi;
        int i = lo;
        while (i <= gt) {
            if (a[i] < pivot) 
            {
                swap(a, lt++, i++);
            } 
            else if (a[i] > pivot) 
            {
                swap(a, i, gt--);
            } 
            else 
            {
                i++;
            }
        }
        return new int[]{lt, gt};
    }

    private static void swap(double[] a, int i, int j) 
    {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
