package DynamicList;

import java.util.Arrays;
/**
 * Created by Maynor Gustavo Teleguario Queche
 * University of Kassel Germany
 * Algorithms and Data Structures
 *
 * @date - 16.04.2020
 */
public class MyArrayList {
    /**
     * My Array List is a ADT to simulate a ArrayList<> in java
     * this is for Study purpose an does not guarantee the same use of an ArrayList
     * from the java util library.
     * <p>
     * For this example counter variable will help in some operation.
     */
    private static final int DEFAULT_CAPACITY = 10;
    private int[] array;
    private int counter = 0;

    //This construct will be called if the user set a capacity
    public MyArrayList(int value) {
        arrayLenght(value);
    }

    /**
     * This construct will be called if the user dont set a capacity it
     * will be a take a default capacity
     */
    public MyArrayList() {
        this.array = new int[DEFAULT_CAPACITY];
        this.counter = 0;
    }

    public void arrayLenght(int value) {
        if (value == 0) {
            return;
        } else if (value > 0) {
            this.array = new int[value];
        } else {
            throw new IllegalArgumentException("Illegal Capacity " + value);
        }
        this.counter = 0;
    }

    public void add(int value){
        //Rezise a Array Capacity if it is not more space into Array
        if(counter > array.length -1 || counter > DEFAULT_CAPACITY){
            resizeArrayCapacity();
        }
        this.array[counter] = value;
        counter++;

    }
    //Exist a another Method add in a Specific index position
    public void add(int index, int value){

    }

    //Remove elements in a Specific Index
    public int remove(int index){
        if(index >= counter)
            throw new IndexOutOfBoundsException("Index: "+index+ ", Size: "+this.counter);
       int oldValue = array[index];
       int numLimit = counter - index - 1;
       if(numLimit > 0)
           System.arraycopy(array, index +1, array, index,numLimit);

        /**
         * Here we use primitive data types, so we simulate 0 as null,
         * when working with objects, you can initialize with null so that
         * the java garbage collector tidies up this space
         */
       counter--;
       array[counter] = 0;

        return oldValue;
    }

    public int getSize() {
        return array.length;
    }

    public boolean isEmpty() {
        return this.counter == 0;
    }
    //It is Recomended to try with a Iterable Interface
    //with StringBuilder we need to do some modifications
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for(int i = 0; i < counter; i++){
            sb.append(array[i]);
            if(i < counter - 1)sb.append(",");
        }
        sb.append(" ]");
        return sb.toString();
    }

    public void resizeArrayCapacity() {
        int oldCapacity = array.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        //Array resize with copyOfArray
        array = Arrays.copyOf(array, newCapacity);
    }

}
