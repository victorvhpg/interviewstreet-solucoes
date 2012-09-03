 
//https://www.interviewstreet.com/challenges/dashboard/#problem/4f7272a8b9d15
package UnfriendlyNumbers;

import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int N;
        long K;
        int cont = 0;
        N = le.nextInt();
        K = le.nextLong();
        long[] vetN = new long[N];
        for (int i = 0; i < N; i++) {
            vetN[i] = le.nextLong();
        }
        long i = K;
        Arrays.sort(vetN);
        boolean div = false;
        for (int j = N - 1; j >= 0 && vetN[j] >= i ; j--) { //nao pode ser divi  por qualquer N
            if (vetN[j] % i == 0) {
                div = true;
                break;
            }
        }
        if (!div) {
            cont++;
        }
        i = (int) (K / 2);
        while (i >= 2) {//todos os divisiveuis
            if (K % i == 0) {//eh divisivel
                div = false;
                for (int j = N - 1; j >=0 && vetN[j] >= i ; j--) { //nao pode ser divi  por qualquer N
                    if (vetN[j] % i == 0) {
                        div = true;
                        break;
                    }
                }
                if (!div ) {
                    cont++;
                }
            }

            i--;

        }
        System.out.println(cont);
    }
}