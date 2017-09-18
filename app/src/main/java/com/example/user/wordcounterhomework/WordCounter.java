package com.example.user.wordcounterhomework;

/**
 * Created by user on 18/09/2017.
 */

public class WordCounter {
    public static String countWords(String stringToCount){
        String[] wordsSeperated = stringToCount.split("\\s");
        return "The number of words you have entered is: " + wordsSeperated.length + ".";
    }
}
