import javax.swing.*;
import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class tarea4 extends JFrame{

	

	//creando de controles
	
	Container contenedor;
	JPanel c1;
	JTextArea kelvin, celcius, farenheit;
	JLabel k,c,f,titulo;
	JButton Aceptar,limpiar, salir;

	//llamando al constructor
	
	public tarea4(){

	//constructor general	

	super("Convertidor");

	
	k=new JLabel();
	k.setText("Kelvin");
	k.setBounds(25,25,100,20);	
	kelvin=new JTextArea();
	kelvin.setBounds(25,45,150,20);	
	
	c=new JLabel();
	c.setText("Celcius");
	c.setBounds(25,70,100,20);
	celcius=new JTextArea();
	celcius.setBounds(25,90,150,20);	
	
	f=new JLabel();
	f.setText("Farenheit");
	f.setBounds(25,115,100,20);
	farenheit=new JTextArea();
	farenheit.setBounds(25,135,150,20);


	Aceptar=new JButton();
	Aceptar.setText("Aceptar");
	Aceptar.setBounds(25,165,100,20);
	Aceptar.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){

		convertir();

		}
		}	);




	limpiar=new JButton();
	limpiar.setText("Limpiar");
	limpiar.setBounds(25,195,100,20);
	limpiar.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){

		vaciar();

		}
		}	);


	salir=new JButton();
	salir.setText("Salir");
	salir.setBounds(25,225,100,20);
	salir.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){

		salida();

		}
		}	);


	this.add(k);
	this.add(kelvin);
	this.add(c);	
	this.add(celcius);
	this.add(f);
	this.add(farenheit);
	this.add(Aceptar);	
	this.add(limpiar);
	this.add(salir);

	this.setIconImage(new ImageIcon("velocidad-icono-5047-48.png").getImage());
	this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);	
	this.setSize(200,300);//Tamaño de la ventana
	this.setLayout(null);
	this.setResizable(false);
	this.setLocationRelativeTo(null);//Centrar la ventana
	

	this.setVisible(true);
	
	
}	
	



public static void main(String[] args){
	
	JFrame Principal= new tarea4(); //llamamos a la clase 

}

public void salida(){

	
		int ss=JOptionPane.showOptionDialog(null, "¿Desea Salir?",
		"¿Ya se va?",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null, new Object[] { "Si", "No"},
		"Si");
		if(ss!=-1){
		if((ss+1)==1){
		JOptionPane.showMessageDialog(null, "Orale pue");	
		System.exit(0);
		}else 
		JOptionPane.showMessageDialog(null, "Me llegas");	
		}


}

public void vaciar(){

	kelvin.setText("");
	celcius.setText("");
	farenheit.setText("");

	kelvin.setEnabled(true);
	celcius.setEnabled(true);
	farenheit.setEnabled(true);	


}

public void convertir(){
	String kel,cel,far;
	Double k0,c0,far0;

	kel=kelvin.getText();
	cel=celcius.getText();
	far=farenheit.getText();

	if(cel.equals("") && far.equals("") &&!kel.equals("")){

	k0=Double.parseDouble(kel);
	c0=k0-273.15;
	far0=(c0*1.8)+32;

	kelvin.setText(""+k0+"K°");
	celcius.setText(""+c0+"C°");
	farenheit.setText(""+far0+"F°");

	kelvin.setEnabled(false);
	celcius.setEnabled(false);
	farenheit.setEnabled(false);
		
}	else if(cel.equals("") && far.equals("") && kel.equals("")){

	JOptionPane.showMessageDialog(null,"Error, No hay valores","Mal",JOptionPane.ERROR_MESSAGE);

}	else if(!cel.equals("") && far.equals("") && kel.equals("")){

	c0=Double.parseDouble(cel);
	k0=c0+273.15;
	far0=(c0*1.8)+32;


	kelvin.setText(""+k0+"K°");
	celcius.setText(""+c0+"C°");
	farenheit.setText(""+far0+"F°");

	kelvin.setEnabled(false);
	celcius.setEnabled(false);
	farenheit.setEnabled(false);

}	else if(cel.equals("") && !far.equals("") && kel.equals("")){

	far0=Double.parseDouble(far);
	c0=(far0-32)/1.8;
	k0=c0+273.15;
	
	kelvin.setText(""+k0+"K°");
	celcius.setText(""+c0+"C°");
	farenheit.setText(""+far0+"F°");

	kelvin.setEnabled(false);
	celcius.setEnabled(false);
	farenheit.setEnabled(false);

}
}
}