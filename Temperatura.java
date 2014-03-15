import javax.swing.*;
import java.awt.event.*;

public class Temperatura extends JFrame{
 ActionListener aL;
 JLabel jKelvin = new JLabel("Kelvin");
    JLabel jCelsius = new JLabel("Celsius");
    JLabel jFarenheit = new JLabel("Fahrenheit");
    JTextField jTxtKelvin = new JTextField("");
    JTextField jTxtCelsius = new JTextField("");
    JTextField jTxtFahrenheit = new JTextField("");
    JButton jbtnCambiar = new JButton("Aceptar");
    JButton jbtnBorrar = new JButton("Limpiar");
    String F="", C="", K="";
	
public Temperatura(){
	jbtnCambiar.addActionListener(new ActionListener() {
        @Override
        public void  actionPerformed(ActionEvent e){
             K = jTxtKelvin.getText();
             C = jTxtCelsius.getText();
             F = jTxtFahrenheit.getText();
            if(K.equals("")==false){
                C = ""+ (int)((Integer.parseInt(K)) - 273.15 +1) ;
                F = ""+ (int)(((((Integer.parseInt(K))*(9))/5)) - 459.67 +1);
            }else  if(C.equals("")==false){
                F = ""+ ((((Integer.parseInt(C))*(9))/5) +32) ;
                K = ""+((Integer.parseInt(C)) +273.15);
            }else  if(F.equals("")==false){
                C = ""+(((((Integer.parseInt(F))-32 )*(5))/9));
                K = ""+(int)(((((Integer.parseInt(F)) + 459.67) *(5))/9));
            }
            
            jTxtKelvin.setText(""+K);
            jTxtCelsius.setText(""+C);
            jTxtFahrenheit.setText(""+F);
        }
});
    
     jbtnBorrar.addActionListener(new ActionListener() {
        @Override
        public void  actionPerformed(ActionEvent e){
            
            Temperatura temp1 = new Temperatura();
            dispose();
            
            }
});
        
    
    jKelvin.setVisible(true);
    jCelsius.setVisible(true);
    jFarenheit.setVisible(true);
    jTxtKelvin.setVisible(true);
    jTxtCelsius.setVisible(true);
    jTxtFahrenheit.setVisible(true);
    jbtnCambiar.setVisible(true);
    jbtnBorrar.setVisible(true);
    
    jKelvin.setBounds(200, 50, 100, 20);
    jCelsius.setBounds(200, 150, 100, 20);
    jFarenheit.setBounds(200, 250, 100, 20);
    jTxtKelvin.setBounds(200, 100, 100, 20);
    jTxtCelsius.setBounds(200, 200, 100, 20);
    jTxtFahrenheit.setBounds(200, 300, 100, 20);
    jbtnCambiar.setBounds(400,120,100,30);
    jbtnBorrar.setBounds(400,220,100,30);
    
    this.add(jKelvin);
    this.add(jCelsius);
    this.add(jFarenheit);
    this.add(jTxtKelvin);
    this.add(jTxtCelsius);
    this.add(jTxtFahrenheit);
    this.add(jbtnCambiar);
    this.add(jbtnBorrar);
            
    this.setSize(700,400);
    this.setLayout(null);
    this.setTitle("Cambio de Temperatura");
    this.setResizable(false);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
}
public static void main(String[] args){
 Temperatura temperatura = new Temperatura();
}
}