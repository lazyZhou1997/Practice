//package lint;
//
//import java.util.HashMap;
//
///**
// * @Author: 周秦春
// * @Description:
// * @Date: Create in 2018/4/8 13:35
// * @ModifyBy:
// */
//public class Lint56 {
//
//    public static void main(String[] args) {
//        int[] numbers = {2, 7, 11, 15};
//        Lint56 lint56 = new Lint56();
//
//        int[] results = lint56.twoSum(numbers, 9);
//
//        for (int i = 0; i < results.length; i++) {
//
//            System.out.println(results[i]);
//        }
//    }
//
//    public int[] twoSum(int[] numbers, int target) {
//
//        if (null == numbers || numbers.length < 2) {
//            return null;
//        }
//
//        int length = numbers.length;
//        HashMap<Integer, Integer> numberMap = new HashMap<>();
//        int temp;
//        for (int i = 0; i < length; i++) {
//            temp = target - numbers[i];
//            if (numberMap.containsKey(temp)) {
//                return new int[]{numberMap.get(temp), i};
//            } else {
//                numberMap.put(numbers[i], i);
//            }
//        }
//
//        return null;
//    }
//}
