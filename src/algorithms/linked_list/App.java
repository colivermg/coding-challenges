package algorithms.linked_list;

public class App {
    public static void main(String[] args) {
        SimpleLinkedList simpleLinkedList=new SimpleLinkedList();
        simpleLinkedList.add(5);
        simpleLinkedList.add(1);
        simpleLinkedList.add(3);
        simpleLinkedList.add(6);
        simpleLinkedList.add(4);
        simpleLinkedList.print();

        //simpleLinkedList.replaceHead(7);

        simpleLinkedList.remove(5);
        simpleLinkedList.remove(3);
        simpleLinkedList.remove(4);
        simpleLinkedList.print();

    }
}
