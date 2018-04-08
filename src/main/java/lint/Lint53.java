package lint;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lint53 {

    public static void main(String[] args) {
        String s = "you are silly";
        Lint53 lint53 = new Lint53();

        System.out.println(lint53.reverseWords(s));
    }

//    public String reverseWords(String s) {
//
//        if (null == s) {
//            return null;
//        }
//
//        int length = s.length();
//        StringBuilder resultBuilder = new StringBuilder(length);
//        Deque<StringBuilder> stack = new ArrayDeque<>();
//        StringBuilder tempBuilder = new StringBuilder();
//        char tempChar;
//        boolean inWord = false;
//
//        for (int i = 0; i < length; i++) {
//
//            tempChar = s.charAt(i);
//            if (!(' ' == tempChar || '\t' == tempChar || '\n' == tempChar)) {
//                inWord = true;
//                tempBuilder.append(tempChar);
//            } else if (inWord) {
//
//                inWord = false;
//                stack.addFirst(tempBuilder);
//                tempBuilder = new StringBuilder();
//            }
//        }
//
//        if (0 != tempBuilder.length()) {
//            stack.addFirst(tempBuilder);
//        }
//
//
//        while (!stack.isEmpty()) {
//            resultBuilder.append(stack.removeFirst()).append(' ');
//        }
//
//        if (resultBuilder.length() >= 1) {
//            resultBuilder.deleteCharAt(resultBuilder.length() - 1);
//        }
//
//        return resultBuilder.toString();
//    }

    public String reverseWords(String s) {

        if (null == s) {
            return null;
        }

        Pattern pattern = Pattern.compile("(\\S+)");
        Matcher matcher = pattern.matcher(s);
        Deque<String> stack = new ArrayDeque<>();
        StringBuilder resultBuilder = new StringBuilder(s.length());

        while (matcher.find()){
            stack.push(matcher.group());
        }

        while (!stack.isEmpty()) {
            resultBuilder.append(stack.removeFirst()).append(' ');
        }

        if (resultBuilder.length() >= 1) {
            resultBuilder.deleteCharAt(resultBuilder.length() - 1);
        }

        return resultBuilder.toString();
    }
}
