
package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("/*/*/*/*/ PROGRAMA SUMA /*/*/*/*/");
        System.out.println("Ingrese primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int num2 = teclado.nextInt();
        int suma =  num1 + num2;
        System.out.println("La suma de los numero es: "+suma);
    }
    
}
