//https://www.interviewstreet.com/challenges/dashboard/#problem/4f15e1bc8f8cd
package LuckyNumbers;


import  java.util.Scanner;
 class Solution{
     
  public static boolean isPrimo(long n){
          //numero divisivel por ele e por 1
         long l = (long) Math.sqrt(n);  
         for(long i = 2 ; i <=  l  ; i++){
             if( n % i == 0){
                    return false;
             } 
         }
         return (n >= 2 );
     }

     
    public static void main(String args[]){
        Scanner in =  new Scanner(System.in);
        int t = in.nextInt();
        if(t > 10000){return;}
        for(int i = 0 ; i  <  t ; i++ ){ // todos  os testes
            long a = in.nextLong();
            long b =  in.nextLong();
              int cont = 0 ;
            if(!(1 <= a && a <= b && b <= 1e18)){
                continue;
             }
            for(long j=a ; j < b ; j++){ // intervalo
                String num = String.valueOf(j);
                int soma = 0;
                int somaQuadrado = 0 ;
                for(int k =0 ; k <  num.length() ; k ++){
                       int y = Integer.parseInt(String.valueOf(num.charAt(k)));
                      soma += y;
                      somaQuadrado += Math.pow( y , 2);
                }
                if(isPrimo(soma) &&  isPrimo(somaQuadrado)){
                  //  System.out.println(num + " = ["+soma +"]" +  "[" + somaQuadrado  + "]");
                    cont++;
                }
            }
            System.out.println(cont);
        }
    }
} 