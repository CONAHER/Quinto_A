
package Main;

public class Cliente extends Persona{
    private int NIT;
    private int Telefono;

    public Cliente(String Nombre, String Apellido, String Genero, int dpi,int NIT, int Telefono) {
        super(Nombre, Apellido, Genero, dpi);
        this.NIT = NIT;
        this.Telefono = Telefono;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return "Cliente{\n Nombre="+super.getNombre()+"\n Apellido="+super.getApellido()+
                "\n Genero="+super.getGenero()+"\n DPI="+super.getDpi() +
                "\n NIT=" + NIT + "\n Telefono=" + Telefono + '}';
    }
    
    
    
}
