package codingbat;

import codingbat.Map2;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
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
    void molly_wordLen() {
        String[] strings = {"red", "orange", "yellow", "green", "blue", "purple"};
        Map<String, Integer> map = new HashMap<>();
        map.put("red", 3);
        map.put("orange", 6);
        map.put("yellow", 6);
        map.put("green", 5);
        map.put("blue", 4);
        map.put("purple", 6);
        Map<String, Integer> resultMap = Map2.wordLen(strings);

        assertTrue(map.equals(resultMap));
        assertEquals(resultMap.get("red"), map.get("red"));
        assertFalse(map.containsValue(2));
    }
}