package project1.added;

import project1.existing.LinkedList;

//A refined abstraction.
public class Queue<T> implements FifoCollection<T>{

    private LinkedList<T> linkedList;

    public Queue(LinkedList<T> l) {
        linkedList = l;
    }

    @Override
    public void offer(T element) {
        linkedList.addLast(element);
    }

    @Override
    public T poll() {
        return linkedList.removeFirst();
    }
}
