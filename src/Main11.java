import java.util.Scanner;
import java.util.Set;

/**
 * Created by Goodluck on 2017/9/21.
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            int[] input = new int[12];
            for (int j = 0; j < 12; j++) {
                input[i] = scanner.nextInt();
            }
            Line line = new Line(input[0], input[1], input[2], input[3]);
            Line line2 = new Line(input[4], input[5], input[6], input[7]);
            Line line3 = new Line(input[8], input[9], input[10], input[11]);

//            Set<Line> lines = new Set<>();
        }

    }

    static class Line {
        public int StartX;
        public int StartY;
        public int EndX;
        public int EndY;

        public Line(int startX, int startY, int endX, int endY) {
            StartX = startX;
            StartY = startY;
            EndX = endX;
            EndY = endY;
        }
    }

}
