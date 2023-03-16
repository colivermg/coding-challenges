package algorithms.linked_list;

public class SimpleLinkedList {

    private Node head;

    public SimpleLinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head=newNode;
        } else {
            Node aux=this.head;

            while(aux.next!=null){
                aux=aux.next;
            }

            aux.next=newNode;
        }
    }

    public void replaceHead(int data) {
        Node newNode = new Node(data);

        newNode.next=this.head;
        this.head=newNode;

    }

    public void remove(int data) {
        if(this.head != null){
            if(this.head.data == data){ //Data is in the head
                this.head=this.head.next;
            } else{
                Node aux=this.head;
                while(aux != null){
                    if(aux.next != null && aux.next.data==data){
                        aux.next=aux.next.next;
                        break;
                    }
                    aux=aux.next;
                }
            }
        }
    }

    public void print() {
        Node aux=this.head;

        while(aux!=null){
            System.out.println(aux.data);
            aux=aux.next;
        }
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