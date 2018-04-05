package lint;

/**
 * @Author: 周秦春
 * @Description:
 * @Date: Create in 2018/4/5 11:57
 * @ModifyBy:
 */
public class Lint13 {

    public static void main(String[] args) {

        Lint13 lint13 = new Lint13();

        System.out.println(lint13.strStr("afsagfs", "sa"));
    }

    public int strStr(String source, String target) {

        if (null == source || null == target) {
            return -1;
        }

        int length = source.length();
        int targetLength = target.length();

        if (0 == targetLength) {
            return 0;
        }

        boolean finded = false;

        int end = length - targetLength + 1;
        for (int i = 0; i < end; i++) {

            for (int j = 0; j < targetLength; j++) {
                if (source.charAt(i + j) == target.charAt(j)) {
                    finded = true;
                } else {
                    finded = false;
                    break;
                }
            }

            if (finded) {
                return i;
            }
        }

        return -1;
    }
}
