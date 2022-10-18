package codingbat;


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
    void mohmeed_firstSwap() {
        String[] strings = {"ab", "ac"};
        String[] result = Map2.firstSwap(strings);
        String[] expected = {"ac", "ab"};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void marwa_fistSwap() {
      // firstSwap(["ab", "ac"]) → ["ac", "ab"]
        String[] strings = {"ab", "ac"};
        String[] result = Map2.firstSwap(strings);
        String[] expected = {"ac", "ab"};
        assertTrue(Arrays.toString(expected).equals( Arrays.toString(result)));

    }

    // Test for wordLen()
    @Test
    void teft_wordLen() {
        String[] strings1 = {"one", "two", "one", "three", "two", "one"};
        Map<String, Integer> methodmap = Map2.wordLen(strings1);
        assertEquals(3, methodmap.get("one"));
        assertEquals(3, methodmap.get("two"));
        assertEquals(5, methodmap.get("three"));

        String[] strings2 = {"a", "two", "a", "two", "be", "be"};
        Map<String, Integer> methodmap2 = Map2.wordLen(strings2);
        assertEquals(1, methodmap2.get("a"));
        assertEquals(3, methodmap2.get("two"));
        assertEquals(2, methodmap2.get("be"));
    }

    @Test
    void alex_word0() {
        String[] strings = {"apple"};
        String result = Map2.word0(strings).toString();
        assertEquals(result, "{apple=0}");
    }

    @Test
    void hoang_wordCount() {
        String[] strings = {"cat", "dog", "cat", "fish", "rabbit", "rabbit", "rabbit", "bird"};
        Map<String, Integer> map = Map2.wordCount(strings);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("cat", 2);
        expected.put("dog", 1);
        expected.put("fish", 1);
        expected.put("rabbit", 3);
        expected.put("bird", 1);
        assertTrue(expected.equals(map));

        Map<String, Integer> map2 = Map2.wordCount(strings);
        Map<String, Integer> expected2 = new HashMap<>();
        expected2.put("cat", 2);
        expected2.put("dog", 1);
        expected2.put("fish", 1);
        expected2.put("rabbit", 7);
        assertFalse(expected2.equals(map2));
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
    }


    @Test
    void matthew_word0() {
        String[] strings = {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"};
        Map<String, Integer> result = Map2.word0(strings);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 0);
        assertEquals(expected, result);

        String[] strings1 = {"2", "5", "1"};
        Map<String, Integer> result2 = Map2.word0(strings);
        Map<String, Integer> expected2 = new HashMap<>();
        expected2.put("2", 0);
        expected2.put("5", 0);
        expected2.put("1", 0);
        assertTrue(expected2.containsKey("2"));
        assertTrue(expected2.containsKey("5"));
        assertTrue(expected2.containsKey("1"));
        assertTrue(expected2.containsValue(0));
    }
}
