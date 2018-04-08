package lint;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/8 10:09
 * @ModifyBy:
 */
public class Lint50 {

    public static void main(String[] args) {
        Lint50 lint50 = new Lint50();
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        List<Long> longs = lint50.productExcludeItself(nums);

        for (Long l :
                longs) {

            System.out.print(l + " ");
        }
    }

    public List<Long> productExcludeItself(List<Integer> nums) {
        if (null == nums) {
            return null;
        }

        int size = nums.size();
        List<Long> result = new ArrayList<>(size);
        if (0==size){ //1==size
            return result;
        }

        long temp;
        for (int i = 0; i < size; i++) {

            temp = 1;
            for (int j = 0; j < i; j++) {
                temp *= nums.get(j);
            }
            for (int j = i + 1; j < size; j++) {

                temp *= nums.get(j);
            }

            result.add(temp);
        }

        return result;
    }
}
