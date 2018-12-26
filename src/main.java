import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int j = 0; j < n; j++) {
            String password = scanner.next();
            int upperNum = 0, lowerNum = 0, intNum = 0, otherNum = 0;
            if (password.length() < 8) {
                System.out.println("NO");
            }
            if ((int) password.charAt(0) > 47 && (int) password.charAt(0) < 58) {
                System.out.println("NO");
            }

            for (int i = 0; i < password.length(); i++) {
                //判断大写字母
                if ((int) password.charAt(i) > 64 && (int) password.charAt(i) < 91) {
                    upperNum = upperNum + 1;
                }
                //判断小写字母
                else if ((int) password.charAt(i) > 96 && (int) password.charAt(i) < 123) {
                    lowerNum = lowerNum + 1;
                }
                //判断数字
                else if ((int) password.charAt(i) > 47 && (int) password.charAt(i) < 58) {
                    intNum = intNum + 1;
                }
                //判断其他字符个数
                else {
                    otherNum = otherNum + 1;
                }
            }
            if (otherNum > 0) {
                System.out.println("NO");
            }
            if ((lowerNum == 0 && upperNum == 0) || (lowerNum == 0 && intNum == 0) || (lowerNum == 0 && intNum == 0)) {
                System.out.println("NO");
            }
        }


    }
}
