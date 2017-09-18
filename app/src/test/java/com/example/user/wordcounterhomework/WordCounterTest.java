package com.example.user.wordcounterhomework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/09/2017.
 */

public class WordCounterTest {

    @Test
    public void testCounterMethod(){
        String test = "Happy Birthday Little Johnny";
        assertEquals(4, WordCounter.countWords(test) );
    }

    @Test
    public void testASentence(){
        String test = "We have a proper sentence here. It's on all the news.";
        assertEquals(11, WordCounter.countWords(test));
    }

}
