import javax.swing.*;
import java.awt.event.*;

public class CKF extends JFrame{
	//Definiendo variables visibles
	double Numero, Numero2;
	double por = 1.8;
	String Escala="";
	public JLabel info1 = new JLabel("Introduzca el valor a convertir");
	public JLabel Tempe1 = new JLabel("Cantidad: ");
	public JTextField Temperatura = new JTextField("0");
	public JButton KC = new JButton("K  a  °C");
	public JButton CK = new JButton("°C  a  K");
	public JButton FC = new JButton("°F  a  °C");
	public JButton CF = new JButton("°C  a  °F");
	public JButton Reutilizar = new JButton("Utilizar Número");
	public JButton Reiniciar = new JButton("Reiniciar");
	public JLabel Tempe2 = new JLabel("Temperatura");
	public JLabel kel4 = new JLabel("0");




	public void Programa(){
//Propiedades de ventana
		this.setTitle("201213255");
		this.setSize(250,250);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);

		//Ubicación de variables
		info1.setBounds(10, 10, 200, 20);
		Temperatura.setBounds(75, 40, 150, 20);
		Tempe1.setBounds(10, 40, 65, 20);
		KC.setBounds(10, 70, 105, 20);
		CK.setBounds(125, 70, 105, 20);
		FC.setBounds(10, 100, 105, 20);
		CF.setBounds(125, 100, 105, 20);
		Tempe2.setBounds(10, 130, 200, 20);
		kel4.setBounds(10, 155, 150, 20);
		Reutilizar.setBounds(10, 190, 130, 20);
		Reiniciar.setBounds(150, 190, 85, 20);

		//Haciendo variables visibles
		this.add(info1);
		this.add(Temperatura);
		this.add(Tempe1);
		this.add(KC);
		this.add(CK);
		this.add(CF);
		this.add(FC);
		this.add(Tempe2);
		this.add(kel4);
		this.add(Reutilizar);
		this.add(Reiniciar);
	}

	//Accion de boton K > °C
	{
		KC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt){
				Numero = Double.parseDouble(Temperatura.getText());
				Tempe2.setText("Temperatura en Celsius");
				Numero2 = Numero - 273.15;
				kel4.setText(Numero2+"");
			}
		});
	}

	//Accion de boton °C > K
	{
		CK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt){
				Numero = Double.parseDouble(Temperatura.getText());
				Tempe2.setText("Temperatura en Kelvin");
				Numero2 = Numero + 273.15;
				kel4.setText(Numero2+"");
			}
		});
	}


	//Accion de boton °C > °F
	{
		CF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt){
				Numero = Double.parseDouble(Temperatura.getText());
				Tempe2.setText("Temperatura en Fahrenheit");
				Numero2 = (Numero * por)+32;
				kel4.setText(Numero2+"");
			}
		});
	}

	//Accion de boton °F > °C
	{
		FC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt){
				Numero = Double.parseDouble(Temperatura.getText());
				Tempe2.setText("Temperatura en Celsius");
				Numero2 = ((Numero-32)*5)/9;
				kel4.setText(Numero2+"");
			}
		});
	}

	//Accion de boton "Utilizar Número"
	{
		Reutilizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt){
				Temperatura.setText(Numero2+"");
			}
		});
	}

	//Accion de boton "Reiniciar"
	{
		Reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt){
				Numero = 0;
				Numero2 = 0;
				Tempe2.setText("Temperatura");
				kel4.setText("0");
				Temperatura.setText("0");
			}
		});
	}

	public static void main (String args[]){
		new CKF().Programa();
	}

}