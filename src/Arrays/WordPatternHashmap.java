package Arrays;
import java.util.*;

public class WordPatternHashmap

 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(WordPatternHashmap.wordPattern(pattern, s));

    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> charToWord = new HashMap<Character, String>();
        HashMap<String, Character> wordToChar = new HashMap<String, Character>();
        String[] words = s.split(" ");

// Check if the pattern and the words array have the same length
        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }

            } else {
                charToWord.put(c, word);
            }

            // Check the word to character mapping
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) {
                    return false;
                } else {
                    wordToChar.put(word, c);
                }
            }


        }
        return true;
    }
 }