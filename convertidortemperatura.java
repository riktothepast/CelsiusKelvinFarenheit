/**
 * @(#)convertidortemperatura.java
 *
 * convertidortemperatura application
 *
 * @author 
 * @version 1.00 2014/3/15
 */
 
import javax.swing.*;
import java.awt.event.*;
public class convertidortemperatura extends JFrame implements ActionListener{
    private JButton boton1,boton2,boton3;
    private JTextField text;
    private JLabel label1,label2;
    public convertidortemperatura() {
        setLayout(null);
         setTitle("convertidor");
         label1=new JLabel("");
        label1.setBounds(50,50,100,30);
        add(label1);
        label2=new JLabel("Ingrese Temperatura");
        label2.setBounds(10,10,100,30);
        add(label2);
        
        text=new JTextField();
        text.setBounds(120,10,150,20);
        add(text);
        boton1=new JButton("Fahrenheit");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        boton1.addActionListener(this);
        boton2=new JButton("Celsius");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        boton2.addActionListener(this);
        boton3=new JButton("Kelvin");
        boton3.setBounds(210,100,90,30);
        add(boton3);
        boton3.addActionListener(this);        	
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
           int seleccion = JOptionPane.showConfirmDialog 
			(null, "Convertir", "Fahrenheit ", JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
	        		if (seleccion == JOptionPane.OK_OPTION){
	        		
	        
           label1.setText((1.8*Integer.parseInt(text.getText())+32)+"°F");
        } 
             
        }
        if (e.getSource()==boton2) {
        	int seleccion = JOptionPane.showConfirmDialog 
			(null, "Convertir", "Celsius ", JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
	        		if (seleccion == JOptionPane.OK_OPTION){
	        			
        		
           label1.setText(((Integer.parseInt(text.getText())-32)/1.8)+"°C");
	        		}
        }
        if (e.getSource()==boton3) {
        	int seleccion = JOptionPane.showConfirmDialog 
			(null, "Convertir", "Kelvin ", JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
	        		if (seleccion == JOptionPane.OK_OPTION){
	        		
           label1.setText(273.15+(1.8*Integer.parseInt(text.getText())+32)+"°K");
	        		}
        }        
    }
    
    public static void main(String[] ar){
        convertidortemperatura form=new convertidortemperatura();
        form.setBounds(0,0,350,200);
        form.setVisible(true);
    }
}
