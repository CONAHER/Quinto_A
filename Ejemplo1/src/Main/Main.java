
package Main;

public class Main {

    public static void main(String[] args) {
       // Utilizando operadores aritmeticos
//       int num1 = 5;
//       int num2 = 4;
//       int suma = num1+num2;
//       int resta = num1 - num2;
//       int multi = num1 * num2;
//       int div = num1 / num2;
//       int mod = num1 % num2;
//        System.out.println("la suma es: "+suma);
//        System.out.println("la resta es: " + resta);
//        System.out.println("la multi. es: "+multi);
//        System.out.println("la division es: "+div);
//        System.out.println("el modulo es: "+mod);

//CONDICIONALES

// IF BASICO 
//        int num = 5;
//        if (num <10) {
//            System.out.println("soy menor a 10");
//        }

// IF SIMPLE
//int num = 5;
//        if (num<10) {
//            System.out.println("Soy menor a 10");
//        }else{
//            System.out.println("Soy mayor a 10");
//        }
//    }


// IF COMPUESTO
//        int a =10;
//        int b = 20;
//        int c = 30;
//        int d = 25;
//        if (d>a && d<b) {
//            System.out.println("Esta en el primer rango de 10 a 20");
//        }else if(d>b && d < c){
//            System.out.println("Esta en el segundo rango de 20 a 30");
//        }else {
//            System.out.println("Esta fuera de rango ");
//        }
 
//          IF ANIDADO
        int num1 = 5;
        int num2 = 4;
        if (num1 == 5 || num2 !=4) {           
            // TRUE (1) || FALSE (0)
            if (num2 > num1) {
                // 4 > 5 (FALSE)
                System.out.println("numero 2 es mayor a numero1");
            }else{
                System.out.println("numero 1 es mayor a numero 2");
            }
        }

    }
    
}
