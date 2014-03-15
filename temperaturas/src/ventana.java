/**
 * @(#)ventana.java
 *
 *
 * @author 
 * @version 1.00 2014/3/13
 */
import javax.swing.*;
import java.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class ventana extends JFrame {
	JLabel lcelcius,lkelvin,lfaren;
	JTextField tcelcius,tkelvin,tfaren;
	JButton calcular,limpiar;

    public ventana() {
    	setLayout(null);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sirve para cerrar el programa
    	setSize(315,140);
    	setResizable(false);
    	setTitle("CONVERSOR DE TEMPERATURAS");
    	setLocationRelativeTo(this);
    	lcelcius=new JLabel("Celcius");
    	lkelvin= new JLabel("Kelvin");
    	lfaren= new JLabel ("Farenheit");
    	tcelcius= new JTextField();
    	tfaren = new JTextField();
    	tkelvin = new JTextField();
    	calcular = new JButton ("Calcular");
    	limpiar = new JButton ("Limpiar");
    	
    	
    	lcelcius.setBounds(10,20,45,10);
    	lcelcius.setVisible(true);
    	
    	tcelcius.setBounds(80,15,100,25);
    	tcelcius.setVisible(true);
    	
    	lfaren.setBounds(10,50,60,10);
    	lfaren.setVisible(true);
    	
    	tfaren.setBounds(80,45,100,25);
    	tfaren.setVisible(true);
    	
    	lkelvin.setBounds(10,80,45,10);
    	lkelvin.setVisible(true);
    	
    	tkelvin.setBounds(80,75,100,25);
    	tkelvin.setVisible(true);
    	
    	calcular.setBounds(200,20,85,25);
    	calcular.setVisible(true);
    	
    	limpiar.setBounds(200,65,85,25);
    	limpiar.setEnabled(false);
    	limpiar.setVisible(true);
    	
    	add(lcelcius);
    	add(lfaren);
    	add(lkelvin);
    	add(tcelcius);
    	add(tfaren);
    	add(tkelvin);
    	add(limpiar);
    	add(calcular);
    	
    	//codigo para boton limpiar
    	limpiar.addActionListener(new ActionListener()
    	{
    		public void actionPerformed (ActionEvent e)
    		{
    			tcelcius.setText("");
    			tfaren.setText("");
    			tkelvin.setText("");
    			calcular.setEnabled(true);
    			limpiar.setEnabled(false);
    		}
    	}
    	);
    	
    	//codigo para boton calcular
    	calcular.addActionListener(new ActionListener()
    	{
    		public void actionPerformed (ActionEvent e)
    		{
    			double conv,c,f,k;
    			if (tcelcius.getText().equals("") && tfaren.getText().equals("") && tkelvin.getText().equals(""))
    			{
    				JOptionPane.showMessageDialog(rootPane, "debe ingresar un dato");
    			}
    			else if (tfaren.getText().equals("") && tkelvin.getText().equals(""))
    			{
    				conv = Double.parseDouble(tcelcius.getText());
    				f = 1.8*conv +32;
    				k= 273.15 + conv;
    				tfaren.setText(String.format("%.2f",f));
    				tkelvin.setText(String.format("%.2f",k));
    				calcular.setEnabled(false);
    				limpiar.setEnabled(true);
    			}
    			else if (tcelcius.getText().equals("") && tkelvin.getText().equals(""))
    			{
    				conv = new Double(tfaren.getText());
    				c = (conv -32)/1.8;
    				k = ((conv -32)/1.8)+273.15;
    				tcelcius.setText(String.format("%.2f",c));
    				tkelvin.setText(String.format("%.2f",k));
    				calcular.setEnabled(false);
    				limpiar.setEnabled(true);
    			}
    			else if (tcelcius.getText().equals("") && tfaren.getText().equals(""))
    			{
    				conv = new Double(tkelvin.getText());
    				c= conv - 273.15;
    				f= (1.8*(conv-273.15))+32;
    				tcelcius.setText(String.format("%.2f",c));
    				tfaren.setText(String.format("%.2f",f));
    				calcular.setEnabled(false);
    				limpiar.setEnabled(true);
    			}
    		}
    	}
    	);
    }
    
    
    
}