
package Main;

public class Usuario {
    private String Usuario;
    private String Password;

    public Usuario() {
    }

    public Usuario(String Usuario, String Password) {
        this.Usuario = Usuario;
        this.Password = Password;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Usuario=" + Usuario + ", Password=" + Password + '}';
    }
    
    
}
