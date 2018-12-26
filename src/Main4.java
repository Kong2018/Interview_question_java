import java.util.Scanner;

/**
 * Created by Goodluck on 2017/9/16.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            System.out.println(s.indexOf("R"));
            if(s.indexOf("R")==0&&s.indexOf("C")>1){
//RC格式
            }
        }
    }
}
