package dynamic_program;

import java.util.Arrays;

/**
 * 算法导论中切钢条问题
 */
public class CutSteelBar {

    public static void main(String[] args) {
        int[] p = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
//        System.out.println(cut(p, 4));  //递归版本
//        System.out.println(cutMemo(p, 4)); //备忘录版本
        System.out.println(buttonUpCut(p, 4));
    }

    /**
     * 递归版本
     *
     * @param p
     * @param n
     * @return
     */
    public static int cut(int[] p, int n) {
        if (0 == n) {
            return 0;
        }
        int length = p.length;
        int q = Integer.MIN_VALUE;
        for (int i = 1; i <= n && i <= length; i++) {

            q = Math.max(q, p[i - 1] + cut(p, n - i));
        }

        return q;
    }

    /**
     * 备忘录版本
     *
     * @param p
     * @param n
     * @return
     */
    public static int cutMemo(int[] p, int n) {

        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        return cut2(p, n, memo);

    }

    public static int cut2(int[] p, int n, int r[]) {

        if (0 == n) {
            return 0;
        }

        if (r[n] > 0) {
            return r[n];
        }

        int q = Integer.MIN_VALUE;
        for (int i = 1; i <= n && i < p.length; i++) {
            q = Math.max(q, p[i - 1] + cut2(p, n - i, r));
        }

        return r[n] = q;
    }

    /**
     * 自底向上分析法
     *
     * @param p
     * @param n
     * @return
     */
    public static int buttonUpCut(int[] p, int n) {
        int[] r = new int[n + 1];
        r[0] = 0;

        int q;
        for (int i = 1; i <= n; i++) {

            q = Integer.MIN_VALUE;
            for (int j = 1; j <= i && j < p.length; j++) {
                q = Math.max(q, p[j - 1] + r[i - j]);
            }
            r[i] = q;
        }

        return r[n];
    }
}
