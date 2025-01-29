
package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Programa Tabla  ");
        System.out.print("Ingrese un numero: ");
        int num = teclado.nextInt();
        System.out.println("tabla por do while:");
        int k = 1;
        do{
            int mul = num * k;
            System.out.println(" "+num+" x "+k+" = "+mul);
            k+=1;
        }while(k<=100);
//        System.out.println(" tabla por while true");
//        int i = 1;
//        while(true){
//            int mul = num * i;
//            // num x i = resultado  -> 4 , 8
//            // 4 x 1 = 4, 4 x 2 = 8, 4 x 24 = XX, 4 x 25 = xx
//            System.out.println(" "+num+" x "+i+" = "+mul);
//            i+=1; // i = i+1; i = 1+1 -> 2 , 3 , 25, 26
//            // 2 > 25  --> false,  3 > 25  --> false, 26 > 25  --> false
//            if (i > 100) {
//                break;
//            }
//        }
//        System.out.println("\ntabla por while");
//        int j = 1;
//        while(j <= 100){
//             int mul = num * j;
//            System.out.println(" "+num+" x "+j+" = "+mul);
//            j+=j;
//        }
    }
    
    
}
