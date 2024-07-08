public class ArithmeticExpressionEvaluator 
{
    // The main method is the entry point of the program
    public static void main(String[] args) 
    {
        // Define an infix expression as a string
        String infix = "2*(2+2)-2/5";
        
        // Create an instance of the InfixToPostfix class
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        
        // Convert the infix expression to a postfix expression
        String postfix = infixToPostfix.convert(infix);
        
        // Print the original infix expression
        System.out.println("Infix expression: " + infix);
        
        // Print the converted postfix expression
        System.out.println("Postfix expression: " + postfix);

        // Create an instance of the EvaluatePostfix class
        EvaluatePostfix evaluatePostfix = new EvaluatePostfix();
        
        // Evaluate the postfix expression and store the result
        double result = evaluatePostfix.evaluate(postfix);
        
        // Print the result of the evaluation
        System.out.println("Result: " + result);
    }
}
