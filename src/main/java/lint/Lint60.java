package lint;

public class Lint60 {

    public static void main(String[] args) {
        int[] A = {};
        Lint60 lint60 = new Lint60();

        System.out.println(lint60.searchInsert(A, 0));
    }

    public int searchInsert(int[] A, int target) {

        if (0 == A.length) {
            return 0;
        }

        int start = 0;
        int end = A.length - 1;
        int mid = 1;

        while (start <= end) {//注意，二分查找要用小于等于符号

            mid = (start + end) / 2;
            if (A[mid] < target) {
                start = mid + 1;
            } else if (A[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        if (A[mid] < target) {
            return mid + 1;
        } else {
            return mid;
        }

    }
}
