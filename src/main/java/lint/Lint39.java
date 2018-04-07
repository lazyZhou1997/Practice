package lint;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/7 11:12
 * @ModifyBy:
 */
public class Lint39 {

    public static void main(String[] args) {
        Lint39 lint39 = new Lint39();
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        lint39.recoverRotatedSortedArray(nums);

        for (Integer i:
             nums) {
            System.out.print(i+" ");
        }
    }

    public void recoverRotatedSortedArray(List<Integer> nums) {
        if (null == nums) {
            return;
        }

        /**
         * 查找旋转点
         */
        int start = 0;
        int end = nums.size() - 1;
        int mid;

        while (start < end) {

            mid = (start + end) / 2;
            if (nums.get(mid) > nums.get(start)) {
                if (nums.get(start) >= nums.get(end)) {
                    start = mid + 1;
                } else {
                    break;
                }
            } else if (nums.get(mid) < nums.get(start)) {
                end = mid;
            } else {
                start++;
            }
        }

        /**
         * 三次旋转
         */
        reverse(nums,0,start-1);
        reverse(nums,start,nums.size()-1);
        reverse(nums,0,nums.size()-1);


    }

    private void reverse(List<Integer> nums,int start,int end) {
        Integer temp;

        while (start < end) {
            temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end, temp);
            start++;
            end--;
        }

        return;
    }
}
