
package Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame{
    JPanel panel1;
    JPanel panel2;
    JTextField texto1;
    JTextField texto2;
    JTextField texto3;
    JTextField texto4;
    JTextField texto5;
    JTextField texto6;
    
    public Login(){
        this.setTitle("Programa 9");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.AgregarPanel();
        this.AgregarComponente();
    }
    
    public void AgregarPanel(){
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 800, 600);
        panel1.setBackground(Color.black);
        panel1.setLayout(null);
        this.add(panel1);
        
        panel2 = new JPanel();
        panel2.setBounds(0, 0, 800, 600);
        panel2.setBackground(Color.cyan);
        panel2.setLayout(null);
        this.add(panel2);
    }
    
    public void AgregarComponente(){
        this.Labels();
        this.Textos();
        this.Botones();
    }
    
    public void Labels(){
        JLabel label1 = new JLabel("LOGIN");
        label1.setBounds(100, 80, 150, 20);
        label1.setForeground(Color.red);
        panel1.add(label1);
        
        JLabel label2 = new JLabel("PIN");
        label2.setBounds(200, 150, 150, 20);
        label2.setForeground(Color.cyan);
        panel1.add(label2);
        
        JLabel label3= new JLabel("USER");
        label3.setBounds(200, 200, 150, 20);
        label3.setForeground(Color.cyan);
        panel1.add(label3);
        
        JLabel label4= new JLabel("PASSWORD");
        label4.setBounds(200, 250, 150, 20);
        label4.setForeground(Color.cyan);
        panel1.add(label4);
        
        
        JLabel label5 = new JLabel("REGISTRO");
        label5.setBounds(100, 80, 200, 20);
        label5.setForeground(Color.red);
        panel2.add(label5);
        
        JLabel label6 = new JLabel("PIN");
        label6.setBounds(200, 150, 150, 20);
        label6.setForeground(Color.BLACK);
        panel2.add(label6);
        
        JLabel label7= new JLabel("USER");
        label7.setBounds(200, 200, 150, 20);
        label7.setForeground(Color.BLACK);
        panel2.add(label7);
        
        JLabel label8= new JLabel("PASSWORD");
        label8.setBounds(200, 250, 150, 20);
        label8.setForeground(Color.BLACK);
        panel2.add(label8);
        
    }
    
    public void Textos(){
        texto1 = new JTextField();
        texto1.setBounds(300, 150, 200, 30);
        panel1.add(texto1);
                
        texto2 = new JTextField();
        texto2.setBounds(300, 200, 200, 30);
        panel1.add(texto2);
                
        texto3 = new JTextField();
        texto3.setBounds(300, 250, 200, 30);
        panel1.add(texto3);
        
        
        texto4 = new JTextField();
        texto4.setBounds(300, 150, 200, 30);
        panel2.add(texto4);
                
        texto5 = new JTextField();
        texto5.setBounds(300, 200, 200, 30);
        panel2.add(texto5);
                
        texto6 = new JTextField();
        texto6.setBounds(300, 250, 200, 30);
        panel2.add(texto6);
    }
    
    public void Botones(){
        JButton boton1 = new JButton("Iniciar Sesion");
        boton1.setBounds(250, 350, 200, 40);
        boton1.setBackground(Color.BLUE);
        boton1.setForeground(Color.white);
        boton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String pin = texto1.getText();
                 String usuario = texto2.getText();
                 String password = texto3.getText();
                 // Validacion:
                 if (pin.equals("2407") && usuario.equals("admin") && password.equals("1234@")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido Usuario "+usuario+" con "+pin,"Mensaje",JOptionPane.INFORMATION_MESSAGE);
                }else if(pin.equals("2025") && usuario.equals("secre") && password.equals("123@5")){
                    JOptionPane.showMessageDialog(null, "Bienvenido Usuario "+usuario+" con "+pin,"Mensaje",JOptionPane.INFORMATION_MESSAGE);
                    
                }else if(pin.equals("2424") && usuario.equals("alumno") && password.equals("12@45")){
                    JOptionPane.showMessageDialog(null, "Bienvenido Usuario "+usuario+" con "+pin,"Mensaje",JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario No Existe","Mensaje",JOptionPane.ERROR_MESSAGE);
                }
            }
        
        });
        panel1.add(boton1);
        
        JButton boton2 = new JButton("Registrate");
        boton2.setBounds(250, 400, 200, 40);
        boton2.setBackground(Color.red);
        boton2.setForeground(Color.white);
        boton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 panel1.setVisible(false);
                 panel2.setVisible(true);
            }
        
        });
        panel1.add(boton2);
        
        JButton boton3 = new JButton("Registro");
        boton3.setBounds(250, 350, 200, 40);
        boton3.setBackground(Color.BLUE);
        boton3.setForeground(Color.white);
        boton3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 String pin = texto4.getText();
                 String usuario = texto5.getText();
                 String password = texto6.getText();
                 // Validacion:
                 if (pin.equals("2407") && usuario.equals("admin") && password.equals("1234@")) {
                    JOptionPane.showMessageDialog(null, "Usuario Existente","Mensaje",JOptionPane.ERROR_MESSAGE);
                }else if(pin.equals("2025") && usuario.equals("secre") && password.equals("123@5")){
                    JOptionPane.showMessageDialog(null, "Usuario Existente","Mensaje",JOptionPane.ERROR_MESSAGE);
                    
                }else if(pin.equals("2424") && usuario.equals("alumno") && password.equals("12@45")){
                    JOptionPane.showMessageDialog(null, "Usuario Existente","Mensaje",JOptionPane.ERROR_MESSAGE);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario Registrado","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        
        });
        panel2.add(boton3);
        
        JButton boton4 = new JButton("Login");
        boton4.setBounds(250, 400, 200, 40);
        boton4.setBackground(Color.red);
        boton4.setForeground(Color.white);
        boton4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 panel1.setVisible(true);
                 panel2.setVisible(false);
            }
        
        });
        panel2.add(boton4);
    }
}
