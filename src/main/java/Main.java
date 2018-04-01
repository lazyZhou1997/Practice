import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        StringBuilder stringBuilder = new StringBuilder(s);

        int count = 0;
        int temp = -1;
        while (count<2) {


            if (-1 == (temp = stringBuilder.indexOf("1"))){
                System.out.println(count*10*1+1);
                return;
            }else {
                stringBuilder.delete(temp,temp);
            }

            if (-1 == (temp = stringBuilder.indexOf("2"))){
                System.out.println(count*10*2+2);
                return;
            }else {
                stringBuilder.delete(temp,temp);
            }

            if (-1 == (temp = stringBuilder.indexOf("3"))){
                System.out.println(count*10*3+3);
                return;
            }else {
                stringBuilder.delete(temp,temp);
            }

            if (-1 == (temp = stringBuilder.indexOf("4"))){
                System.out.println(count*10*4+4);
                return;
            }else {
                stringBuilder.delete(temp,temp);
            }

            if (-1 == (temp = stringBuilder.indexOf("5"))){
                System.out.println(count*10*5+5);
                return;
            }else {
                stringBuilder.delete(temp,temp);
            }

            if (-1 == (temp = stringBuilder.indexOf("6"))){
                System.out.println(count*10*6+6);
                return;
            }else {
                stringBuilder.delete(temp,temp);
            }
            if (-1 == (temp = stringBuilder.indexOf("7"))){
                System.out.println(count*10*7+7);
                return;
            }else {
                stringBuilder.delete(temp,temp);
            }
            if (-1 == (temp = stringBuilder.indexOf("8"))){
                System.out.println(count*10*8+8);
                return;
            }else {
                stringBuilder.delete(temp,temp);
            }
            if (-1 == (temp = stringBuilder.indexOf("9"))){
                System.out.println(count*10*9+9);
                return;
            }else {
                stringBuilder.delete(temp,temp);
            }
            if (-1 == (temp = stringBuilder.indexOf("0"))){
                if (count>0){
                    System.out.println(100);
                }else {
                    System.out.println(10);
                }
                return;
            }else {
                stringBuilder.delete(temp,temp);
            }

            count++;
        }


    }

}
