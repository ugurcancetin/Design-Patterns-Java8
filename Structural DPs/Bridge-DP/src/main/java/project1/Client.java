package project1;

import project1.added.FifoCollection;
import project1.added.Queue;
import project1.existing.SinglyLinkedList;

public class Client {
    public static void main(String[] args) {
        FifoCollection<String> queue = new Queue(new SinglyLinkedList());
        queue.offer("Ugurcan");
        queue.offer("Cetin");
        queue.offer("Harun");
        queue.offer("Arpa");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
