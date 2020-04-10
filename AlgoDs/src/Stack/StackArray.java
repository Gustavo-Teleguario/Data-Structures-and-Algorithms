package Stack;

/**
 * Created by Maynor Gustavo Teleguario Queche
 * University of Kassel Germany
 * Algorithms and Data Structures
 *
 * @date 10.04.2020
 */
public class StackArray {

    /**
     * Stack is a Dynamic ADT is based in the term LIFO
     * (Last in First out)
     */
    static final int DEFAULT_SIZE = 10;
    private int[] elements;
    private int index;

    public StackArray() {
        this.elements = new int[DEFAULT_SIZE];
        this.index = 0;
    }

    /**
     * Pushes a Key onto the top of this Stack.
     *
     * @param key
     * @throws MyException: if element add at index
     *                      over the default size
     */
    public void push(int key) throws MyException {
        if (index > elements.length)
            throw new MyException();

        elements[index] = key;
        index++;
    }

    /**
     * Looks at the key at the top of this stack
     * without removing it from the stack.
     * @return
     * @throws MyException
     */
    public int peek() throws MyException {
        int len = index - 1;
        if (index == 0) {
            throw new MyException();
        }
        return elements[len];
    }

    // Removes the object at the top of this stack
    public void pop() throws MyException {
        //int keyElement = peek();
        int len = index - 1;
        if (index == 0) {
            throw new MyException();
        }
        elements[len] = 0;
        index--;
    }


    // Print all elements into the Stack
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < index; i++) {
            sb.append(elements[i]);
            if (i < index - 1) sb.append(",");
        }
        sb.append(" ]");
        return sb.toString();
    }

    // Tests if this stack is empty.
    public boolean empty() {
        return index == 0 ? true : false;
    }

    /**
     * if key is into the Stack, this return this element, but not the
     * index, if the element not exist into the Stack, its return a 0 value.
     *
     * @param key
     * @return
     * @throws MyException
     */
    public int search(int key) throws MyException {
        if (index == 0) {
            throw new MyException();
        }
        int ob = 0;
        for (int i = 0; i < elements.length; i++) {
            if (key == elements[i])
                ob = elements[i];
        }
        return ob;
    }

    public int getSize() {
        return this.index;
    }
}
