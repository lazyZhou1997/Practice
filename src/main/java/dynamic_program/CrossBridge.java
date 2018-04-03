package dynamic_program;

import java.util.Arrays;

public class CrossBridge {

    public static void main(String[] args) {
        int[] times = {1, 2, 5, 10};
        System.out.println(cross(times));
    }

    /**
     * 过桥问题求解。动态规划
     *
     * @param times 要过桥的人过桥花费的时间
     * @return
     */
    public static int cross(int[] times) {
        //对要过桥的人进行排序
        Arrays.sort(times);

        int length = times.length;
        int[] opts = new int[length + 1];//结果集

        opts[0] = 0;//0个人过桥花费时间为0
        opts[1] = times[0];
        opts[2] = times[1];

        //从第三个开始计算
        for (int i = 3; i <= length; i++) {

            opts[i] = Math.min(opts[i - 1] + times[0] + times[i - 1], opts[i - 2] + times[0] + 2 * times[1] + times[i - 1]);
        }

        return opts[times.length];
    }
}
