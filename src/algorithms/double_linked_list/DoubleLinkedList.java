package algorithms.double_linked_list;

public class DoubleLinkedList {

    public Node head;
    public Node tail;

    public DoubleLinkedList(){
        this.head=null;
        this.tail=null;
    }

    public void add(int data){
        Node newNode=new Node(data);

        if(this.head==null){
            this.head=newNode;
        } else{
            this.tail.next=newNode;
            newNode.prev=this.tail;
        }
        this.tail=newNode;
    }

    public void addInOrder(int data){
        Node newNode=new Node(data);

        if(this.head==null){ //Zero elements in DDL
            this.head=newNode;
            this.tail=newNode;
        } else if (newNode.data < this.head.data) { //NewNode is minor than head element so newNode is new head
            newNode.next=this.head;
            this.head.prev=newNode;
            this.head=newNode;
        } else if (newNode.data > this.tail.data) { //NewNode is major than tail element so newNode is new tail
            this.tail.next=newNode;
            newNode.prev=this.tail;
            this.tail=newNode;
        } else{ //New node is in the middle
            Node current=this.head;

            while(null != current){
                if(newNode.data < current.data){
                    newNode.prev=current.prev;
                    newNode.next=current;
                    //current.
                }

                current=current.next;
            }
        }
    }

    public void remove(int data){
        Node current=this.head;

        while(current!=null){
            if(current.data==data){
                if(current.next == null && current.prev == null){   //There is just one element in the list
                    this.head=null;
                    this.tail=null;
                } else if (current.prev == null) {  //Data is in the head
                    this.head=current.next;
                    this.head.prev=null;
                } else if (current.next == null) {  //Data is in the tail
                    this.tail=current.prev;
                    this.tail.next=null;
                } else{ //Data is in the middle
                    current.prev.next=current.next;
                    current.next.prev=current.prev;
                }
                break;
            }

            current=current.next;
        }
    }

    public void print(boolean isReverse){
        boolean firstElement=true;
        Node current=isReverse ? this.tail:this.head;

        while(current!=null){
            if(firstElement){
                System.out.print(current.data);
                firstElement=false;
            } else{
                System.out.print("<=>"+current.data);
            }
            current=isReverse ? current.prev:current.next;
        }
        System.out.println();
    }

}
