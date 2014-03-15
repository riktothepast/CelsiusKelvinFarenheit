import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

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
	JTextField TempCelsius;
	JTextField TempFarenheit;
	JTextField TempKelvin;
	int opcion = 0;
	
	public Convertidor(){
		Panel = new JPanel();
		Titulo = new JLabel();
		Celsius = new JLabel();
		Farenheit = new JLabel();
		Kelvin = new JLabel();
		Convertir = new JButton();
		Reiniciar = new JButton();
		TempCelsius = new JTextField();
		TempFarenheit = new JTextField();
		TempKelvin = new JTextField();
		C = new JLabel();
		F = new JLabel();
		K = new JLabel();
		
		Componentes();
		Convertir();
		Limpiar();
		Editar();
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
				if(opcion == 1  ){
				String GradosC = TempCelsius.getText();
				float ftGradosC = Float.parseFloat(GradosC);
				float ftGradosF = (ftGradosC * (9/5)) + 32; 
				float ftGradosK = ftGradosC + 273;
				String GradosF = String.valueOf(ftGradosF);
				String GradosK = String.valueOf(ftGradosK);
				TempFarenheit.setText(GradosF);
				TempKelvin.setText(GradosK);
				}
				
				if(opcion == 2 ){
				String GradosF = TempFarenheit.getText();
				float ftGradosF = Float.parseFloat(GradosF);
				float ftGradosC = (ftGradosF - 32) * (5/9); 
				float ftGradosK = ftGradosC + 273;
				String GradosC = String.valueOf(ftGradosC);
				String GradosK = String.valueOf(ftGradosK);
				TempCelsius.setText(GradosC);
				TempKelvin.setText(GradosK);
				}
				
				if(opcion == 3 ){
				String GradosK = TempKelvin.getText();
				float ftGradosK = Float.parseFloat(GradosK);
				float ftGradosC = ftGradosK - 273;
				float ftGradosF = (ftGradosC * (9/5)) + 32; 
				String GradosF = String.valueOf(ftGradosF);
				String GradosC = String.valueOf(ftGradosC);
				TempCelsius.setText(GradosC);
				TempFarenheit.setText(GradosF);
				}
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
	
	public void Editar(){
		TempCelsius.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				opcion = 1;
			}
			public void focusGained(FocusEvent e) {

            }
		});
		
		TempFarenheit.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				opcion = 2;
			}
			public void focusGained(FocusEvent e) {

            }
		});
		
		TempKelvin.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				opcion = 3;
			}
			public void focusGained(FocusEvent e) {

            }
		});
	}
}
