
package Main;

public class Persona {
    private String Nombre;
    private String Apellido;
    private String Genero;
    private int Telefono;

    public Persona() {
    }

    public Persona(String Nombre, String Apelldio, String Genero, int telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apelldio;
        this.Genero = Genero;
        this.Telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    
    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

     public void Domir(){
        System.out.println("Durmiendo");
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Genero=" + Genero + ", Telefono=" + Telefono + '}';
    }
}
