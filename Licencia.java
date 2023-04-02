import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

  private JLabel label1, label2;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JScrollPane scrollpane1; 
  private JTextArea textarea1;

  public Licencia() {
    setLayout(null);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());

    label1 = new JLabel("TÉRMINOS Y CONDICIONES");
    label1.setBounds(215,5,200,30);
    label1.setFont(new Font("Andale Mono", 1, 14));
    label1.setForeground(new Color(0, 0, 0));

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setFont(new Font("Andale Mono", 0 , 10));   
    textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE WALID." +
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                    "\n            C.  WALID NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (WALID), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TÉRMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TÉRMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n            ");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(10,40,625,200);

    check1 = new JCheckBox("Yo Acepto");
    check1.setBounds(10,250,300,30);
    check1.addChangeListener(this);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10,290,100,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);

    boton2 = new JButton("No Acepto");
    boton2.setBounds(120,290,100,30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);

    ImageIcon imagen = new ImageIcon(getClass().getResource("/images/coca-cola.png"));
    label2 = new JLabel(imagen);  
    label2.setBounds(315,135,350,300);

    add(label1);
    add(label2);
    add(scrollpane1);
    add(check1); 
    add(boton1);
    add(boton2);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void stateChanged(ChangeEvent e){
    if (check1.isSelected()) {
      boton1.setEnabled(true);
      boton2.setEnabled(false);
    } else {
      boton1.setEnabled(false);
      boton2.setEnabled(true);
    }}
    public static void main(String args[]){
      Licencia ventanalicencia = new Licencia();
      ventanalicencia.setBounds(0,0,650,360);
      ventanalicencia.setVisible(true);
      ventanalicencia.setResizable(false);
      ventanalicencia.setLocationRelativeTo(null);
    }


  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
  }}