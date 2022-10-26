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
    void hoang_Test_set() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        list.set(1, "cookies");
        assertEquals("cookies", list.get(1));
        list.add("candy");
        list.add("book");
        list.set(4, "banana");
        list.set(1, "apple");
        assertEquals("banana", list.get(4));
        assertEquals("apple", list.get(1));
    }
}
