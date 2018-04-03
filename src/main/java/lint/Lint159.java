package lint;

public class Lint159 {

    public static void main(String[] args) {
        Lint159 lint159 = new Lint159();
        int[] nums = {1, 1, 1, 0, 0};
        System.out.println(lint159.findMin(nums));
    }

    public int findMin(int[] nums) {
        // write your code here

        int length = nums.length;
        int start = 0;
        int end = length - 1;
        int mid;

        while (start < end) {

            mid = (start + end) / 2;

            if (nums[mid] == nums[start] && nums[start] == nums[end]) {
                start++;
            }

            if (nums[mid] >= nums[start] && nums[start] >= nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }
}
