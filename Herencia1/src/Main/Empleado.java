
package Main;

public class Empleado extends Persona {
    private String CodigoEmpelado;
    private String AreaTrabajo;

    public Empleado() {
    }

    public Empleado(String Nombre, String Apellido, String Genero, int telefono,String CodigoEmpelado, String AreaTrabajo) {
        super(Nombre, Apellido, Genero, telefono);
        this.CodigoEmpelado = CodigoEmpelado;
        this.AreaTrabajo = AreaTrabajo;
    }
      
    
    public String getCodigoEmpelado() {
        return CodigoEmpelado;
    }

    public void setCodigoEmpelado(String CodigoEmpelado) {
        this.CodigoEmpelado = CodigoEmpelado;
    }

    public String getAreaTrabajo() {
        return AreaTrabajo;
    }

    public void setAreaTrabajo(String AreaTrabajo) {
        this.AreaTrabajo = AreaTrabajo;
    }

    @Override
    public String toString() {
        return "Empleado{\n Nombre="+super.getNombre()+"\n Apellido="+super.getApellido()+"\n Genero="+super.getGenero()+"\n Telefono="+super.getTelefono() + "\n CodigoEmpelado=" + CodigoEmpelado + "\n AreaTrabajo=" + AreaTrabajo + '}';
    }
    
    
    
}
