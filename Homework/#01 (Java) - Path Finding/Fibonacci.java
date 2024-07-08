import edu.princeton.cs.algs4.StdOut;
import java.util.concurrent.TimeUnit;

public class Fibonacci 
{
    public static long F(int N) 
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }

    public static void main(String[] args) 
    {
        for (int N = 0; N < 100; N++) 
        {

            // Time calculation for each interval
            // so we can see when an hour has passed
            long startTime = System.nanoTime();
            long fib = F(N);
            long endTime = System.nanoTime();
            long durationInNanoSeconds = endTime - startTime;
            double durationInSeconds = TimeUnit.NANOSECONDS.toSeconds(durationInNanoSeconds);

            StdOut.println(N + " " + fib + " " + durationInSeconds + " seconds");
        }
    }
}
