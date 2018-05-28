package com.company;

public class LinkedList<E> {
    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, next:null)
        }

        public Node(E e) {
            this(e:null, next:null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}
