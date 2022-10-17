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

//    /*
//     * We'll say that 2 strings "match" if they are non-empty and their first
//     * chars are the same. Loop over and then return the given array of
//     * non-empty strings as follows: if a string matches an earlier string
//     * in the array, swap the 2 strings in the array. A particular first char
//     * can only cause 1 swap, so once a char has caused a swap, its later swaps
//     * are disabled. Using a map, this can be solved making just one pass over
//     * the array. More difficult than it looks.
//     */
//    public static String[] firstSwap(String[] strings) {
//        Map<String, Integer> map = new HashMap<>();
//        for(int i = 0; i < strings.length; i++) {
//            String firstCharacter = strings[i].substring(0, 1);
//            if(map.containsKey(firstCharacter)) {
//                if(map.get(firstCharacter) != -1) {
//                    String temp = strings[i];
//                    strings[i] = strings[map.get(firstCharacter)];
//                    strings[map.get(firstCharacter)] = temp;
//                    map.put(firstCharacter, -1);
//                }
//            } else {
//                map.put(firstCharacter, i);
//            }
//        }
//        return strings;
//    }

    @Test
    void john_firstSwap(){
        String[] str = {"goat","bat","john","bart","george", "kaitlyn","box"};
        String[] result = Map2.firstSwap(str);
        String[] expected = {"george","bart","john","bat","goat","kaitlyn","box"};
        assertEquals(Arrays.toString(expected),Arrays.toString(result));
        assertTrue(result[2].equals("john"));
        assertTrue(result[5].equals("kaitlyn"));
        assertTrue(result[6].equals("box"));

    }

}