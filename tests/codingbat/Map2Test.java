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
    void tylerb_wordLenTrue(){
        String[] strings = {"One", "Seven", "Four","Testing"};
        Map<String, Integer> result = Map2.wordLen(strings);

        String excpected = "{One=3, Four=4, Seven=5, Testing=7}";
        assertEquals(result.toString(), excpected);
    }

}