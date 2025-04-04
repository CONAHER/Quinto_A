
package Main;

public class Main {

    public static void main(String[] args) {
        //String Nombre, String Apellido,String Genero, int Telefono, int NIT, String Direccion
        Persona cliente1 = new Cliente("Allan","Lopez","Masculino",123456,123456,"Ciudad");
        //String Nombre, String Apellido, String Genero, int telefono,String CodigoEmpelado, String AreaTrabajo
        Empleado empleado1 = new Empleado("Adrian","Hernandez","Masculino",654321,"AB00123","Recepcion");
        System.out.println(cliente1);
        System.out.println(" ");
        System.out.println(empleado1);
    }
    
}
