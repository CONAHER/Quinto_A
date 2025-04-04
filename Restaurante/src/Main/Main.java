
package Main;

public class Main {

    public static void main(String[] args) {
        Restaurante McDonalds = new Restaurante("Calzada Roosevelth","Comida Rapida");
        McDonalds.AgregarCliente(0, "Jennifer", "Geronimo", "Femenino", 12560, 12450, 1234567);
        McDonalds.AgregarCliente(1, "Rolando", "Morales", "Femenino", 12560, 12450, 1234567);
        McDonalds.AgregarCliente(2, "Gabriela", "Acevedo", "Femenino", 12560, 12450, 1234567);
        McDonalds.MostrarCliente();
    }
    
}
