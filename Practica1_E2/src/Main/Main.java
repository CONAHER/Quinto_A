
package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //programa notas
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/*/*/ Ejercicio1 /*/*/*/*/*/");
        System.out.print("Ingrese nota1: ");
        int n1 = teclado.nextInt();
        System.out.print("Ingrese nota2: ");
        int n2 = teclado.nextInt();
        System.out.print("Ingrese nota3: ");
        int n3 = teclado.nextInt();
        System.out.print("Ingrese nota4: ");
        int n4 = teclado.nextInt();
        System.out.print("Ingrese nota5: ");
        int n5 = teclado.nextInt();
        float promedio = (n1+n2+n3+n4+n5) /5;
        if (promedio>= 90 && promedio <=100) {
            System.out.println("Promedio Excelente");
        }else if( promedio >=70 && promedio <= 89){
            System.out.println("Promedio Bueno");
        }else if(promedio >=60 && promedio <=69){
            System.out.println("Promedio Regular");
        }else if (promedio >= 0 && promedio <= 59){
            System.out.println("Necesito Estudiar");
        }else{
            System.out.println("El promedio o notas no son correctas ");
        }
    }
    
}
