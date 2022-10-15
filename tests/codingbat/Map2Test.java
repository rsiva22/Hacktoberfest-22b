package codingbat;

import codingbat.Map2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

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
    void william_wordLen() {
        String[] strings = {"hello", "goodbye"};
        Map<String, Integer> result = Map2.wordLen(strings);
        assertTrue(result.containsValue(5));
        assertTrue(result.containsValue(7));
        assertFalse(result.containsValue(8));
        assertEquals(result.containsValue(5), result.containsValue(5));
        assertEquals(result.containsKey("hello"), result.containsKey("hello"));
    }

}