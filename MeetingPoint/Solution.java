//https://www.interviewstreet.com/challenges/dashboard/#problem/4e14b2cc47f78
package MeetingPoint;

import java.util.Scanner;

 
class Solution {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        long soma = 0;
        int N = le.nextInt();
        long[][] mapa = new long[N][2];
        for (int i = 0; i < N; i++) {
            mapa[i][0] = le.nextLong();
            mapa[i][1] = le.nextLong();

        }
        long menor = -1;
        for (int i = 0; i < N; i++) { ///  casa  destino
            long x1 = mapa[i][0];
            long y1 = mapa[i][1];
            soma = 0;
            for (int j = 0; j < N; j++) {//cada casa partida
                long x2 = mapa[j][0];
                long y2 = mapa[j][1];
                int contPassos = 0;
                while (x2 != x1 || y2 != y1) {//enquanto nao chegar
                    if (x2 < x1) {
                        x2++;
                    } else if (x2 > x1) {
                        x2--;
                    }
                    if (y2 < y1) {
                        y2++;
                    } else if (y2 > y1) {
                        y2--;
                    }
                    contPassos++;
                }
                soma += contPassos;
                if (soma > menor && menor != -1) {
                    break;
                }
            }
           
            if (soma < menor || menor == -1) {
                menor = soma;
            }
        }
        System.out.println(menor);
    }
}