 
/*
 https://www.interviewstreet.com/challenges/dashboard/#problem/4edb8abd7cacd
 */

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);



        int N = le.nextInt();
        for (int i = 0; i < N; i++) {
            int soma = 0;
            String str = le.next();

            char[] c = str.toCharArray();
            int la = c.length;
            for (int j = 0; j < la; j++) {
                int cont = 0;
                //   String prefixo = str.substring(j, la);
                // System.out.println(prefixo+" "+j);
                int lb = la - j;
                for (int k = 0; k < lb; k++) {
                    if (c[j + k] == c[k]) {
                        cont++;
                    } else {
                        break;
                    }
                }
                //System.out.println(prefixo + " = " + cont);
                soma += cont;
            }

            System.out.println(soma);

        }
    }
}