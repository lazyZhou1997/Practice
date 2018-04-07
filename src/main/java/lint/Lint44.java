package lint;

import java.util.List;

/**
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/7 17:05
 * @ModifyBy:
 */
public class Lint44 {

//    /**
//     * 方法一：贪心算法
//     *
//     * @param nums
//     * @return
//     */
//    public int minSubArray(List<Integer> nums) {
//
//        if (null == nums || nums.isEmpty()) {
//            return -1;
//        }
//
//        int sum = 0;
//        int minSub = Integer.MAX_VALUE;
//
//        for (Integer i :
//                nums) {
//            sum = Math.min(0, sum);//大于0的值直接丢弃
//            sum += i;
//            minSub = Math.min(minSub, sum);
//        }
//        return minSub;
//    }

//    /**
//     * 方法二：动态规划（区间和）
//     *
//     * @param nums
//     * @return
//     */
//    public int minSubArray(List<Integer> nums) {
//
//        if (null == nums || nums.isEmpty()) {
//            return -1;
//        }
//
//        int maxSum = 0;
//        int minSub = Integer.MAX_VALUE;
//        int sum = 0;
//
//        for (Integer i :
//                nums) {
//            maxSum = Math.max(maxSum, sum);
//            sum += i;
//            minSub = Math.min(minSub, sum - maxSum);
//        }
//        return minSub;
//    }

    /**
     * 方法三：动态规划（局部和全局最大值）
     *
     * @param nums
     * @return
     */
    public int minSubArray(List<Integer> nums) {

        if (null == nums || nums.isEmpty()) {
            return -1;
        }

        int size = nums.size();
        int[] localMin = new int[size];
        int[] globalMin = new int[size];
        localMin[0] = nums.get(0);
        globalMin[0] = nums.get(0);

        for (int i = 1; i < size; i++) {

            localMin[i] = Math.min(nums.get(i),localMin[i-1]+nums.get(i));
            globalMin[i] = Math.min(globalMin[i-1],localMin[i]);
        }


        return globalMin[size - 1];
    }
}
