package lint;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/4 23:07
 * @ModifyBy:
 */
public class Lint9 {

    public static void main(String[] args) {
        Lint9 lint9 = new Lint9();
        List<String> list = lint9.fizzBuzz(15);
        for (String s :
                list) {
            System.out.println(s);
        }
    }

    public List<String> fizzBuzz(int n) {
        // write your code here
        List<String> result = new ArrayList<String>();

        boolean a;
        for (int i = 1; i <= n; i++) {

            if (0 == i % 3 && 0 == i % 5) {
                result.add("fizz buzz");
            } else {
                a = 0 == i % 3 ? result.add("fizz") : false;
                a = 0 == i % 5 ? result.add("buzz") : false;
                a = 0 != i % 3 && 0 != i % 5 ? result.add(String.valueOf(i)) : false;
            }
        }

        return result;
    }
}
