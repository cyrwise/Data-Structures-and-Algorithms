import edu.princeton.cs.algs4.StdOut;
import java.util.concurrent.TimeUnit;

public class FibonacciArray {

    // Dynamic Array created
    private static long[] fibCache = new long[2]; 

    public static long F(int N) 
    {

        if (N < 0) 
        {
            throw new IllegalArgumentException("Error: N cannot be negative");
        }

        // Makes a new array double the size of the old one and copies
        // values over if old one is full
        if (N >= fibCache.length) 
        {
            long[] newArray = new long[fibCache.length * 2];
            System.arraycopy(fibCache, 0, newArray, 0, fibCache.length);
            fibCache = newArray;
        }

        // Initializes the first two Fibonacci numbers if not already done
        if (N < 2) 
        {
            fibCache[N] = N;
        } 
        
        // Case for if the value is computed
        else if (fibCache[N] == 0) 
        {
            fibCache[N] = F(N - 1) + F(N - 2);
        }

        return fibCache[N];
    }

    public static void main(String[] args) 
    {
        for (int N = 0; N < 100; N++) {
            long startTime = System.nanoTime();
            long fib = F(N);
            long endTime = System.nanoTime();
            long durationInNanoSeconds = endTime - startTime;
            double durationInSeconds = TimeUnit.NANOSECONDS.toSeconds(durationInNanoSeconds);

            StdOut.println(N + " " + fib + " " + durationInSeconds + " seconds");
        }
    }
}
