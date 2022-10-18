package codingbat;


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
    void hoang_mapAB() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "hoang");
        map1.put("b", "chu");
        Map<String, String> map2 = Map1.mapAB(map1);
        assertTrue(map2.containsKey("ab"));
        assertEquals("hoangchu", map2.get("ab"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "hello");
        map3.put("c", "world");
        Map<String, String> map4 = Map1.mapAB(map3);
        assertFalse(map4.containsKey("ab"));
    }



    void mohmeed_topping1() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "cherry");
        map1.put("bread", "butter");
        Map<String, String> map2 = Map1.topping1(map1);
        assertTrue(map2.containsValue("cherry"));
        assertTrue(map2.containsValue("butter"));
    }


    @Test
    void marwa_mapShare() {
        // mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}




        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c","ccc");
        Map<String, String> expected = new HashMap<>();
        expected.put("a","aaa");
        expected.put("b","aaa");
        Map<String, String> result = Map1.mapShare(map1);
        assertEquals(expected,result);
        assertTrue(expected.equals(result));

    }

    // Test for mapAB4()
    @Test
    void teft_mapAB4() {
        Map<String, String> testmap = new HashMap<>();
        testmap.put("a", "longer");
        testmap.put("b", "short");
        Map<String, String> methodmap = Map1.mapAB4(testmap);
        assertTrue(methodmap.containsKey("c"));
        assertEquals("longer", methodmap.get("c"));
        assertEquals(methodmap.get("c"), (methodmap.get("a")));

        Map<String, String> testmap2 = new HashMap<>();
        testmap2.put("a", "short");
        testmap2.put("b", "longer");
        Map<String, String> methodmap2 = Map1.mapAB4(testmap2);
        assertTrue(methodmap2.containsKey("c"));
        assertEquals("longer", methodmap2.get("c"));
        assertEquals(methodmap2.get("c"), (methodmap2.get("b")));

        Map<String, String> testmap3 = new HashMap<>();
        testmap3.put("a", "same");
        testmap3.put("b", "same");
        Map<String, String> methodmap3 = Map1.mapAB4(testmap3);
        assertFalse(methodmap3.containsKey("c"));
        assertEquals("", methodmap3.get("a"));
        assertEquals("", methodmap3.get("b"));
    }

    @Test
    void alex_mapAB() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "apple");
        map1.put("b", "oranges");
        Map<String, String> map2 = Map1.mapAB(map1);
        assertFalse(map2.isEmpty());

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "apple");
        map3.put("b", "oranges");
        Map<String, String> map4 = Map1.mapAB(map3);
        assertTrue(map4.containsKey("ab"));


    }


}
