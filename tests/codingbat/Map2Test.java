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
    void stephen_wordMultiple() {
        String[] words = new String[] {"Hi", "Hello", "Hola", "Hi"};

        Map<String,Boolean> moreThanOne = Map2.wordMultiple(words);

        assertTrue(moreThanOne.get("Hi"));
        assertFalse(moreThanOne.get("Hola"));


        String[] words2 = new String[] {"Hi", "Hello", "Hola","Howdy","Hola", "Hi"};

        Map<String,Boolean> moreThanOne2 = Map2.wordMultiple(words2);

        assertTrue(moreThanOne2.get("Hi"));
        assertTrue(moreThanOne2.get("Hola"));
        assertFalse(moreThanOne2.get("Howdy"));
    }

}