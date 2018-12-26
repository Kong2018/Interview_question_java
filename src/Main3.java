import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Goodluck on 2017/9/16.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
//        int[] a = new int[m * n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                a[i * m + j] = (i + 1) * (j + 1);
//            }
//        }
//        Arrays.sort(a);
//        System.out.println(a[k - 1]);
        int re = 0, a;
        for (int i = 0; i < n; i++) {
            a = 2 * (m - i) - 1;
            re += a;
            if (re > k) {
                System.out.println(re);
                System.out.println(k);
                int resoult= (int) ((Math.ceil((k + 1-(re-a)) * 1.0 / 2)+i)*(i+1));
                System.out.println(resoult);
                break;
            }
        }
    }
}
