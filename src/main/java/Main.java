import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 用于记录应用信息
 */
class App implements Comparable {
    int rank;//排名
    int stream;//流量
    int money;//金钱

    public int compareTo(Object o) {
        App app = (App) o;

        double q1 = this.stream * 1.0 / this.money;
        double q2 = app.stream * 1.0 / app.money;

        if (q1 > q2) {
            return 1;
        } else if (q1 < q2) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int allSteam = in.nextInt();//获取拥有的流量
        String line = in.nextLine();
        Scanner scanner = new Scanner(line);
        //保存应用
        ArrayList<App> appList = new ArrayList(16);

        //获取流量和应用数目
        App app;
        while (scanner.hasNextInt()) {
            app = new App();
            app.stream = scanner.nextInt();
            appList.add(app);
        }
        scanner.close();

        //获取应用对应的金币
        int length = appList.size();
        for (int i = 0; i < length; i++) {
            app = appList.get(i);
            app.rank = i;
            app.money = in.nextInt();

        }
        in.close();

        //按所需流量与金币的比从小到大排序
        Collections.sort(appList);

        int[] maxIndex = new int[2];
        int maxValue = Integer.MIN_VALUE;
        int totalSteam = 0;
        int totalMoney = 0;
        for (int i = 0; i < length; i++) {

            app = appList.get(i);
            totalSteam = app.stream;
            totalMoney = app.money;
            while (totalSteam <= allSteam) {

            }
        }
    }

}
