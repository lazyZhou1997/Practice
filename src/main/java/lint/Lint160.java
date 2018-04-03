package lint;

public class Lint160 {

    public static void main(String[] args) {
        Lint160 lint160 = new Lint160();
        int[] nums = {999, 999, 1000, 1000, 10000, 0, 999, 999, 999};

        System.out.println(lint160.findMin(nums));
    }

    /**
     * 去除左边的无序部分，压缩右边的有序部分，
     * 当mid和start重复时，如果<code>nums[start]<nums[end]</code>,则找到了最小值，否则<code>start++</code>
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start < end) {

            mid = (start + end) / 2;

            if (nums[mid] > nums[start]) {
                if (nums[start] >= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            } else if (nums[mid] < nums[start]) {
                end = mid;
            } else if (nums[start] < nums[end]) {
                break;
            } else {
                start++;
            }
        }

        return nums[start];
    }
}
