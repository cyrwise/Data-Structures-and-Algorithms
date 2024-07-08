import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class SpellCheckerApp 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Create a new instance of SpellChecker, loading the dictionary from "words.txt"
            SpellChecker spellChecker = new SpellChecker("words.txt");
            // Run the spell checker
            runSpellChecker(spellChecker);
        } 
        catch (IOException e) 
        {
            // Print an error message if the dictionary file failed to load
            System.err.println("Failed to load dictionary file: " + e.getMessage());
        }
    }

    // Method to run the spell checker
    private static void runSpellChecker(SpellChecker spellChecker) 
    {
        // Create a scanner object to read user input
        Scanner inputScanner = new Scanner(System.in);
        String inputWord;

        // Repeat until the user types 'exit'
        do 
        {
            // Prompt the user to enter a word to check
            System.out.print("Enter a word to check, or type 'exit' to quit: ");
            // Read the input word and remove any leading or trailing whitespace
            inputWord = inputScanner.nextLine().trim();

            // If the input word is not 'exit', process it
            if (!inputWord.equalsIgnoreCase("exit")) 
            {
                processInput(spellChecker, inputWord);
            }

        } while (!inputWord.equalsIgnoreCase("exit"));

        // Close the scanner
        inputScanner.close();
    }

    // Method to process user input and check the spelling
    private static void processInput(SpellChecker spellChecker, String word) 
    {
        // If the input word is in the dictionary, it is spelled correctly
        if (spellChecker.isWordValid(word)) 
        {
            System.out.println("  No mistakes found.");
        } 
        else 
        {
            // If the input word is not in the dictionary, it is misspelled
            System.out.println("  The word is misspelled.");
            // Get suggestions for corrections
            Set<String> suggestions = spellChecker.suggestCorrections(word);

            // If there are no suggestions, inform the user
            if (suggestions.isEmpty()) 
            {
                System.out.println("  No suggestions available.");
            } 
            else 
            {
                // If there are suggestions, print them
                System.out.println("  Suggested words:");
                suggestions.forEach(suggestion -> System.out.println("    " + suggestion));
            }
        }
    }
}


// OUTPUT:



// // ======================

// // NO MISTAKES CASE:

// Enter a word to check, or type 'exit' to quit: algorithms
//   No mistakes found.

// // ======================


// // ======================

// // SUGGESTION CASE: Add one character to the beginning

// Enter a word to check, or type 'exit' to quit: lgorithm
//   The word is misspelled.
//   Suggested words:
//     algorithm

// // ======================


// // ======================

// // SUGGESTION CASE: Add one character to the end

// Enter a word to check, or type 'exit' to quit: watermelo 
//   The word is misspelled.
//   Suggested words:
//     watermelon

// // ======================


// // ======================

// // SUGGESTION CASE: Remove one character to the beginning

// Enter a word to check, or type 'exit' to quit: aalgorithm
//   The word is misspelled.
//   Suggested words:
//     algorithm

// // ======================


// // ======================

// // SUGGESTION CASE: Remove one character from the end

// Enter a word to check, or type 'exit' to quit: algorithmm
//   The word is misspelled.
//   Suggested words:
//     algorithm

// // ======================


// // ======================

// // SUGGESTION CASE: Exchange adjacent characters

// Enter a word to check, or type 'exit' to quit: algroithm
//   The word is misspelled.
//   Suggested words:
//     algorithm

// // ======================


// // ======================

// // SUGGESTION CASE: NO FIXES FOUND :(

// Enter a word to check, or type 'exit' to quit: saadadadasdasdasdaw
//   The word is misspelled.
//   No suggestions available.

// // ======================
