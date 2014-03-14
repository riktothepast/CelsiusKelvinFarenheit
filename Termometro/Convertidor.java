import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	String GradosC = " ";
	String GradosF = " ";
	String GradosK = " ";
	float ftGradosC = 0;
	float ftGradosF = 0;
	float ftGradosK = 0;
	
	
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
		
		
		Componentes();
		Limpiar();
	}
	
	public void Componentes(){
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
		Celsius.setBounds(180,80,140,40);
		TempCelsius.setBounds(300,90,40,20);
		
		Farenheit.setText("Grados en Farenheit");
		Farenheit.setBounds(180,120,140,40);
		TempFarenheit.setBounds(300,130,40,20);
		
		Kelvin.setText("Grados en Kelvin");
		Kelvin.setBounds(180,160,140,40);
		TempKelvin.setBounds(300,170,40,20);
		
		Convertir.setText("Convertir");
		Convertir.setBounds(180,220,100,40);
		Reiniciar.setText("Reiniciar");
		Reiniciar.setBounds(300,220,100,40);
	}
	
	public void Convertir(){
		Convertir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                GradosC = TempCelsius.getText();
				ftGradosC = Float.parseFloat(GradosC);
				ftGradosF = (ftGradosC * (9/5)) + 32; 
				ftGradosK = ftGradosC + 273;
				GradosF = String.valueOf(ftGradosF);
				GradosK = String.valueOf(ftGradosK);
				GradosF = TempFarenheit.getText();
				TempKelvin.setText(GradosK);
            }
        });
	}
	
	public void Limpiar(){
		Reiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                TempFarenheit.setText(" ");
				TempKelvin.setText(" ");
				TempCelsius.setText(" ");
            }
        });
	}
	
}
