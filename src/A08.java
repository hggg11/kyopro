import java.util.Scanner;

public class A08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int R[][] = new int[H + 1][W + 1];
        //R[1][0] = 0;
        int tmp = 0;
        for (int i = 1; i < H + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                R [i][j] = tmp + sc.nextInt();
                tmp = R[i][j];
            }
        }
        int Q = sc.nextInt();
        for (int i = 1; i < Q + 1; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            System.out.println(R[C][D] - R[H][B - 1] - R[A - 1][W] + R[A - 1][B - 1]);
        }
    }
}
