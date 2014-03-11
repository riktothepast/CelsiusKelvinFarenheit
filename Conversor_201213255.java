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

	public JButton Convertir = new JButton("Convertir");

	public JLabel kel3 = new JLabel("Kelvin:     ");
	public JLabel cel3 = new JLabel("Celsius:    ");
	public JLabel far3 = new JLabel("Fahrenheit: ");

	public JLabel kel4 = new JLabel("0");
	public JLabel cel4 = new JLabel("0");
	public JLabel far4 = new JLabel("0");


	public void Programa(){
//Propiedades de ventana
		this.setTitle("201213255");
		this.setSize(250,300);
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
		kel2.setBounds(110, 40, 100, 20);
		cel2.setBounds(110, 70, 100, 20);
		far2.setBounds(110, 100, 100, 20);
		Convertir.setBounds(20, 130, 190, 20);
		kel3.setBounds(20, 160, 80, 20);
		cel3.setBounds(20, 190, 80, 20);
		far3.setBounds(20, 220, 80, 20);
		kel4.setBounds(110, 160, 100, 20);
		cel4.setBounds(110, 190, 100, 20);
		far4.setBounds(110, 220, 100, 20);

		//Haciendo variables visibles
		this.add(info1);
		this.add(kel1);
		this.add(cel1);
		this.add(far1);
		this.add(kel2);
		this.add(cel2);
		this.add(far2);
		this.add(Convertir);
		this.add(kel3);
		this.add(cel3);
		this.add(far3);
		this.add(kel4);
		this.add(cel4);
		this.add(far4);

	}

	//Accion de boton "Reiniciar"
	{
		Convertir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				Kelvin = Double.parseDouble(kel2.getText());
				Celsius = Double.parseDouble(cel2.getText());
				Fahrenheit = Double.parseDouble(far2.getText());

				if(cel2.getText().equals("0") && far2.getText().equals("0")){
					Numero1 = Kelvin - 273.15;
					kel4.setText(Kelvin+"");
					cel4.setText(Numero1+"");
					Numero2 = ((Kelvin-273.15)*por)+32;
					far4.setText(Numero2+"");
				}else if(kel2.getText().equals("0") && far2.getText().equals("0")){
					Numero1 = Celsius + 273.15;
					Numero2 = ((Celsius*por)+32);
					kel4.setText(Numero1+"");
					cel4.setText(Celsius+"");
					far4.setText(Numero2+"");
				}else if(kel2.getText().equals("0") && cel2.getText().equals("0")){
					Numero1 = ((Fahrenheit-32)*5)/9;
					Numero2 = (((Fahrenheit-32)*5)/9)+273.15;
					kel4.setText(Numero2+"");
					cel4.setText(Numero1+"");
					far4.setText(Fahrenheit+"");
				}
			}
		});
	}


	public static void main (String args[]){
		new CKF_201213255().Programa();
	}

}
