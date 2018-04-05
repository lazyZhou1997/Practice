package lint;

import sun.security.util.Length;

/**
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/5 21:42
 * @ModifyBy:
 */
public class Lint28 {

    public static void main(String[] args) {
        Lint28 lint28 = new Lint28();

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};

        System.out.println(lint28.searchMatrix((matrix), 0));
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        if (null == matrix || 0 == matrix.length) {
            return false;
        }

        int with = matrix[0].length;
        int row = matrix.length - 1;
        int col = 0;

        while (row >= 0 && col < with) {

            if (matrix[row][col] > target) {
                row--;
            } else if (matrix[row][col] < target) {
                col++;
            } else {
                return true;
            }
        }

        return false;
    }
}
