public class Sort {

    /**
     * 插入排序，从小到大排列
     *
     * @param nums
     */
    public static void sort(int[] nums) {

        int length = nums.length;
        int temp;//存储临时值

        //从无序序列中选择一个数插入有序序列中
        for (int i = 1; i < nums.length; i++) {

            //从右到左开始进行插入
            temp = nums[i];
            for (int j = i; j > 0; j--) {

                if (temp>nums[j-1]){
                    nums[j] = temp;
                    break;
                }

                //将temp向前移动
                nums[j] = nums[j-1];
            }
        }
    }


//    /**
//     * 选择排序,从小到大
//     * @param nums
//     */
//    public static void sort(int[] nums){
//
//        int min;//暂存数组中的最小值
//        int length = nums.length;
//        int indexOfMin;
//
//        for (int i = 0; i <length-1 ; i++) {
//
//            min = nums[i];
//            indexOfMin = i;
//
//            //选出最小值
//            for (int j = i; j < length; j++) {
//                if (min>nums[j]){
//                    min = nums[j];
//                    indexOfMin = j;
//                }
//            }
//
//            //交换
//            nums[indexOfMin] = nums[i];
//            nums[i] = min;
//        }
//    }


//    /**
//     * 冒泡排序,从小到大
//     *
//     * @param nums
//     */
//    public static void sort(int[] nums) {
//
//        int temp;//保存临时值
//        int length = nums.length;
//
//        for (int i = 0; i < length; i++) {
//
//            for (int j = length - 1; j > i; j--) {
//
//                //比较并且交换值
//                if (nums[j] < nums[j - 1]) {
//                    temp = nums[j];
//                    nums[j] = nums[j - 1];
//                    nums[j - 1] = temp;
//                }
//            }
//        }
//    }
}
