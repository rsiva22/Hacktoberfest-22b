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
    void zaid_pairs(){
        String[] strings = {"Hello", "There"};
        Map<String, String> results = Map2.pairs(strings);
        Map<String, String> expected = new HashMap<>();
        expected.put("H","o");
        expected.put("T","e");
        assertEquals(expected.toString(), results.toString());
        assertTrue(expected.equals(results));

        String[] strings2 = {"Taco", "136"};
        Map<String, String> result2 = Map2.pairs(strings2);
        Map<String, String> expected2 = new HashMap<>();
        expected2.put("T","o");
        expected2.put("1","6");
        assertEquals(expected2.toString(), result2.toString());










    }

}