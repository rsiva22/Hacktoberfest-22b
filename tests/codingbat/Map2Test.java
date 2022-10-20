package codingbat;

import codingbat.Map2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test {
    
    @Test
    void marc_allSwap() {
        String[] strings = {"cat", "dog", "bunny", "caterpillar", "kangaroo", "kitten", "butterfly", "crocodile", "centipede"};
        String[] result = Map2.allSwap(strings);
        String[] expected = {"caterpillar", "dog", "butterfly", "cat", "kitten", "kangaroo", "bunny", "centipede", "crocodile"};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void abdalgader_wordAppend() {
        //wordAppend(["a", "b", "a"]) → "a"
        String[] strings1 = {"a", "b", "a"};
        String result1 = Map2.wordAppend(strings1);
        String expected1 = "a";
        assertEquals(result1,expected1);
    //wordAppend(["a", "b", "b", "a", "a"]) → "ba"

        String[] strings2 = {"a", "b", "b", "a", "a"};
        String result2 = Map2.wordAppend(strings2);
        String expected2 = "ba";
        assertTrue(result2.equals(expected2));

        String[] strings3 = {"a", "b", "b", "a", "a"};
        String result3 = Map2.wordAppend(strings3);
        String expected3 = "b";
        assertFalse(result3.equals(expected3));

        // wordAppend(["this", "or", "that", "and", "this", "and", "that"]) → "thisandthat"

        String[] strings4 = {"this", "or", "that", "and", "this", "and", "that"};
        String result4 = Map2.wordAppend(strings4);
        String expected4 = "thisandthat";
        assertTrue(result4.equals(expected4));
    }

}