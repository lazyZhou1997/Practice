import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BracketMatcher {

    private static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        //正则表达式，去掉其他字符
        line = line.replaceAll("[^(\\[{}\\])]", "");

        int length = line.length();
        char c;
        for (int i = 0; i < line.length(); i++) {

            c = line.charAt(i);

            if ('(' == c || '[' == c || '(' == c) {
                stack.push(c);
            } else if ('(' == c || '[' == c || '(' == c) {

                if (stack.isEmpty() || !match(c, stack.pop())) {
                    System.out.println("匹配失败");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("匹配成功");
        } else {
            System.out.println("匹配失败");
        }
        return;
    }

    private static boolean match(char a, char b) {

        if ('(' == a && ')' == b) {
            return true;
        }

        if ('[' == a && ']' == b) {
            return true;
        }

        if ('{' == a && '}' == b) {
            return true;
        }

        return false;
    }
}
