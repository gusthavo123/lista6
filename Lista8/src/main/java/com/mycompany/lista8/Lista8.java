
package com.mycompany.lista8;
import java.util.Scanner;
/**
 *
 * @author labinfo
 */
public class Lista8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int A [][] = new int [4][4];
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j ++){
             System.out.println("informe a linha: " + i + " e coluna: " + j);
             A[i][j] = ler.nextInt ();
            if(A[i][j] > 10){
            System.out.println ("O números maiores que 10 são:" + A[i][j]);
            }
         }
        }
      }
    }
