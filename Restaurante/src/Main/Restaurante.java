
package Main;

public class Restaurante {
    private String Direccion;
    private String Tipo;
    private Cliente ListaCliente [] = new Cliente [100];
    private Empleado ListaEmpleado [] = new Empleado [20];

    public Restaurante() {
    }

    public Restaurante(String Direccion, String Tipo) {
        this.Direccion = Direccion;
        this.Tipo = Tipo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Cliente[] getListaCliente() {
        return ListaCliente;
    }

    public void setListaCliente(Cliente[] ListaCliente) {
        this.ListaCliente = ListaCliente;
    }

    public Empleado[] getListaEmpleado() {
        return ListaEmpleado;
    }

    public void setListaEmpleado(Empleado[] ListaEmpleado) {
        this.ListaEmpleado = ListaEmpleado;
    }
    
    //String Nombre, String Apellido, String Genero, int dpi,int NIT, int Telefono
    public void AgregarCliente(int posicion,String Nombre, String Apellido, String Genero, int dpi, int NIT, int Telefono){
        Cliente nuevo = new Cliente(Nombre, Apellido, Genero, dpi, NIT, Telefono);
        ListaCliente[posicion] = nuevo;
    }
    
    public void MostrarCliente(){
        for (int i = 0; i < ListaCliente.length; i++) {
            if (ListaCliente[i]!=null) {
                System.out.println(ListaCliente[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Restaurante{" + "Direccion=" + Direccion + ", Tipo=" + Tipo + ", ListaCliente=" + ListaCliente + ", ListaEmpleado=" + ListaEmpleado + '}';
    }
    
    
    
    
}
