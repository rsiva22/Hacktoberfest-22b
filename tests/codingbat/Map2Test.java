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
    void hoang_wordCount() {
        String[] strings = {"cat", "dog", "cat", "fish", "rabbit", "rabbit", "rabbit"};
        Map<String, Integer> map = Map2.wordCount(strings);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("cat", 2);
        expected.put("dog", 1);
        expected.put("fish", 1);
        expected.put("rabbit", 3);
        assertTrue(expected.equals(map));

        String[] strings2 = {"cat", "dog", "cat", "fish", "rabbit", "rabbit", "rabbit", "bird"};
        Map<String, Integer> map2 = Map2.wordCount(strings2);
        Map<String, Integer> expected2 = new HashMap<>();
        expected.put("cat", 2);
        expected.put("dog", 1);
        expected.put("fish", 1);
        expected.put("rabbit", 7);
        assertFalse(expected2.equals(map2));
    }

}