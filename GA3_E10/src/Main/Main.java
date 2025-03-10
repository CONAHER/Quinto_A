package Main;

import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String matriz[][] = new String[60][60];
        LlenadoInterno(matriz);
        Mostrar(matriz);
        System.out.println("\nIngrese el numero de cambios");
        int cambio = teclado.nextInt();
        Cambios(cambio,matriz);
        Mostrar(matriz);
    }

    public static void LlenadoInterno(String m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = "D";
            }
        }
    }

    public static void Mostrar(String m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void Cambios(int cambio, String m[][]) {
        if (cambio >= 0 && cambio <= (m.length * m[0].length)) {
            for (int i = 0; i < cambio; i++) {
                System.out.println(" Ingrese la fila: ");
                int fila = teclado.nextInt();
                System.out.println(" Ingrese la columna: ");
                int columna = teclado.nextInt();
                System.out.println(" Ingrese la cadena: ");
                String dato = teclado.next();
                
                if (fila>=0 && fila<m.length && columna>=0 && columna<m[0].length) {
                    m[fila][columna] = dato;
                }else{
                    System.out.println("Error fila o columna sobrepasa el limite");
                }
            }
        }else{
            System.out.println("Error no se puede realizar tantos cambios");
        }

    }

}
