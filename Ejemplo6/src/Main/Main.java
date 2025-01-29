
package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // tipodato indentificador = new tipoda [ tamaño ]
        int [] vector1 = new int [5];
        String [] vector3 = new String [10];
//        boolean [] vector4 = new boolean [5];
        
        // llenado del vector 
//        vector1 [0] = 25;
//        vector1 [1] = 1;
//        vector1 [2] = 5;
//        vector1 [3] = 10;
//        vector1 [4] = 3;
//        
        //impresion sin recorrer solo colocando posiciones
//        System.out.println("Impresion sin recorrido");
//        System.out.println(vector1[0]);
//        System.out.println(vector1[1]);
//        System.out.println(vector1[2]);
//        System.out.println(vector1[3]);
//        System.out.println(vector1[4]);
//        
        // impresion con recorrido aplicando el for
//        System.out.println("Impresion con recorrido (for)");
//        for (int i = 0; i < vector1.length; i++) {
//            System.out.println(vector1[i]);
//        }
        
        //declarar y a la vez llenar el vector
//        int [] vector2 = {10,15,24,30,35,32}; 
        
//        // llenado por entrada del usuario
        for (int i = 0; i < vector3.length; i++) {
            System.out.print("Ingrese cadena vector3 ["+i+"] =  ");
            String dato = teclado.next();
            vector3 [i] = dato;
            //vector[0] = h
            //vector[1] = o
            //vector [2] =l
            //vector [3] = a
            // .....
            // vector[9] = 
        }
//        
        System.out.println("Impresion del Vector 3 con recorrido");
        for (int i = 0; i < vector3.length; i++) {
            //sout ( vector[0]) -> h
            //sout (vector[1]) -> o
            System.out.println(vector3[i]);
        }
//        
    }
//    
}
