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
    void andy_testPeekLast(){
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        OurLinkedList<Integer> list2 = new OurLinkedList<>();
        // test that the correct value is returned
        assertEquals("french fries", list.peekLast());
        // test that the last value was not removed from the list
        assertEquals("french fries", list.get(2));
        // test that null is returned if the list is empty
        assertNull(list2.peekLast());
    }
}
