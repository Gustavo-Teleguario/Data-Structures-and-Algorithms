package CS_Problems;

import java.util.Arrays;

/**
 * the following Problem call Is Unique String. Here is a description about this problem
 * Implement an Algorithm to determinate if a string has all unique characters. What if cannot use additional
 * data structure
 */
public class ArraysAndStrings {
    public static void main(String[] args) {
        //test argument
        String firstStr = "yxrtakl";
        String secondStr = "xyyx";
        System.out.println("Unique String argument "+ firstStr + " "+isUniqueString(firstStr));
        System.out.println("Unique String argument "+ secondStr + " "+isUniqueString(secondStr));
    }


    public static boolean isUniqueString(String argument) {
        //First important thing ist to ask your self about, if a string argument is an ASCII- or Unicode string
        if (argument.length() > 128) return false;

        char[] chars = argument.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i - 1]) return false;
        }
        return true;
    }
}

