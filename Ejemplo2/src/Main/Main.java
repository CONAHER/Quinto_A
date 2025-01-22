
package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Entrada de Datos por Consola
        //Declaracion de objeto
        // tipoDato indentificador = new tipoDato();
        Scanner teclado = new Scanner (System.in);
        System.out.println("/*/*/*/*/ PROGRAMA COMPRAS /*/*/*/*/");
        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.next();
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();
        System.out.println("Monto de compra: ");
        double compra = teclado.nextDouble();
        System.out.println("\n El nombre es "+nombre+" con edad "+edad+" su compra fue de Q."+compra);
    }
    
}
