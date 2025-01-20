import java.util.Scanner;

public class A07 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        int L [] = new int [N + 1];
        int R [] = new int [N + 1];
        //前日比配列
        int S [] = new int [D + 1];
        for (int i = 0; i < D + 1; i++){
            S[i] = 0;
        }
        for (int i = 1; i < N + 1; i++) {
            L [i] = sc.nextInt();
            S [L[i]] += 1;
            R [i] = sc.nextInt();
            S [R[i] + 1] -= 1;
        }
        int total = 0;
        for (int i = 1; i < D + 1; i++) {
            total += S[i];
            System.out.println(total);
        }
    }
}
