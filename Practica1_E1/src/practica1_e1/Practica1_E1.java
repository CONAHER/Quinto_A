
package practica1_e1;

import java.util.Scanner;

public class Practica1_E1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/*/*/ Ejercicio1 /*/*/*/*/*/");
        System.out.println("Ingrese numero A:");
        int a = teclado.nextInt();
        System.out.println("Ingrese numero B:");
        int b = teclado.nextInt();        
        System.out.println("Ingrese numero C:");
        int c = teclado.nextInt();
        System.out.println("Ingrese numero D:");
        int d = teclado.nextInt();
        
        //Operaciones
        int s = a+b;
        int r = c-d;
        int m = s*r;
        double div = m / 100;
        System.out.println("La suma de a y b = "+s);
        System.out.println("La resta de c y d = "+r);
        System.out.println("La mult de suma y resta = "+m);
        System.out.println("La division de mult sobre 100 = "+div);
    }
    
}
