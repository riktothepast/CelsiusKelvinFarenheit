import javax.swing.*;
import java.awt.event.*;

public class Conversor_201213255 extends JFrame{
	//Definiendo variables visibles
	double Kelvin, Celsius, Fahrenheit;
	double Numero1, Numero2;
	double por = 1.8;
	String Escala="";
	public JLabel info1 = new JLabel("Introduzca el valor a convertir");

	public JLabel kel1 = new JLabel("Kelvin:     ");
	public JLabel cel1 = new JLabel("Celsius:    ");
	public JLabel far1 = new JLabel("Fahrenheit: ");

	public JTextField kel2 = new JTextField("0");
	public JTextField cel2 = new JTextField("0");
	public JTextField far2 = new JTextField("0");

	public JButton Convertir1 = new JButton("Convertir");
	public JButton Convertir2 = new JButton("Convertir");
	public JButton Convertir3 = new JButton("Convertir");


	public void Programa(){
		//Propiedades de ventana
		this.setTitle("[IPC1B]Tarea4_201213255");
		this.setSize(400,160);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);

		//Ubicación de variables
		info1.setBounds(20, 10, 200, 20);
		kel1.setBounds(20, 40, 80, 20);
		cel1.setBounds(20, 70, 80, 20);
		far1.setBounds(20, 100, 80, 20);
		kel2.setBounds(110, 40, 150, 20);
		cel2.setBounds(110, 70, 150, 20);
		far2.setBounds(110, 100, 150, 20);
		Convertir1.setBounds(270, 40, 100, 20);
		Convertir2.setBounds(270, 70, 100, 20);
		Convertir3.setBounds(270, 100, 100, 20);

		//Haciendo variables visibles
		this.add(info1);
		this.add(kel1);
		this.add(cel1);
		this.add(far1);
		this.add(kel2);
		this.add(cel2);
		this.add(far2);
		this.add(Convertir1);
		this.add(Convertir2);
		this.add(Convertir3);
	}

	//Accion de boton "Convertir1"
	{
		Convertir1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				Kelvin = Double.parseDouble(kel2.getText());
				Celsius = Double.parseDouble(cel2.getText());
				Fahrenheit = Double.parseDouble(far2.getText());

					Numero1 = Kelvin - 273.15;
					cel2.setText(Numero1+"");
					Numero2 = ((Kelvin-273.15)*por)+32;
					far2.setText(Numero2+"");
			}
		});
	}

	//Accion de boton "Convertir2"
	{
		Convertir2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				Kelvin = Double.parseDouble(kel2.getText());
				Celsius = Double.parseDouble(cel2.getText());
				Fahrenheit = Double.parseDouble(far2.getText());

					Numero1 = Celsius + 273.15;
					Numero2 = ((Celsius*por)+32);
					kel2.setText(Numero1+"");
					far2.setText(Numero2+"");
			}
		});
	}
	
	//Accion de boton "Convertir3"
	{
		Convertir3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				Kelvin = Double.parseDouble(kel2.getText());
				Celsius = Double.parseDouble(cel2.getText());
				Fahrenheit = Double.parseDouble(far2.getText());

					Numero1 = ((Fahrenheit-32)*5)/9;
					Numero2 = (((Fahrenheit-32)*5)/9)+273.15;
					kel2.setText(Numero2+"");
					cel2.setText(Numero1+"");
			}
		});
	}


	public static void main (String args[]){
		new Conversor_201213255().Programa();
	}

}
