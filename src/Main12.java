import java.util.Scanner;

/**
 * Created by Goodluck on 2017/9/28.
 */
public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] input = new float[n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextFloat();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i + 2; j < n; j++) {
                if (input[j] - input[i] < 180) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
