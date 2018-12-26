import java.util.Scanner;

public class Main222 {


    public static void main(String[] args) {
        int n = scanner.nextInt();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int j = scanner.nextInt();  //lei
        int k = scanner.nextInt();
        boolean flag = true;
//        init(n, m);
        StringBuilder res = new StringBuilder();
        int currenti = 1;
        int currentj = 1;
        for (int t = 0; t < k; t++) {
            int i = scanner.nextInt();  //hang
        }
        if (flag) {
            if (flag) {
                if (i >= currenti) {
                    int ss = i - currenti;
                    currenti = i;
                    for (int l = 0; l < ss; l++) {
                        res.append("D");
                    }
                }
                if (j >= currentj) {
                    int ss = j - currentj;
                    currentj = j;
                    for (int l = 0; l < ss; l++) {
                        res.append("R");
                    }
                }
                if (i < currenti || j < currentj) {
                    flag = false;
                    res.delete(0, res.length());
                    res.append("Impossible");
                }
            }
            for (int i = 0; i < n - currenti; i++) {
//            System.out.print("d");
                res.append("D");
            }
            for (int i = 0; i < m - currentj; i++) {
//            System.out.print("r");
                res.append("R");
            }
        }
        System.out.println(res);
    }


}
