import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Point;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Convertidor_201313952 extends JFrame{
	private JFrame jFrame = null;
	private JPanel jPContenedor = null;
	private JLabel lblCelsius = null;
	private JTextArea jTACelsius = null;
	private JLabel lblF = null;
	private JTextArea jTAFarenheit = null;
	private JLabel lblKelvin = null;
	private JTextArea jTAKelvin = null;
	private JButton btnConvertir = null;
	private JButton btnLimpiar = null;
	public Convertidor201313952(){
		init();
	}
	public void init(){
		setTitle("Conversor Grados Temperatura");
		setSize(new Dimension(580, 250));
		jPContenedor = new JPanel();
		setContentPane(jPContenedor);
		jPContenedor.setLayout(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		lblCelsius = new JLabel();
		lblF = new JLabel();
		lblKelvin = new JLabel();
		jTACelsius = new JTextArea();
		jTAFarenheit = new JTextArea();
		jTAKelvin = new JTextArea();
		
		lblCelsius.setText("Grados Celsius:");
		lblCelsius.setLocation(new Point(30, 15));
		lblCelsius.setSize(new Dimension(95, 25));
			jPContenedor.add(lblCelsius);
		jTACelsius = new JTextArea();
		jTACelsius.setSize(140, 40);
		jTACelsius.setLocation(new Point(30, 50));
			jPContenedor.add(jTACelsius);
		lblF.setText("Grados Farenheit:");
		lblF.setLocation(new Point(210, 15));
		lblF.setSize(new Dimension(100, 25));
			jPContenedor.add(lblF);
		jTAFarenheit.setSize(new Dimension(140, 40));
		jTAFarenheit.setLocation(new Point(210, 50));
			jPContenedor.add(jTAFarenheit);
		lblKelvin.setText("Grados Kelvin:");
		lblKelvin.setLocation(new Point(390, 15));
		lblKelvin.setSize(new Dimension(85, 25));
			jPContenedor.add(lblKelvin);
		jTAKelvin.setSize(new Dimension(140, 40));
		jTAKelvin.setLocation(new Point(390, 50));
			jPContenedor.add(jTAKelvin);	
			jPContenedor.add(getBtnConvertir());
			jPContenedor.add(getBtnLimpiar());	
	}
	private float grado = 0;
	private JButton getBtnConvertir() {
		if (btnConvertir == null) {
			btnConvertir = new JButton();
			btnConvertir.setSize(new Dimension(120, 40));
			btnConvertir.setText("CONVERTIR");
			btnConvertir.setLocation(new Point(140, 130));
			btnConvertir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(jTAFarenheit.getText().equals("") && jTAKelvin.getText().equals("")){
						grado = Float.parseFloat(jTACelsius.getText());
						jTAFarenheit.setText("" + ((grado*1.8)+32));
						jTAKelvin.setText("" + (grado + 273.15));
					}else if(jTACelsius.getText().equals("") && jTAKelvin.getText().equals("")){
						grado = Float.parseFloat(jTAFarenheit.getText());
						jTACelsius.setText("" + ((grado-32)/1.8));
						jTAKelvin.setText("" + (((grado-32)/1.8) + 273.15));
					}else if (jTACelsius.getText().equals("") && jTAFarenheit.getText().equals("")) {
						grado = Float.parseFloat(jTAKelvin.getText());
						jTACelsius.setText("" + (grado - 273.15));
						jTAFarenheit.setText("" + (((grado - 273.15)*1.8)+32));
					}else{
						javax.swing.JOptionPane.showMessageDialog(null,"Solo debe de llenar un campo y dejar los otros 2 vacios.");
					}
				}
			});
		}
		return btnConvertir;
	}
	private JButton getBtnLimpiar() {
		if (btnLimpiar == null) {
			btnLimpiar = new JButton();
			btnLimpiar.setSize(new Dimension(120, 40));
			btnLimpiar.setText("LIMPIAR");
			btnLimpiar.setLocation(new Point(280, 130));
			btnLimpiar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					jTACelsius.setText("");
					jTAFarenheit.setText("");
					jTAKelvin.setText("");
				}
			});
		}
		return btnLimpiar;
	}
	
}