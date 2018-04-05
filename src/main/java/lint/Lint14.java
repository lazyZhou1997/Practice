package lint;

/**
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/5 14:25
 * @ModifyBy:
 */
public class Lint14 {

    public static void main(String[] args) {
        Lint14 lint14 = new Lint14();
        int[] nums = {2, 6, 8, 13, 15, 17, 17, 18, 19, 20};

        System.out.println(lint14.binarySearch(nums, 15));
    }

    public int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0;
        int end = nums.length;
        int mid = 0;
        boolean find = false;

        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {

                find = true;
                break;
            }
        }

        //找到第一个元素
        if (find) {
            while (mid - 1 >= 0 && nums[mid - 1] == nums[mid]) {
                mid--;
            }

            return mid;
        }

        return -1;
    }
}
