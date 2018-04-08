package lint;

import sun.security.util.Length;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/8 12:53
 * @ModifyBy:
 */
public class Lint55 {

    public static void main(String[] args) {
        String A = "AABC";
        String B = "AA";

        Lint55 lint55 = new Lint55();
        System.out.println(lint55.compareStrings(A, B));
    }

//    public boolean compareStrings(String A, String B) {
//
//        if (null == A || null == B) {
//            return false;
//        }
//
//        int length = B.length();
//        HashMap<Character, Integer> BMap = new HashMap<>();
//        char tempChar;
//        for (int i = 0; i < length; i++) {
//
//            tempChar = B.charAt(i);
//            if (BMap.containsKey(tempChar)) {
//                BMap.put(tempChar, BMap.get(tempChar) + 1);
//            } else {
//                BMap.put(tempChar, 1);
//            }
//        }
//
//        length = A.length();
//        for (int i = 0; i < length; i++) {
//
//            tempChar = A.charAt(i);
//            if (BMap.containsKey(tempChar)) {
//                BMap.put(tempChar, BMap.get(tempChar) - 1);
//            }
//        }
//
//        for (Integer integer :
//                BMap.values()) {
//            if (integer > 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    public boolean compareStrings(String A, String B) {

        if (null == A || null == B) {
            return false;
        }

        int Blength = B.length();
        int Alength = A.length();
        int[] counts = new int[26];
        Arrays.fill(counts, 0);
        char tempChar;

        for (int i = 0; i < A.length(); i++) {
            tempChar = A.charAt(i);
            counts[tempChar - 'A']++;
        }

        for (int i = 0; i < B.length(); i++) {
            tempChar = B.charAt(i);
            if (counts[tempChar - 'A'] <= 0) {
                return false;
            }
            counts[tempChar - 'A']--;
        }

        return true;

    }

}
