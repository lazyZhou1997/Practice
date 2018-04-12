public class Sort {

    public static void main(String[] args) {

        int maxSize = 19;
//        int[] nums = {8, 88, 72, 48, 11, 8, 52, 85, 73, 56, 9, 79, 52, 57, 69, 52, 62, 98, 61};
        int[] nums = {20, 4, 35, 2, 37};
//        int[] nums = new int[maxSize];
//        for (int i = 0; i < maxSize; i++) {
//            nums[i] = (int) (Math.random() * 99);
//        }


        System.out.println("排序之前：");
        display(nums);

//        insertSort(nums);
//        bubbleSort(nums);
        selectSort(nums);
//        quickSort(nums, 0, nums.length - 1);
        System.out.println("排序之后：");
        display(nums);

    }

    public static void display(int[] nums) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {

            System.out.print(nums[i]);
            System.out.print(" ");
        }
    }

    /**
     * 插入排序
     *
     * @param nums
     */
    public static void insertSort(int[] nums) {

        int temp;
        int index;
        int length = nums.length;

        for (int i = 1; i < length; i++) {

            temp = nums[i];
            index = i;

            for (int j = i; j > 0; j--) {

                if (nums[j - 1] > temp) {
                    nums[j] = nums[j - 1];
                    index = j - 1;
                } else {
                    break;
                }
            }

            nums[index] = temp;
        }

    }

    /**
     * 冒泡排序
     *
     * @param nums
     */
    public static void bubbleSort(int[] nums) {

        int length = nums.length;
        int temp;

        for (int i = 0; i < length - 1; i++) {

            for (int j = length - 1; j > i; j--) {

                if (nums[j] < nums[j - 1]) {

                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }

            }
        }
    }

    /**
     * 选择排序
     *
     * @param nums
     */
    public static void selectSort(int[] nums) {

        int length = nums.length;
        int min;
        int index;

        for (int i = 0; i < length - 1; i++) {

            min = nums[i];
            index = i;

            for (int j = i + 1; j < length; j++) {

                if (min > nums[j]) {
                    min = nums[j];
                    index = j;
                }
            }
            nums[index] = nums[i];
            nums[i] = min;

        }

    }


    /**
     * 快速排序，递归实现
     *
     * @param nums
     */
    public static void quickSort(int[] nums, int left, int right) {

        if (left >= right) {
            return;
        }

        /**
         * 进行划分
         */
        int start = left;
        int end = right - 1;
        int temp;

        while (true) {
            //start不为等于，保证start结束时位于右边元素的最左边
            while (start < right && nums[start] < nums[right]) {
                start++;
            }

            //end为等于，保证start和end相同的时候也能交换
            while (end > left && nums[end] >= nums[right]) {
                end--;
            }

            if (start >= end) {//划分结束时的时候交换

                temp = nums[right];
                nums[right] = nums[start];
                nums[start] = temp;
                break;
            } else {

                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
        }

        /**
         * 进行递归
         */
        quickSort(nums, left, start - 1);
        quickSort(nums, start + 1, right);

    }

}
