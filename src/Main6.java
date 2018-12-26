import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Goodluck on 2017/9/20.
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            sum += a[i];
            if (sum >= t) {
                sum = sum - a[i] + a[a.length - 1];
                System.out.println(sum);
                break;
            } else if (i == a.length - 1) {
                System.out.println(sum);
            }
        }

    }
}
