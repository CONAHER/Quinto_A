
package Main;

public class Empleado extends Persona {
    private String Codigo;
    private String Area;
    private String Tipo;

    public Empleado() {
    }

    public Empleado(String Nombre, String Apellido, String Genero, int dpi,String Codigo, String Area, String Tipo) {
        super(Nombre, Apellido, Genero, dpi);
        this.Codigo = Codigo;
        this.Area = Area;
        this.Tipo = Tipo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Empleado{\n Nombre="+super.getNombre()+"\n Apellido="+super.getApellido()+
                "\n Genero="+super.getGenero()+"\n DPI="+super.getDpi() +
                "\n Codigo=" + Codigo + "\n Area=" + Area + "\n Tipo=" + Tipo + '}';
    }
    
    
    
}
