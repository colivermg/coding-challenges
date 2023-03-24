package algorithms.queue;

import algorithms.linked_list.SimpleLinkedList;

public class Queue {

    private static final int DEFAULT_CAPACITY = 10;
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private final int capacity;
    private int count;
    private Node head;
    private Node tail;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.count = ZERO;
        this.head = null;
        this.tail = null;
    }

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public void add(int data) {
        if (isFull()) {
            throw new IllegalStateException("queue is full!!");
        }
        Node newNode = new Node(data);
        if (null == this.head) {
            this.head = newNode;
        } else {     //Add newNode until the end
            this.tail.next = newNode;
        }
        this.tail = newNode;
        this.count++;
    }

    public int poll() {
        if (isEmpty()) {
            throw new IllegalStateException("queue is empty!!");
        }
        int data = this.head.data;
        if (ONE == count) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
        }
        this.count--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("queue is empty!!");
        }
        return this.head.data;
    }

    public void print() {
        if (isEmpty()) {
            throw new IllegalStateException("queue is empty!!");
        }
        Node aux = this.head;
        while (null != aux) {
            System.out.println(aux.data);
            aux = aux.next;
        }
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return ZERO == this.count;
    }

    public boolean isFull() {
        return this.count == this.capacity;
    }

    private static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.next = null;
            this.data = data;
        }
    }
}