
package Main;

public class Cliente extends Persona {
    private int NIT;
    private String Direccion;
    
    public Cliente(){
    }
    
    public Cliente(String Nombre, String Apellido,String Genero, int Telefono, int NIT, String Direccion){
        super(Nombre, Apellido, Genero, Telefono);
        this.NIT = NIT;
        this.Direccion = Direccion;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Cliente{\n Nombre="+super.getNombre()+"\n Apellido="+super.getApellido()+"\n Genero="+super.getGenero()+"\n Telefono="+super.getTelefono()+"\n NIT=" + NIT + "\n Direccion=" + Direccion + "\n}";
    }

//    @Override
//    public String toString() {
//        return "Cliente{\n "+super.toString() + "\n NIT=" + NIT + "\n Direccion=" + Direccion + '}';
//    }
    
    
  
    
}
