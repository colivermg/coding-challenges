package algorithms.double_linked_list;

public class App {

    public static void main(String[] args) {
        DoubleLinkedList ddl=new DoubleLinkedList();

        /*ddl.add(1);
        ddl.add(7);
        ddl.add(3);
        ddl.add(5);
        ddl.add(2);
        ddl.add(8);
        ddl.add(4);
        ddl.add(10);
        ddl.add(9);
        ddl.add(6);
        ddl.remove(2);
        ddl.remove(1);
        ddl.remove(6);
        ddl.print(false);
        ddl.print(true);*/

        ddl.addInOrder(1);
        ddl.addInOrder(5);
        ddl.addInOrder(2);
        ddl.addInOrder(8);
        ddl.addInOrder(3);
        ddl.addInOrder(4);
        ddl.print(false);



    }
}
