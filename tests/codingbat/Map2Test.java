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
    void gwen_pairs() {
        String[] namesWithLastInitial = {"GwenA", "StephenJ", "JaymesV"};
        Map<String, String> initials = Map2.pairs(namesWithLastInitial);
        assertEquals("A", initials.get("G"));
        assertEquals("J", initials.get("S"));
        assertEquals("V", initials.get("J"));
    }
}