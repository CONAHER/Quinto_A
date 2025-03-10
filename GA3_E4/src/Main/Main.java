
package Main;

public class Main {

    public static void main(String[] args) {
        int matriz [][] = new int [3][3];
        LlenadoInterno(matriz);
        Mostrar(matriz);
    }
    
    public static void LlenadoInterno(int m [][]){
        int contador = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = contador;
                contador ++;
            }
        }
    }
    
    public static void Mostrar(int m [][]){
         for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+"  ");
            }
             System.out.println(" ");
        }
    }
    
}
