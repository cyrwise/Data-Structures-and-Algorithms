public class TernaryHeapSort 
{
    public void sort(int arr[]) 
    {
        int n = arr.length;

        // Build heap, which rearranges the array
        for (int i = n / 3 - 1; i >= 0; i--) 
        {
            heapification(arr, n, i);
        }
        // Extract an element from heap one by one
        for (int i = n - 1; i > 0; i--) 
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // call max heapify on the reduced heap
            heapification(arr, i, 0);
        }
    }

    // Heapify a subtree rooted at "i" which is an index in arr[] of size n
    void heapification(int arr[], int n, int i) 
    {
        int largest = i; // Initialize largest as root
        // Formulas for ternary heapsort
        int left = 3 * i + 1;
        int middle = 3 * i + 2;
        int right = 3 * i + 3;

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) 
        {
            largest = left;
        }

        // If middle child is larger than largest so far
        if (middle < n && arr[middle] > arr[largest]) 
        {
            largest = middle;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) 
        {
            largest = right;
        }

        // If largest is not root
        if (largest != i) 
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Recursively heapify the affected subtree
            heapification(arr, n, largest);
        }
    }

    // Print the array of size n
    static void printArray(int arr[]) 
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) 
    {
        // 100 distinct keys, kept from 1-100 for simplicity
        int arr[] = {8, 55, 62, 9, 19, 52, 5, 36, 12, 57, 34, 93, 46, 100, 65, 74, 91, 37, 10, 35, 6, 95, 86, 26, 75, 11, 98, 17, 51, 54, 97, 88, 31, 73, 58, 81, 56, 39, 30, 92, 89, 16, 41, 94, 7, 49, 22, 20, 99, 79, 40, 45, 90, 87, 60, 80, 44, 67, 15, 82, 47, 3, 25, 85, 76, 50, 18, 83, 72, 68, 69, 38, 66, 61, 29, 14, 59, 71, 1, 21, 42, 53, 13, 4, 27, 33, 77, 64, 96, 84, 70, 63, 23, 43, 2, 24, 28, 48, 32, 78};
        TernaryHeapSort ob = new TernaryHeapSort();
        ob.sort(arr);
        System.out.println("Sorted array is");
        printArray(arr);
    }
}
