package Queue;

/**
 * Created by Maynor Gustavo Teleguario Queche
 * University of Kassel Germany
 * Algorithms and Data Structures
 *
 * @date 10.04.2020
 */
public class QueueArray {

    /**
     * Queue is a Dynamic ADT is based in the term FIFO
     * (First in First out)
     */
    static final int DEFAULT_SIZE = 10;
    private int[] queueArray;
    private int index;
    private int start;
    private int end;

    public QueueArray() {
        this.queueArray = new int[DEFAULT_SIZE];
        this.index = 0;
        this.start = 0;
        this.end = 0;
    }

    /**
     * Inserts a key value at the rear of the queue.
     *
     * @param key is a integer value.
     * @throws MyException
     */
    public void enqueue(int key) throws MyException {
        //Add a important Exceptions
        if (index > queueArray.length - 1) {
            throw new MyException();
        }
        queueArray[end] = key;
        end = (end + 1) % queueArray.length;
        index++;
    }

    /**
     * Removes the key obeject from the front of the queue
     * thereby decrementing queue size by one
     *
     * @return a key to remove it.
     * @throws MyException
     */
    public int dequeue() throws MyException {
        //Add a important Exceptions.
        if (empty()) {
            throw new MyException();
        }
        int el = queueArray[start];
        queueArray[start] = 0;
        start = (start + 1) % queueArray.length;
        index--;
        return el;
    }

    /**
     * @return a key object at the front of the queue without
     * removing it.
     * @throws MyException
     */
    public int peek() throws MyException {
        if (empty()) {
            throw new MyException();
        }
        return queueArray[start];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = start; i < queueArray.length; i++) {
            sb.append(queueArray[i]);
            if (i < queueArray.length - 1) sb.append(" , ");
        }
        sb.append(" ]");
        return sb.toString();
    }

    public boolean empty() {
        return index == 0;
    }

    public int getSize() {
        return this.index;
    }

    //Optional create a method to Expand the capacity
    //of the queue if we want save more Objects.
}
