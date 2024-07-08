import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GridFill 
{
    private int[][] grid; // The grid representing the maze
    private int rows; // Number of rows in the grid
    private int cols; // Number of columns in the grid
    private List<int[]> flippedCells; // List to store the coordinates of flipped cells

    // Constructor for random grid generation
    public GridFill(int rows, int cols) 
    {
        this.rows = rows;
        this.cols = cols;
        this.flippedCells = new ArrayList<>();
        grid = new int[rows][cols];
        generateGrid(); // Generate a random grid
    }

    // Constructor for predefined grid
    public GridFill(int[][] predefinedGrid) 
    {
        this.rows = predefinedGrid.length;
        this.cols = predefinedGrid[0].length;
        this.flippedCells = new ArrayList<>();
        grid = new int[rows][cols];

        // Copy the predefined grid into the class's grid
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                grid[i][j] = predefinedGrid[i][j];
            }
        }
    }

    // Method to generate a random grid
    private void generateGrid() 
    {
        Random rand = new Random();
        // Fill the grid with random 0s and 1s
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) 
            {
                grid[i][j] = rand.nextInt(2); // Randomly assign 0 or 1
            }
        }
    }

    // Method to print the grid with highlighted flipped cells
    public void printGrid() 
    {
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                // Check if the current cell has been flipped
                if (isFlipped(i, j)) 
                {
                    // Print flipped cells with a highlighted background
                    System.out.print("\u001B[43m" + grid[i][j] + "\u001B[0m ");
                } 
                else 
                {
                    System.out.print(grid[i][j] + " ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Method to check if a cell has been flipped
    private boolean isFlipped(int row, int col) 
    {
        // Check if the cell is in the list of flipped cells
        for (int[] cell : flippedCells) {
            if (cell[0] == row && cell[1] == col) 
            {
                return true;
            }
        }
        return false;
    }

    // Method to flip a cluster of cells
    public void flipCluster(int row, int col) 
    {
        int targetValue = grid[row][col]; // The value to be flipped (0 or 1)
        int newValue = targetValue == 0 ? 1 : 0; // The new value after flipping
        flipClusterHelper(row, col, targetValue, newValue); // Start the flipping process
    }

    // Helper method for flipCluster to perform the actual flipping
    private void flipClusterHelper(int row, int col, int targetValue, int newValue) 
    {
        // Check if the current position is out of bounds or not matching the target value
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] != targetValue) 
        {
            return; // Return if the cell is invalid for flipping
        }
        grid[row][col] = newValue; // Flip the cell
        flippedCells.add(new int[]{row, col}); // Add the cell to the list of flipped cells
        // Recursively flip the neighboring cells
        flipClusterHelper(row - 1, col, targetValue, newValue); // Up
        flipClusterHelper(row + 1, col, targetValue, newValue); // Down
        flipClusterHelper(row, col - 1, targetValue, newValue); // Left
        flipClusterHelper(row, col + 1, targetValue, newValue); // Right
    }

    // Method to get the current grid
    public int[][] getGrid() { return grid; }
}
