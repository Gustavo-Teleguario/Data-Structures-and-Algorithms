package String;

/**
 * @author Maynor Gustavo Teleguario Queche
 * @version 1.0
 * @since 26.05.2025
 * <p>
 * Organisation: www.gustavoteleguario.com
 * Rolle: Software Developer
 */
public class Main {
    public static void main(String[] args) {
        //This is a test for the MyString class i concatenate two strings
        MyString stringTest = new MyString("HELLO WORLD");
        MyString stringTest2 = new MyString("I AM a STRING");

        System.out.println(stringTest.concat(stringTest2));
    }
}
