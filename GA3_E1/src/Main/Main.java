
package Main;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
   
    public static void main(String[] args) {
        int m1 [][] = new int [4][4];
        int m2 [][] = new int [4][4];
        int m3 [][] = new int [4][4];
        Llenar(m1);
        Mostrar(m1);
        Llenar(m2);
        Mostrar(m2);
        Sumar(m1,m2,m3);
        Mostrar(m3);
    }
    
    public static void Llenar(int m [][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(" Ingrese dato ["+i+"]["+j+"] = ");
                int num = teclado.nextInt();
                m[i][j] = num;
            }
        }
    }
    
    public static void Mostrar(int m [][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
    public static void Sumar(int m1[][], int m2[][], int m3[][]){
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                m3[i][j] = m1[i][j]+m2[i][j];
            }
        }
    }
    
    
}
