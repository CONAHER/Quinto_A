package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/*/ Tabla de Multiplicar /*/*/*/*/");
        System.out.print("Ingrese numero: ");
        int num = teclado.nextInt();
//        int i = 0;
//        for (i = 1; i <= 10; i++) {
//            int dato = num * i;
//            System.out.println(" " + num + " x " + i + " = " + dato);
//        }
//        System.out.println("el valor de i es: " + i);

//        int i = 1;
//        while(i <=10){
//            int dato = num *i;
//            System.out.println(" "+num+" x "+i+" = "+dato);
//            i +=1;
//        }
        
//        int i = 1;
//        while(true){
//            int dato = num * i;
//            System.out.println(" "+num+" x "+i+" = "+dato);
//            i+=1;
//            if (i>10) {
//                break;
//            }
//        }

          int i = 1;
          do{
              int dato = num * i;
              System.out.println(" "+num+" x "+i+" = "+dato);
              i+=1;
          }while(i<0);
    }

}
