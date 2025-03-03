package Main;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        //Declaracion de Matrices
        int m1 [][]= new int [2][2];
        String m2 [][] = new String[2][2];
        Double m3 [][] = {{2.5,2.5},{5.5,5.5}};
        System.out.println("\n MATRIZ ENTERA");
        LlenadoEntero(m1);
        MostrarEntero(m1);
        System.out.println("\n MATRIZ STRING ");
        LlenadoString(m2);
        MostrarString(m2);
        System.out.println("\n MATRIZ DOUBLE");
        MostrarDouble(m3);
        System.out.println("\n CAMBIOS");
        m3 [1][1] = 1.5;
        m2 [0][1] = "X";
        MostrarDouble(m3);
        System.out.println("\n");
        MostrarString(m2);
        System.out.println("\n CAMBIOS DEL USUARIO");
        System.out.print("Ingrese fila: ");
        int f1 = teclado.nextInt();
        System.out.print("Ingrese columna: ");
        int c1 = teclado.nextInt();
        System.out.print("Ingrese letra:");
        String letra = teclado.next();
        m2 [f1][c1] = letra;
        MostrarString(m2);
    }
    
    public static void LlenadoEntero(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese dato ["+i+"]["+j+"] = ");
                int num = teclado.nextInt();
                matriz[i][j] = num;
            }
        }
    }
    
    public static void LlenadoString(String matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = "C";
            }
        }
    }
    
    public static void MostrarEntero(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
    public static void MostrarString(String matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
    public static void MostrarDouble(Double matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
