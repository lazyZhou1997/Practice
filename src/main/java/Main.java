import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int K = in.nextInt();
        int A = in.nextInt();
        int X = in.nextInt();
        int B = in.nextInt();
        int Y = in.nextInt();

        long count = 0;
        int temp;

        for (int i = 0; i <= X; i++) {

            for (int j = 0; j <= Y; j++) {

                temp = i * A + j * B;
                if (temp == K) {
                    count += zuhe(X, i) * zuhe(Y, j);
                    System.out.println(count);
                    count %= 1000000007;
                } else if (temp > K) {
                    break;
                }
            }
        }

        System.out.println(count % 1000000007);

    }


    /**
     * 求组合
     *
     * @param total
     * @param num
     * @return
     */
    public static long zuhe(int total, int num) {

        int temp = Math.max(num, total - num);
        if (temp == total) {
            return 1;
        }

        long result = 1;
        for (int i = temp + 1; i <= total; i++) {
            result *= i;
            result %= 1000000007;
        }
        return result;
    }
}