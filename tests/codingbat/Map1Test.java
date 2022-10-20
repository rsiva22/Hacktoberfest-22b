package codingbat;

import codingbat.Map1;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test {

    @Test
    void marc_mapAB2() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "cat");
        map1.put("b", "cat");
        Map<String, String> map2 = Map1.mapAB2(map1);
        assertFalse(map2.containsKey("a"));
        assertFalse(map2.containsKey("b"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "cat");
        map3.put("b", "dog");
        Map<String, String> map4 = Map1.mapAB2(map3);
        assertTrue(map4.containsKey("a"));
        assertTrue(map4.containsKey("b"));

    }
    @Test
    void abdalgader_mapAB4(){
        //mapAB4({"a": "aaa"}) → {"a": "aaa"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        Map<String, String> expected1 = new HashMap<>();
        expected1.put("a", "aaa");
        assertEquals(Map1.mapAB4(map1),expected1);

        //mapAB4({"a": "a", "b": "b", "c": "cake"}) → {"a": "", "b": "", "c": "cake"}
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "a");
        map2.put("b", "b");
        map2.put("c", "cake");
        Map<String, String> expected2 = new HashMap<>();
        expected2.put("a", "");
        expected2.put("b", "");
        expected2.put("c", "cake");
        assertTrue(Map1.mapAB4(map2).equals(expected2));


        //mapAB4({"a": "a", "b": "b", "c": "cake"}) → {"a": "", "b": "", "c": "cake"}
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "a");
        map3.put("b", "b");
        map3.put("c", "cake");
        Map<String, String> expected3 = new HashMap<>();
        expected3.put("a", "");
        //expected3.put("b", "");
        expected3.put("c", "cake");
        assertFalse(Map1.mapAB4(map3).equals(expected3));

        // mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}

        Map<String, String> map4 = new HashMap<>();
        map4.put("a", "aa");
        map4.put("b", "bbb");
        Map<String, String> expected4 = new HashMap<>();
        expected4.put("a", "aa");
        expected4.put("b", "bbb");
        expected4.put("c", "bbb");
        assertEquals(Map1.mapAB4(map4),expected4);
    }
}