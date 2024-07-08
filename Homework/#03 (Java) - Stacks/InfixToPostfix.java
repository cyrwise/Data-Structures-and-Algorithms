import java.util.Stack;

public class InfixToPostfix 
{
    // Method to determine the precedence of operators
    private int precedence(char ch) 
    {
        switch (ch) 
        {
            case '+':
            case '-':
                return 1; // Addition and subtraction have lower precedence
            case '*':
            case '/':
                return 2; // Multiplication and division have higher precedence
            case '^':
                return 3; // Exponentiation has the highest precedence
            default:
                return -1; // Return -1 for invalid operators
        }
    }

    // Method to convert infix expression to postfix
    public String convert(String infix) 
    {
        StringBuilder postfix = new StringBuilder(); // StringBuilder to store the postfix expression
        Stack<Character> stack = new Stack<>(); // Stack to store operators

        for (char ch : infix.toCharArray()) 
        {
            if (Character.isLetterOrDigit(ch)) 
            {
                // If the character is a letter or digit, add it to the postfix expression
                postfix.append(ch);
            } 
            else if (ch == '(') 
            {
                // If the character is an opening parenthesis, push it onto the stack
                stack.push(ch);
            } 
            else if (ch == ')') 
            {
                // If the character is a closing parenthesis, pop operators from the stack and add them to the postfix expression until an opening parenthesis is encountered
                while (!stack.isEmpty() && stack.peek() != '(') 
                {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != '(') 
                {
                    return "Invalid Expression"; // If there is no opening parenthesis, the expression is invalid
                } 
                else 
                {
                    stack.pop(); // Discards the '('
                }
            } 
            else 
            {
                // If the character is an operator, pop operators from the stack and add them to the postfix expression if their precedence is greater than or equal to the current operator
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) 
                {
                    postfix.append(stack.pop());
                }
                stack.push(ch); // Push the current operator onto the stack
            }
        }

        // After processing all characters, pop any remaining operators from the stack and add them to the postfix expression
        while (!stack.isEmpty()) 
        {
            postfix.append(stack.pop());
        }

        return postfix.toString(); // Return the postfix expression as a string
    }
}
