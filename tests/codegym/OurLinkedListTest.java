package codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class OurLinkedListTest {

    @Test
    void add() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        assertEquals("pizza", list.get(0));
        assertEquals("chicken wings", list.get(1));
        assertEquals("french fries", list.get(2));
    }

    @Test
    void testAdd() {
    }



    @Test
    void pollLast(){
    OurLinkedList<Integer> li = new OurLinkedList<Integer>();
    li.add(1);
    li.add(2);
    li.add(3);
    li.add(4);
    assertEquals(4, li.pollLast());
    assertEquals(null, li.get(3));
    }
}
