package lint;

/**
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/7 15:36
 * @ModifyBy:
 */
public class Lint41 {

    public static void main(String[] args) {
        Lint41 lint41 = new Lint41();
        int[] nums = {-2, -2};

        System.out.println(lint41.maxSubArray(nums));
    }

    /**
     * 方法一：贪心算法
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSub = Integer.MIN_VALUE;
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            sum = Math.max(sum, 0);//小于0的直接丢弃
            sum += nums[i];
            maxSub = Math.max(maxSub, sum);//保存最大值
        }

        return maxSub;
    }

//    /**
//     * 方法二：动态规划（区间和）
//     *
//     * @param nums
//     * @return
//     */
//    public int maxSubArray(int[] nums) {
//
//        if (nums == null || 0 == nums.length) {
//            return -1;
//        }
//
//        int sum = 0;
//        int minSum = 0;
//        int maxSub = Integer.MIN_VALUE;
//        int length = nums.length;
//
//        for (int i = 0; i < length; i++) {
//            minSum = Math.min(minSum, sum);
//            sum += nums[i];
//            maxSub = Math.max(maxSub, sum - minSum);
//        }
//
//        return maxSub;
//    }

//    /**
//     * 方法三：动态规划（局部最大值与全局最大值）
//     *
//     * @param nums
//     * @return
//     */
//    public int maxSubArray(int[] nums) {
//
//        if (nums == null || 0 == nums.length) {
//            return -1;
//        }
//
//        int length = nums.length;
//        int[] localMaxs = new int[length];
//        int[] globleMaxs = new int[length];
//        localMaxs[0] = nums[0];
//        globleMaxs[0] = nums[0];
//
//        for (int i = 1; i < length; i++) {
//
//            localMaxs[i] = Math.max(nums[i], localMaxs[i - 1] + nums[i]);//比较当前值与加上上一个局部最大值后的最大值
//            globleMaxs[i] = Math.max(globleMaxs[i - 1], localMaxs[i]);
//        }
//
//        return globleMaxs[length - 1];
//    }
}
