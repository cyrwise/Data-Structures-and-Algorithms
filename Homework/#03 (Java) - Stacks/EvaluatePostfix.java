import java.util.Stack;

public class EvaluatePostfix 
{
    // Method to evaluate a postfix expression
    public double evaluate(String postfix) 
    {
        // Initialize a Stack of Double to hold operands
        Stack<Double> stack = new Stack<>();

        // Iterate through each character in the postfix expression
        for (char ch : postfix.toCharArray()) 
        {
            // Check if the current character is a digit
            if (Character.isDigit(ch)) 
            {
                // Convert the character to its double value and push it onto the stack
                stack.push((double)(ch - '0')); // '0' is subtracted to convert char to double
            } 
            else 
            {
                // If the character is not a digit, it must be an operator
                // Pop two operands from the stack
                double val1 = stack.pop();
                double val2 = stack.pop();

                // Perform the operation based on the operator and push the result back onto the stack
                switch (ch) 
                {
                    case '+':
                        stack.push(val2 + val1); // Addition
                        break;
                    case '-':
                        stack.push(val2 - val1); // Subtraction
                        break;
                    case '*':
                        stack.push(val2 * val1); // Multiplication
                        break;
                    case '/':
                        stack.push(val2 / val1); // Division
                        break;
                }
            }
        }
        // After processing all characters, the final result is at the top of the stack
        return stack.pop(); // Return the result
    }
}
