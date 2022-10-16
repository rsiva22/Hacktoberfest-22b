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
    void tylerH_wordLen() {
        String[] strings = {"a", "bb", "a", "bb"};
        Map2.wordLen(strings);
        assertEquals(2, Map2.wordLenTylerHand(strings).get("bb"));
        assertEquals(1, Map2.wordLenTylerHand(strings).get("a"));
        assertTrue(Map2.wordLenTylerHand(strings).containsKey("bb"));
        assertTrue(Map2.wordLenTylerHand(strings).containsKey("a"));

    }

}