package codingbat;

import codingbat.Map2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
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
    void rith_wordCount() {
        String[] strings = {"cat", "dog", "bunny", "cat", "bunny", "cat"};
        Map<String, Integer> result = Map2.wordCount(strings);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("cat",3);
        expected.put("dog",1);
        expected.put("bunny",2);
        assertEquals(expected, result);
        assertTrue(result.get("cat")==3);
    }
}