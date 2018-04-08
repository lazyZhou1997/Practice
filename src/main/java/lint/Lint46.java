package lint;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/8 9:08
 * @ModifyBy:
 */
public class Lint46 {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);

        Lint46 lint46 = new Lint46();
        System.out.println(lint46.majorityNumber(nums));
    }

    public int majorityNumber(List<Integer> nums) {

        if (null == nums || nums.isEmpty()) {
            return -1;
        }

        int key = -1;
        int count = 0;
        for (Integer i :
                nums) {
            if (0 == count){
                key = i;
                count++;
                continue;
            }

            if (key==i){
                count++;
            }else {
                count--;
            }
        }

        return key;
    }
}
