package String;

/**
 * @author Maynor Gustavo Teleguario Queche
 * @version 1.0
 * @since 26.05.2025
 * <p>
 * Organisation: www.gustavoteleguario.com
 * Rolle: Software Developer
 */
public class MyString {
    private char[] chars;
    private int length;

    public MyString(){}
    public MyString(String str) {
        if (str == null)
            throw new StringIndexOutOfBoundsException("!!!");
        length = str.length();
        chars = str.toCharArray();
    }


    public MyString(char[] ch) {
        if (ch == null) return;
        chars = ch;
    }


    public String toString() {
        String outString = "";
        for (int i = 0; i < chars.length; i++) {
            outString = outString + chars[i];
        }
        return outString;
    }


    public char charAt(int index) {
        if (index < 0 || index >= chars.length)
            throw new StringIndexOutOfBoundsException(index);
        return chars[index];
    }


    public int length() {
        return length;
    }


    public MyString concat(MyString str) {
        if (str == null && str.length() == 0) return this;
        int length = this.chars.length + str.chars.length;
        char[] temp = new char[length];
        System.arraycopy(this.chars, 0, temp, 0, this.chars.length);
        System.arraycopy(str.chars, 0, temp, this.chars.length, str.chars.length);
        return new MyString(temp);
    }


    public int indexOf(int ch, int fromIndex) {
        if (fromIndex < 0 || fromIndex >= length) return -1;
        for (int i = fromIndex; i < length; i++)
            if (chars[i] == ch)
                return i;
        return -1;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (!(o instanceof MyString)) return false;
        MyString other = (MyString) o;
        if (this.chars.length != other.chars.length)
            return false;
        int i = 0;
        while (i < this.chars.length) {
            if (this.chars[i] != other.chars[i])
                return false;
            i++;
        }
        return true;
    }


    public MyString toLowerCase() {
        char[] charCopy = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charCopy[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString(charCopy);
    }


    public MyString toUpperCase() {
        char[] charCopy = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charCopy[i] = Character.toUpperCase(chars[i]);
        }
        return new MyString(charCopy);
    }


    public MyString substring(int beginIndex, int endIndex) throws IndexOutOfBoundsException {
        if (beginIndex < 0 || endIndex >= chars.length) {
            throw new IndexOutOfBoundsException();
        }
        int sublength = (endIndex - beginIndex + 1);
        char[] subchars = new char[sublength];
        System.arraycopy(chars, beginIndex, subchars, 0, sublength);
        return new MyString(subchars);
    }


    public MyString trim() {
        int frontSpaces = 0, backSpaces = 0;
        int i = 0;
        //count spaces in front
        while ((i < length) && (chars[i++] == ' '))
            frontSpaces++;

        i = length - 1;
        //count spaces in back
        while ((i >= frontSpaces) && (chars[i--] == ' '))
            backSpaces++;

        MyString result = new MyString();
        if ((frontSpaces + backSpaces) <= length) {
            result.length = this.length - frontSpaces - backSpaces;
            result.chars = new char[result.length];
            System.arraycopy(chars, frontSpaces, result.chars, 0, result.length);
        }
        return result;
    }


    public boolean contains(MyString subString) {
        return !(subString == null || this.length() < subString.length()) &&
                contains(subString.chars);
    }


    public boolean contains(char[] ch) {
        if (ch == null || this.chars.length < ch.length) return false;
        boolean result = false;
        for (int i = 0; i < this.chars.length; i++) {
            if (this.chars[i] == ch[0]) {
                if ((this.chars.length - i) < ch.length) {
                    return false;
                }
                for (int k = 0; k < ch.length; k++) {
                    if (this.chars[i + k] == ch[k]) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }

}
