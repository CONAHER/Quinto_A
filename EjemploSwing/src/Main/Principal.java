
package Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Principal extends JFrame{
    JPanel panel1;
    JPanel panel2;
    JTextField texto1;
    JTextField texto2;
    
    public Principal(){
        this.setTitle("Hola Quinto");
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.agregarPaneles();
        this.agregarComponentes();
    }
    
    public void agregarPaneles(){
        panel1 = new JPanel();
        panel1.setBackground(Color.green);
        panel1.setBounds(0, 0, 800, 600);
        panel1.setLayout(null);
        this.add(panel1);
        
        panel2 = new JPanel();
        panel2.setBackground(Color.yellow);
        panel2.setBounds(0, 0, 800, 600);
        panel2.setLayout(null);
        this.add(panel2);
        
        
    }
    
    public void agregarComponentes(){
        this.Labels();
        this.Textos();
        this.Botones();
        this.RadioButton();
        this.Tablas();
    }
    
    public void Labels(){
        JLabel label1 = new JLabel("Nombre");
        // setBounds( x, y, ancho, alto);
        label1.setBounds(100, 205, 100, 20);
        this.panel1.add(label1);
        
        JLabel label2 = new JLabel("Apellido");
        label2.setBounds(100, 245, 100, 50);
        this.panel1.add(label2);
    }
    
    public void Textos(){
        texto1 = new JTextField();
        texto1.setBounds(200, 200, 200,30);
        this.panel1.add(texto1);
        
        texto2 = new JTextField();
        texto2.setBounds(200, 250, 200,30);
        this.panel1.add(texto2);
    }
    
    public void Botones(){
        JButton boton1 = new JButton("Clic aca");
        boton1.setBounds(300, 350, 150,30);
        boton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 String nombre = texto1.getText();
                 String apellido = texto2.getText();
                 JOptionPane.showMessageDialog(null, "El nombre es: "+nombre+" "+apellido, "Mesaje de Datos", JOptionPane.INFORMATION_MESSAGE);
                
            }
        
        });
        this.panel1.add(boton1);
        
        JButton boton2 = new JButton("Limpiar Data");
        boton2.setBounds(300, 450, 150,30);
        boton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 texto1.setText("");
                 texto2.setText("");
            }
        
        });
        this.panel1.add(boton2);
    }
    
    public void RadioButton(){
        
    }
    
    public void Tablas(){
        
    }
}
