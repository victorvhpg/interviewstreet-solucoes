//https://www.interviewstreet.com/challenges/dashboard/#problem/4e14b83d5fd12
package Pairs;

import  java.util.Scanner;
import java.util.Arrays;
     
 

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int cont = 0;
        int K, N;
        N = in.nextInt();
        K = in.nextInt();
        int[] vet = new int[(int) N];
        for (int i = 0; i < (int) N; i++) {
            vet[i] = in.nextInt();
        }
          Arrays.sort(vet);
        for (int i = N-1; i >0 ; i--) {
           
                if( vet[i] - vet[i-1] == K){
                    cont++;
                }


           


        }

        System.out.println(cont);

    }
}