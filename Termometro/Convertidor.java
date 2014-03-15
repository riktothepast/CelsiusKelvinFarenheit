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
	JLabel C;
	JLabel F;
	JLabel K;
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
		C = new JLabel();
		F = new JLabel();
		K = new JLabel();
		
		Componentes();
		Convertir();
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
		Panel.add(C);
		Panel.add(F);
		Panel.add(K);
		
		Titulo.setText("Convertidor de Temperatura");
		Titulo.setBounds(210,20,200,40);
		
		Celsius.setText("Grados en Celsius");
		Celsius.setBounds(180,80,140,40);
		C.setText("C");
		C.setBounds(380,80,140,40);
		TempCelsius.setBounds(300,90,60,20);
		
		Farenheit.setText("Grados en Farenheit");
		Farenheit.setBounds(180,120,140,40);
		F.setText("F");
		F.setBounds(380,120,140,40);
		TempFarenheit.setBounds(300,130,60,20);
		
		Kelvin.setText("Grados en Kelvin");
		Kelvin.setBounds(180,160,140,40);
		K.setText("K");
		K.setBounds(380,160,140,40);
		TempKelvin.setBounds(300,170,60,20);
		
		Convertir.setText("Convertir");
		Convertir.setBounds(180,220,100,40);
		Reiniciar.setText("Reiniciar");
		Reiniciar.setBounds(300,220,100,40);
	}
	
	public void Convertir(){
		Convertir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
				String GradosC = TempCelsius.getText();
				int ftGradosC = Integer.parseInt(GradosC);
				int ftGradosF = (ftGradosC * (9/5)) + 32; 
				int ftGradosK = ftGradosC + 273;
				String GradosF = String.valueOf(ftGradosF);
				String GradosK = String.valueOf(ftGradosK);
				TempCelsius.setText(GradosC);
				TempFarenheit.setText(GradosF);
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
