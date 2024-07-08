import java.util.Scanner;

public class GridFillTester 
{
    public static void main(String[] args) 
    {
        // Define the number of rows and columns in the grid
        int rows = 15;
        int cols = 15;
        
        // Create a new instance of GridFill with the specified number of rows and columns
        GridFill gridFill = new GridFill(rows, cols);

        // Print the initial state of the grid
        System.out.println("Initial Grid:");
        gridFill.printGrid();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the row and column of the cell to flip
        
        System.out.print("Enter the row of the cell to flip: ");
        int row = scanner.nextInt();

        System.out.print("Enter the column of the cell to flip: ");
        int col = scanner.nextInt();

        // Check if the entered coordinates are within the grid bounds
        if (row >= 0 && row < rows && col >= 0 && col < cols) 
        {
            // If valid, print a message indicating the cluster is being flipped and call the flipCluster method
            System.out.println("\nFlipping cluster at (" + row + ", " + col + ")");
            gridFill.flipCluster(row, col);
        } 
        else 
        {
            // If invalid, print a message indicating the coordinates are invalid
            System.out.println("Invalid cell coordinates.");
        }

        // Print the grid after the flip operation
        System.out.println("\nGrid after flip:");
        gridFill.printGrid();
        
        // Close the scanner to release resources
        scanner.close();
    }
}

// OUTPUT SAMPLE 1:

// Initial Grid:
// 1 0 1 0 0 0 1 0 1 0 1 0 1 1 0 
// 0 1 1 1 0 1 0 0 0 1 0 0 0 1 1
// 1 1 0 0 0 0 1 1 1 1 0 1 1 1 1
// 0 1 0 0 0 0 1 0 0 0 1 0 1 0 0
// 0 0 1 0 0 0 1 1 0 0 0 1 0 0 0
// 1 0 1 0 0 1 0 1 1 0 1 1 1 0 1
// 0 0 1 1 1 1 0 1 1 0 1 0 0 0 0
// 0 0 1 0 1 0 0 1 1 0 1 1 1 0 1
// 0 1 1 1 1 0 1 1 1 1 1 0 1 0 0
// 0 0 1 1 1 0 1 1 1 1 0 0 0 1 0
// 1 1 1 1 1 1 1 0 0 0 0 1 1 0 1
// 1 1 0 1 0 1 1 1 1 1 0 0 0 0 0
// 1 0 0 1 0 0 0 0 1 1 0 0 0 1 1
// 1 1 1 1 0 0 0 1 1 1 0 0 1 0 0
// 1 0 1 1 0 1 1 0 1 0 1 0 1 1 0
// Enter the row of the cell to flip: 1
// Enter the column of the cell to flip: 1

// Flipping cluster at (1, 1)

// Grid after flip:
// 1 0 0 0 0 0 1 0 1 0 1 0 1 1 0
// 0 0 0 0 0 1 0 0 0 1 0 0 0 1 1
// 0 0 0 0 0 0 1 1 1 1 0 1 1 1 1
// 0 0 0 0 0 0 1 0 0 0 1 0 1 0 0
// 0 0 1 0 0 0 1 1 0 0 0 1 0 0 0
// 1 0 1 0 0 1 0 1 1 0 1 1 1 0 1
// 0 0 1 1 1 1 0 1 1 0 1 0 0 0 0
// 0 0 1 0 1 0 0 1 1 0 1 1 1 0 1
// 0 1 1 1 1 0 1 1 1 1 1 0 1 0 0
// 0 0 1 1 1 0 1 1 1 1 0 0 0 1 0
// 1 1 1 1 1 1 1 0 0 0 0 1 1 0 1 
// 1 1 0 1 0 1 1 1 1 1 0 0 0 0 0
// 1 0 0 1 0 0 0 0 1 1 0 0 0 1 1
// 1 1 1 1 0 0 0 1 1 1 0 0 1 0 0
// 1 0 1 1 0 1 1 0 1 0 1 0 1 1 0



// OUTPUT SAMPLE 2:

// Initial Grid:
// 0 1 1 1 1 0 0 1 1 0 1 1 0 0 1
// 0 1 1 0 1 1 1 1 0 0 1 1 1 1 1
// 1 0 1 1 1 1 0 0 1 0 0 0 0 0 1
// 0 1 1 0 0 0 0 1 1 0 1 1 0 0 1
// 1 1 1 1 0 0 0 0 0 1 1 0 0 1 0
// 0 0 0 1 1 0 1 0 0 0 0 1 0 1 0
// 0 1 0 0 0 1 1 0 1 0 1 0 0 0 1
// 0 0 1 1 1 0 0 1 0 0 1 0 0 0 0
// 1 1 0 0 1 0 0 1 1 1 0 1 1 0 1
// 1 1 0 1 0 1 0 1 0 1 0 0 0 0 1
// 0 0 1 0 1 1 1 1 0 1 1 0 0 1 0
// 0 0 1 1 0 0 1 1 1 1 0 0 0 1 0
// 1 1 1 0 0 1 0 1 1 1 0 1 1 1 1
// 1 1 0 1 0 0 1 0 0 1 1 1 1 1 0
// 1 0 0 0 0 1 1 0 0 1 0 0 1 1 0
// Enter the row of the cell to flip: 1
// Enter the column of the cell to flip: 1

// Flipping cluster at (1, 1)

// Grid after flip:
// 0 0 0 0 0 0 0 0 0 0 1 1 0 0 1
// 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1
// 1 0 0 0 0 0 0 0 1 0 0 0 0 0 1
// 0 0 0 0 0 0 0 1 1 0 1 1 0 0 1
// 0 0 0 0 0 0 0 0 0 1 1 0 0 1 0
// 0 0 0 0 0 0 1 0 0 0 0 1 0 1 0
// 0 1 0 0 0 1 1 0 1 0 1 0 0 0 1
// 0 0 1 1 1 0 0 1 0 0 1 0 0 0 0
// 1 1 0 0 1 0 0 1 1 1 0 1 1 0 1
// 1 1 0 1 0 1 0 1 0 1 0 0 0 0 1
// 0 0 1 0 1 1 1 1 0 1 1 0 0 1 0
// 0 0 1 1 0 0 1 1 1 1 0 0 0 1 0
// 1 1 1 0 0 1 0 1 1 1 0 1 1 1 1
// 1 1 0 1 0 0 1 0 0 1 1 1 1 1 0
// 1 0 0 0 0 1 1 0 0 1 0 0 1 1 0