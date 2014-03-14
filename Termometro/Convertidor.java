import javax.swing.*;
import java.awt.event.*;

public class Convertidor extends JFrame{
	
	JLabel Titulo;
	JLabel Celsius;
	JLabel Farenheit;
	JLabel Kelvin;
	JPanel Panel;
	JButton Convertir;
	JButton Reiniciar;
	JTextArea TempCelsius;
	JTextArea TempFarenheit;
	JTextArea TempKelvin;
	
	public Convertidor(){
		Panel = new JPanel();
		Titulo = new JLabel();
		Celsius = new JLabel();
		Farenheit = new JLabel();
		Kelvin = new JLabel();
		Convertir = new JButton();
		Reiniciar = new JButton();
		TempCelsius = new JTextArea();
		TempFarenheit = new JTextArea();
		TempKelvin = new JTextArea();
		
		this.add(Panel);
		Panel.setLayout(null);
		Panel.add(Convertir);
		Panel.add(Reiniciar);
		Panel.add(Celsius);
		Panel.add(Farenheit);
		Panel.add(Kelvin);
		Panel.add(Titulo);
		Panel.add(TempCelsius);
		Panel.add(TempFarenheit);
		Panel.add(TempKelvin);
		
		Titulo.setText("Convertidor de Temperatura");
		Titulo.setBounds(210,20,200,40);
		Celsius.setText("Grados en Celsius");
		Celsius.setBounds(20,80,140,40);
		TempCelsius.setBounds(160,90,40,20);
		
		Farenheit.setText("Grados en Farenheit");
		Farenheit.setBounds(20,120,140,40);
		TempFarenheit.setBounds(160,130,40,20);
		
		Kelvin.setText("Grados en Kelvin");
		Kelvin.setBounds(20,160,140,40);
		TempKelvin.setBounds(160,170,40,20);
		
		Convertir.setText("Convertir");
		Convertir.setBounds(180,220,100,40);
		Reiniciar.setText("Reiniciar");
		Reiniciar.setBounds(300,220,100,40);
	}
	
}