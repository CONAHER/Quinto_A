
package Main;

public class Persona {
    private String Nombre;
    private String Apellido;
    private String Genero;
    private int dpi;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, String Genero, int dpi) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Genero = Genero;
        this.dpi = dpi;
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

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Genero=" + Genero + ", dpi=" + dpi + '}';
    }
    
    
}
