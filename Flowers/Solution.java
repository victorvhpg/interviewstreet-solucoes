package Flowers;


//https://www.interviewstreet.com/challenges/dashboard/#problem/4fd05444acc45
import java.util.*;

class Solution {

    public static void main(String args[]) {	
        Scanner in = new Scanner(System.in);
        int N, K;
        N = in.nextInt();
        K = in.nextInt();

        int C[] = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = in.nextInt();
        }
        Arrays.sort(C);
        int total = 0;
        int[] cont = new int[K];
        for (int i = 0; i < K; i++) {
            cont[i] = 0;
        }
        for (int i = N - 1; i >= 0; i--) {
            total += (cont[i % K] + 1) * C[i];
            cont[i % K]++;

        }
        System.out.println(total);

    }
}
