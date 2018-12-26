import java.util.Scanner;

/**
 * Created by Goodluck on 2017/9/17.
 */
public class Main5 {
    public static void main(String[] args) {
        int r = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            r += a[i];
        }
        int i = 0, j = a.length - 1;
        while (i < j) {
            if (a[i] == a[j]) {
                i++;
                j--;
            } else if (a[i] < a[j]) {
                r += a[i];
                i++;
            } else if (a[i] > a[j]) {
                r += a[j];
                j--;
            }

        }
        System.out.println(r);
    }
}
