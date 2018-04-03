package lint;

/**
 * Write an algorithm which computes the number of trailing zeros in n factorial.
 *
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/3 22:43
 * @ModifyBy:
 */
public class Lint2 {

    public static void main(String[] args) {
        Lint2 lint2 = new Lint2();
        System.out.println(lint2.trailingZeros(5555550000000l));
    }

//    /**
//     * 递归解法
//     * @param n
//     * @return
//     */
//    public long trailingZeros(long n) {
//        // write your code here, try to do it without arithmetic operators.
//        if (n<5){
//            return 0;
//        }
//        return n/5+trailingZeros(n/5);
//    }

    /**
     * 非递归解法
     *
     * @param n
     * @return
     */
    public long trailingZeros(long n) {

        if (n < 5) {
            return 0;
        }
        long count = 0;//count如果使用int可能会溢出
        while ((n = n / 5) >= 1) {
            count += n;
        }

        return count;
    }
}
