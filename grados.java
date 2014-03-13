package tarea4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class grados extends JFrame implements ActionListener {
	private JTextField cel,faren,kel;
	private JLabel nom1,nom2,nom3;
	private JButton formular, limpiar;
	String uno,dos,tres;
	double num1;
	double num3;
	double num2;
	  
	public grados(){
		setLayout(null);
		nom1=new JLabel("Celcios");
		nom1.setBounds(30,45,100,30);
		add(nom1);
		nom2=new JLabel("Farenheit");
		nom2.setBounds(150,45,100,30);
		add(nom2);
		nom3=new JLabel("kelvin");
		nom3.setBounds(280,45,100,30);
		add(nom3);
		cel=new JTextField();
		cel.setBounds(20,80,75,20);
		add(cel);
		faren=new JTextField();
		faren.setBounds(140,80,75,20);
		add(faren);
		kel=new JTextField();
		kel.setBounds(270,80,75,20);
		add(kel);
		formular=new JButton("aceptar");
		formular.setBounds(60,130,100,30);
		add(formular);
		formular.addActionListener(this);
		limpiar=new JButton("limpiar");
		limpiar.setBounds(200,130,100,30);
		add(limpiar);
		limpiar.addActionListener(this); 
	}
	
	
	  public void actionPerformed(ActionEvent e) {
		  if (e.getSource()==formular) {
	          formula();  
	        }
		
		if(e.getSource()==limpiar){
			cel.setText("");
			faren.setText("");
			kel.setText("");
		}

	    }
	
	public void formula(){
		uno=cel.getText();
		dos=faren.getText();
		tres=kel.getText();
		
		if(dos.equals("")&&tres.equals("")){
			
			num1 =Double.parseDouble(uno); 
			num2=num1*1.8000+32;
			num3= num1+273.15;
			dos=String.valueOf(num2);
			tres=String.valueOf(num3);
			faren.setText(dos);
			kel.setText(tres);
			
		}
	
        if(uno.equals("")&&tres.equals("")){
        	num1 =Double.parseDouble(dos);
			num2= (num1-32)/1.8000;
			num3= ((num1-32)/1.8000)+273.15;
			uno=String.valueOf(num2);
			tres=String.valueOf(num3);
			cel.setText(uno);
			kel.setText(tres);
		} 
        if(uno.equals("")&&dos.equals("")){
        	
			num1 =Double.parseDouble(tres);
			num2= num1-273.15;
			num3= ((num1-273.15)*1.8000)+32;
			uno=String.valueOf(num2);
			dos=String.valueOf(num3);
			faren.setText(dos);
			cel.setText(uno);
		}
	}
	
	public static void main(String[] ar) {
	        grados panel=new grados();
	        panel.setBounds(0,0,400,250);
	        panel.setVisible(true);
	    }






	
	

	
}
