import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener { // Se implementa ActionListener en vez de AWTEventListener
  private JTextField textField1;
  private JLabel label, label2, label3, label4;
  private JButton button1;

  public Bienvenida(){
    setLayout(null);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    label = new JLabel(imagen);
    label.setBounds(25,15,300,150);
    add (label);

    label2 = new JLabel("Sistema Vacacional");
    label2.setBounds(35,135,300,30);
    label2.setFont(new Font("Andale Mono", 3, 18));
    label2.setForeground(new Color(255,255,255,255));

    label3 = new JLabel("Ingrese su nombre");
    label3.setBounds(45,212,200,30);
    label3.setFont(new Font("Andale Mono", 3, 18));
    label3.setForeground(new Color(255,255,255,255));

    label4 = new JLabel("Coca-Cola Company");
    label4.setBounds(85,375,300,30);
    label4.setFont(new Font("Andale Mono", 3, 18));
    label4.setForeground(new Color(255,255,255,255));

    textField1 = new JTextField();
    textField1.setBounds(45,240,255,25);
    textField1.setBackground(new Color(224,224,224));
    textField1.setFont(new Font("Andale Mono", 3, 14)); // Se corrige el uso de label4 en vez de textField1
    textField1.setForeground(new Color(255,0,0)); // Se cambia el color del texto a rojo

    button1 = new JButton("Ingresar");
    button1.setBounds(125,280,100,30);
    button1.setFont(new Font("Andale Mono", 3, 14));
    button1.setForeground(new Color(255,0,0));
    button1.addActionListener(this); // Se agrega el action listener al botón
    add(button1);

    // Se agregan todos los elementos al JFrame
    add(label2);
    add(label3);
    add(label4);
    add(textField1);

    // Se ajustan las dimensiones de la ventana
    setSize(350,450);
    setLocationRelativeTo(null);
    setResizable(false);
    setVisible(true);
  }

  // Se implementa el método actionPerformed para responder al evento del botón
  public void actionPerformed(ActionEvent a) {
    if(a.getSource() == button1) {
      // Se muestra un diálogo con el mensaje de bienvenida
      JOptionPane.showMessageDialog(this, "Bienvenido " + textField1.getText() + " al sistema vacacional de Coca-Cola Company");
      // Se limpia el campo de texto
      textField1.setText("");
    }
  }

  public static void main(String[] args) {
    Bienvenida ventanabienvenida = new Bienvenida();
  }
}
