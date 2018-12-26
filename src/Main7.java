import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Goodluck on 2017/9/20.
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            if (right > a.length) {
                right = a.length;
            }
            if (left > a.length) {
                left = a.length;
            }
            int num = 0;
            for (int j = left - 1; j < right - 2; j++) {
                if (a[j] <= a[j + 1] && a[j + 1] <= a[j + 2]) {
                    num++;
                }
            }
//            res[i] = num;
            System.out.println(num);
        }
//        for (int i = 0; i < res.length; i++) {
//            System.out.println(res[i]);
//        }
    }
}
