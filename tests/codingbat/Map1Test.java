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
    void andy_mapAB4(){
        // Check A longer
        Map<String, String> mapToPassIn1 = new HashMap<>();
        mapToPassIn1.put("a", "a is longer");
        mapToPassIn1.put("b", "short");
        Map<String, String> returnedMap = Map1.mapAB4(mapToPassIn1);
        assertEquals("a is longer", returnedMap.get("a"));

        // Check B longer
        Map<String, String> mapToPassIn2 = new HashMap<>();
        mapToPassIn2.put("a", "a short");
        mapToPassIn2.put("b", "b is longer this time");
        Map<String, String> returnedMap2 = Map1.mapAB4(mapToPassIn2);
        assertEquals("b is longer this time", returnedMap2.get("c"));

        // Check same length
        Map<String, String> mapToPassIn3 = new HashMap<>();
        mapToPassIn3.put("a", "same length");
        mapToPassIn3.put("b", "length same");
        mapToPassIn3.put("c", "c stays");
        Map<String, String> returnedMap3 = Map1.mapAB4(mapToPassIn3);
        assertEquals("", returnedMap3.get("a"));
        assertEquals("", returnedMap3.get("b"));
        assertEquals("c stays", returnedMap3.get("c"));

        // a or b does not exist
        Map<String, String> mapToPassIn4 = new HashMap<>();
        mapToPassIn4.put("a", "no b");
        mapToPassIn4.put("c", "c stays");
        Map<String, String> returnedMap4 = Map1.mapAB4(mapToPassIn4);
        assertEquals("no b", returnedMap4.get("a"));
        assertEquals("c stays", returnedMap4.get("c"));
    } // andy_mapAB4 end

}