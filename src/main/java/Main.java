import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int length = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        char c;

        for (int i = 0; i < length; i++) {
            c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        long result = 0;
        for (Integer count :
                map.values()) {
            if (1 == count) {
                result++;
            } else {
                for (int j = 1; j <= count; j++) {
                    result+=zuhe(count,j);
                }
            }
        }

        System.out.println(result);
    }


    public static long zuhe(int total, int num) {

        int result = 1;
        num = Math.max(num, total - num);
        for (int i = num + 1; i <= total; i++) {
            result *= i;
        }

        return result;
    }
}
