import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * http://exercise.acmcoder.com/online/online_judge_ques?ques_id=3981&konwledgeId=42
 */
public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        int n = scanner.nextInt();
        while ((n--) > 0) {
            result += scanner.nextFloat() * scanner.nextFloat() / 100;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        System.out.println(decimalFormat.format(result));
    }
}

