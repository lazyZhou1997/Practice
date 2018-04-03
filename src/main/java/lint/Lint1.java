package lint;

/**
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/3 14:32
 * @ModifyBy:
 */
public class Lint1 {

    public static void main(String[] args) {
        Lint1 lint1 = new Lint1();
        System.out.println(lint1.aplusb(1412, 2124));
    }

    public int aplusb(int a, int b) {
        // write your code here
        int a1 = a ^ b;//没有进位
        int carry = (a & b) << 1;//进位
        int result = a1;

        if (0 != carry) {
            result = aplusb(result, carry);
        }

        return result;
    }
}
