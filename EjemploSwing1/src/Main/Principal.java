package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Principal extends JFrame {

    JPanel Panel1;
    Font Fuente1, Fuente2, Fuente3;
    JTextField Texto1, Texto2;

    public Principal() {
        this.setSize(800, 500);
        this.setTitle("Ejemplo Fuentes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.AgregarPaneles();
        this.Fuentes();
        this.AgregarComponentes();
    }

    public void AgregarPaneles() {
        Panel1 = new JPanel();
        Panel1.setBounds(0, 0, 800, 500);
        Panel1.setBackground(Color.black);
        Panel1.setLayout(null);
        this.add(Panel1);

    }

    public void AgregarComponentes() {
        this.Fuentes();
        this.Textos();
        this.Etiquetas();
        this.Botones();
    }

    public void Fuentes() {
        Fuente1 = new Font("Gabriola", Font.PLAIN, 25);
        Fuente2 = new Font("Courier New", Font.BOLD, 18);
        Fuente3 = new Font("Ink Free", Font.BOLD, 15);
    }

    public void Textos() {
        Texto1 = new JTextField();
        Texto1.setBounds(225, 100, 200, 30);
        Texto1.setFont(Fuente2);
        Panel1.add(Texto1);

        Texto2 = new JTextField();
        Texto2.setBounds(225, 200, 200, 30);
        Texto2.setFont(Fuente2);
        Panel1.add(Texto2);
    }

    public void Etiquetas() {
        JLabel Etiqueta1 = new JLabel("USUARIO");
        Etiqueta1.setBounds(100, 100, 100, 50);
        Etiqueta1.setForeground(Color.white);
        Etiqueta1.setFont(Fuente1);
        Panel1.add(Etiqueta1);

        JLabel Etiqueta2 = new JLabel("PASSWORD");
        Etiqueta2.setBounds(100, 200, 100, 50);
        Etiqueta2.setForeground(Color.white);
        Etiqueta2.setFont(Fuente1);
        Panel1.add(Etiqueta2);
        
        JLabel pokemon = new JLabel();
        pokemon.setBounds(450, 100, 300, 300);
        ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/nlf.png"));
        Image escalado = img.getImage().getScaledInstance(pokemon.getWidth(), pokemon.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon img1 = new ImageIcon(escalado);
        pokemon.setIcon(img1);
        Panel1.add(pokemon);
         }

    public void Botones() {
        JButton Boton1 = new JButton("INICIAR SESION");
        Boton1.setBounds(150, 300, 200, 40);
        Boton1.setBackground(Color.CYAN);
        Boton1.setForeground(Color.black);
        Boton1.setFont(Fuente3);
        Boton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               Usuario nuevo = new Usuario(Texto1.getText(),Texto2.getText());
                System.out.println(nuevo);
            }
        });
        Panel1.add(Boton1);

        JButton Boton2 = new JButton("REGISTRATE");
        Boton2.setBounds(150, 350, 200, 40);
        Boton2.setBackground(Color.YELLOW);
        Boton2.setForeground(Color.black);
        Boton2.setFont(Fuente3);
        Panel1.add(Boton2);
    }

}
