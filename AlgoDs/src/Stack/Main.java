package Stack;

import java.util.Stack;

public class Main {
    public static void main(String... args) throws MyException {

        // Example for Stack
        StackArray stack = new StackArray();
        System.out.println("Is Stack Empty? " + stack.empty());
        System.out.println("Stack size: " + stack.getSize());
        stack.push(34);
        stack.push(3);
        stack.push(88);
        stack.push(90);
        System.out.println(stack.toString());
        System.out.println("Remove element LIFO term");
        stack.pop();
        System.out.println(stack.toString());
        System.out.println("Element at the Top: " + stack.peek());
        System.out.println(stack.toString());
        System.out.println("Search Elemetn: " + stack.search(3));

    }
}
