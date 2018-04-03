package lint;

import java.util.Arrays;

public class Lint791 {

    public int mergeNumber(int[] numbers) {

        int energy = 0;
        int length = numbers.length;
        int temp;

        //先让数组从小达到排序
        Arrays.sort(numbers);

        int index;
        for (int i = 0; i < length - 1; i++) {

            temp = numbers[i] + numbers[i + 1];
//            numbers[i + 1] = temp;
//            Arrays.sort(numbers, i, length);
            index = i + 1;
            for (int j = i + 2; j < length; j++) {
                if (numbers[j] < temp) {
                    numbers[j - 1] = numbers[j];
                    index = j;
                }
            }
            numbers[index] = temp;
            energy += temp;
        }

        return energy;
    }

}