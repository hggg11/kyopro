import java.util.Scanner;

public class B07 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();
        int L [] = new int[T + 1];
        for (int i = 1; i < N + 1; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            L[start] ++;
            L[end] --;
        }
        int total = 0;
        for (int i = 0; i < T; i++) {
            total += L[i];
            System.out.println(total);
        }
    }
}
