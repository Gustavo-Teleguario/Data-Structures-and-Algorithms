package DynamicList;
import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        ArrayList myList = new ArrayList<>();
        MyArrayList list2 = new MyArrayList(5);
        MyArrayList list = new MyArrayList(5);
        //System.out.println("Size MyArray with a definde size "+list.getSize());
        System.out.println("Size MyArray default capacity "+list.getSize());
        System.out.println("Is empty ? "+list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Is empty ? "+list.isEmpty());
        System.out.println("Size MyArray with a definde size "+list.getSize());
        System.out.println(list.toString());
        list.add(8);
        list.add(43);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        System.out.println(list.toString());
        System.out.println("Remove index 7 "+list.remove(7));
        System.out.println("Size MyArray with a define size "+list.getSize());
        System.out.println(list.toString());
    }
}
