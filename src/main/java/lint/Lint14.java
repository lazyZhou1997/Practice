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
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(lint14.binarySearch(nums,3));
    }

    public int binarySearch(int[] nums, int target) {

        int start = 0;
        int end = nums.length;
        int mid;

        while (start < end) {
            mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
