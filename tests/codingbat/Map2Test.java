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
    void ethank_firstchar(){
        Map <String,String> map3 = new HashMap<>();
        map3.put("r","red2red");
        map3.put("b","blue2blue");
        map3.put("g","green");
        map3.put("y","yellow");

        String[] map2 = {"red2", "green","blue2","yellow","red","blue"};

        System.out.println( Map2.firstChar(map2));
        assertEquals(map3,Map2.firstChar(map2));
    }

}