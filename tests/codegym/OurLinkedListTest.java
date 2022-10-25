package codegym;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

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
    void testGetLast() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        assertEquals("five", list.getLast());
        OurLinkedList<String> list2 = new OurLinkedList<>();
        assertThrows(NoSuchElementException.class, () -> list2.getLast());
    }

}
