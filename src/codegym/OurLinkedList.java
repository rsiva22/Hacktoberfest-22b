package codegym;

import java.util.NoSuchElementException;

public class OurLinkedList<T> {
    private Node<T> first = new Node<>();
    private Node<T> last = new Node<>();

    public OurLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }


    public void add(int index, T value) {
        Node node = new Node();
        node.value = value;
        Node currentElement = first.next;
        for (int i = 0; i < index; i++) {
            currentElement = currentElement.next;
        }
        Node ref = currentElement.prev;
        ref.next = node;
        currentElement.prev = node;
        node.prev = ref;
        node.next = currentElement;
    }

    public T get(int index) {
        Node currentElement = first.next;
        if(currentElement == last || currentElement == null) {
            throw new NoSuchElementException("Could not get that index");
        }
        int count = 0;
        while (count < index && (currentElement) != null) {
            currentElement = currentElement.next;
            count++;
        }
        return (T) currentElement.value;
    }


    public void add(T value) {
        Node node = new Node();
        node.value = value;
        Node ref = last.prev;
        ref.next = node;
        last.prev = node;
        node.prev = ref;
        node.next = last;
    }

    public T getFirst(){
        Node<T> f = first.next;
        if (f.value == null){
            throw new NoSuchElementException();
        }
        return f.value;
    }

    public boolean contains(T ob1){
        boolean flag = false;
        Node currentElement = first.next;
        while((currentElement) != null)
        {
            if(currentElement.value == ob1){
                flag = true;
                break;
            }
            else{
                flag = false;

            }
            currentElement = currentElement.next;
        }
        return flag;
    }

    public T peekLast(){
        T value = null;
        Node lastValueNode = last.prev;
        if(!(first.equals(lastValueNode))){
            // set value to the value of lastValueNode, unless that node is the first node, which dose not hold a value
            value = (T)lastValueNode.value;
        }
        return value;
    }

    public static class Node<T> {
        private Node prev;
        private T value;
        private Node next;
    }


    public T getLast() {
        Node<T> lastItem = last.prev;
        if (lastItem.value ==  null) {
            throw new NoSuchElementException();
        }
        else {
            return lastItem.value;
        }
    }

    public T removeLast() {
        Node node = new Node();
        node = last.prev;
        node.prev.next = last;
        last.prev = node.prev;
    //        last = last.prev.prev;
    //        last.next = null;
        return (T)node.value;
    }

    public T poll(){
        var r = first.next;
        first.next = r.next;
        r.next.prev=first;
        return (T)r.value;

//        var rv = first.value;
//        first.next.prev = first.prev;
//        first.prev.next = first.next;
//        return rv;
    }

    // Retrieves and removes the head (first element) of this list.
    public T remove() {
        Node toBeRemoved = first.next;
        first.next = toBeRemoved.next;
        toBeRemoved.next.prev = first;

        return (T)toBeRemoved.value;
    }

}

