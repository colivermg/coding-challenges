package algorithms.queue;

public class App {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        /*queue.print();*/
        /*System.out.println(queue.size());*/
        queue.poll();
        /*System.out.println(queue.size());*/
        queue.print();

    }
}
