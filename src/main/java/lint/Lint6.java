package lint;

public class Lint6 {


    public static void main(String[] args) {

        Lint6 lint6 = new Lint6();

        int[] A = {1, 2, 3, 4};
        int[] B = {2, 4, 5, 6};

        int length = A.length + B.length;
        int[] result = lint6.mergeSortedArray(A, B);
        for (int i = 0; i < length; i++) {

            System.out.println(result[i]);
        }
    }

    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int alength = A.length;
        int blength = B.length;
        int totalLength = alength + blength;
        int[] result = new int[totalLength];

        int i, j, k;
        for (i = 0, j = 0, k = 0; i < alength && j < blength; k++) {

            if (A[i] > B[j]) {
                result[k] = B[j];
                j++;
            } else {
                result[k] = A[i];
                i++;
            }

        }


        while (i < alength) {
            result[k] = A[i++];
            k++;
        }

        while (j < blength) {
            result[k] = B[j++];
            k++;
        }

        return result;
    }
}
