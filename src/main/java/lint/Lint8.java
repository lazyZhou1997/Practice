package lint;

import java.util.Arrays;

public class Lint8 {

    public static void main(String[] args) {

        Lint8 lint8 = new Lint8();

        char[] str = "abcdefg".toCharArray();
        lint8.rotateString(str, 8);

        String s = new String(str);
        System.out.println(s);
    }

    public static void reverse(char[] chars, int start, int end) {

        char temp;

        while (start < end) {

            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;

        }
    }

    /**
     * 从右往左第offset个字符为分界点，先分别翻转前半部分和后半部分，然后整体翻转
     *
     * @param str
     * @param offset
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if (0 == offset || 0 == str.length) {
            return;
        } else {
            offset %= str.length;
        }


        reverse(str, 0, str.length - offset - 1);
        reverse(str, str.length - offset, str.length - 1);
        reverse(str, 0, str.length - 1);

    }

}
