public class Sort {

    public static void main(String[] args) {

        int maxSize = 19;
        int[] nums = new int[maxSize];

        for (int i = 0; i < maxSize; i++) {
            nums[i] = (int) (Math.random() * 99);
        }


        System.out.println("排序之前：");
        display(nums);

//        insertSort(nums);
//        bubbleSort(nums);
//        selectSort(nums);
        quickSort(nums, 0, nums.length - 1);
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

        int length = nums.length;
        int temp;
        int index;

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
        int temp;
        int index;

        for (int i = 0; i < length; i++) {

            temp = nums[i];
            index = i;
            for (int j = i; j < length; j++) {

                if (temp > nums[j]) {
                    index = j;
                    temp = nums[j];
                }
            }

            nums[index] = nums[i];
            nums[i] = temp;
        }
    }


    /**
     * 快速排序，递归实现
     *
     * @param nums
     */
    public static void quickSort(int[] nums, int left, int right) {

        if (left > right) {
            return;
        }

        /**
         * 进行划分
         */
        int start = left;
        int end = right - 1;
        int temp;

        while (true) {
            while (start < right && nums[start] < nums[right]) {
                start++;
            }

            while (end > left && nums[end] > nums[right]) {
                end--;
            }

            if (left > right) {//划分结束时的时候交换

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
