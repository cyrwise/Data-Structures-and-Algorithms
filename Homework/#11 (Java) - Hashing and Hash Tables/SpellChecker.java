import java.io.*;
import java.util.*;

public class SpellChecker 
{
    private Hashtable<String, Boolean> wordlist;

    // Constructor that initializes the SpellChecker with a wordlist loaded from a file
    public SpellChecker(String wordlistPath) throws IOException 
    {
        wordlist = new Hashtable<>();
        loadWordlist(wordlistPath);
    }

    // Method to load a wordlist from a file
    private void loadWordlist(String wordlistPath) throws IOException 
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(wordlistPath))) 
        {
            String word;
            // Read each word from the file, trim and convert to lowercase, then add to the wordlist
            while ((word = reader.readLine()) != null) {
                wordlist.put(word.trim().toLowerCase(), true);
            }
        }
    }

    // Method to suggest corrections for a misspelled word
    public Set<String> suggestCorrections(String word) 
    {
        Set<String> suggestions = new HashSet<>();
    
        // Check for suggestions based on adding one character to the beginning
        for (char c = 'a'; c <= 'z'; c++) 
        {
            String newWord = c + word;
            if (wordlist.containsKey(newWord)) 
            {
                suggestions.add(newWord);
            }
        }
    
        // Check for suggestions based on adding one character to the end
        for (int i = 0; i <= word.length(); i++) 
        {
            for (char c = 'a'; c <= 'z'; c++) 
            {
                String newWord = word.substring(0, i) + c + word.substring(i);
                if (wordlist.containsKey(newWord)) 
                {
                    suggestions.add(newWord);
                }
            }
        }
    
        // Check for suggestions based on removing one character from the beginning
        if (word.length() > 1) 
        {
            String newWord = word.substring(1);
            if (wordlist.containsKey(newWord)) 
            {
                suggestions.add(newWord);
            }
        }
    
        // Check for suggestions based on removing one character from the end
        if (word.length() > 1) 
        {
            String newWord = word.substring(0, word.length() - 1);
            if (wordlist.containsKey(newWord)) 
            {
                suggestions.add(newWord);
            }
        }
    
        // Check for suggestions based on exchanging adjacent characters
        for (int i = 0; i < word.length() - 1; i++) 
        {
            char[] charArray = word.toCharArray();
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
            String newWord = new String(charArray);
            if (wordlist.containsKey(newWord)) 
            {
                suggestions.add(newWord);
            }
        }
    
        return suggestions;
    }
        

    // Method to check if a word is in the wordlist
    public boolean isWordValid(String word) 
    {
        return wordlist.containsKey(word.toLowerCase());
    }
}
