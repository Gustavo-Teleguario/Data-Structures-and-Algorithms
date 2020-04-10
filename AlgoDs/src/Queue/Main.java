package Queue;

public class Main {
    public static void main(String... args) throws MyException {

        // Example for Queue Max default size 10
        QueueArray queue = new QueueArray();
        System.out.println("Is Queue Empty? " + queue.empty());
        System.out.println("Queue size: " + queue.getSize());
        queue.enqueue(34);
        queue.enqueue(3);
        queue.enqueue(88);
        queue.enqueue(90);
        queue.enqueue(23);
        System.out.println(queue.toString());
        System.out.println("Size Queue: " + queue.getSize());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println(queue.toString());
        System.out.println("Size Queue: " + queue.getSize());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("Element at the Top: "+queue.peek());

    }
}
