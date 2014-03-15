import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Point;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;


public class Calcular extends JFrame{
	public static void main(String[] args) {
		new Calcular().setVisible(true);
	}

	private JFrame jFrame = null;
	private JPanel contenedor = null;
	private JButton convertir = null;
	private JButton limpiar = null;	
	private JLabel celsius = null;
	private JLabel farenheits = null;
	private JLabel kelvins = null;
	private JTextArea centigrados = null;
	private JTextArea kelvin = null;
	private JTextArea farenheit = null;
	
	
	
	public Calcular(){
		inicio();
		
		
	}
	public void inicio(){
	
	
		setSize(new Dimension(600, 600));
		contenedor = new JPanel();
		setContentPane(contenedor);
		contenedor.setLayout(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		celsius = new JLabel();
		farenheits = new JLabel();
		kelvins = new JLabel();
		centigrados = new JTextArea();
		kelvin = new JTextArea();
		farenheit = new JTextArea();
		
		
				
		celsius.setText("Grados Centigrados:");
		celsius.setLocation(new Point(40, 55));
		celsius.setSize(new Dimension(125, 30));
		contenedor.add(celsius);
		centigrados = new JTextArea();
		centigrados.setSize(155, 50);
		centigrados.setLocation(new Point(180, 55));
		contenedor.add(centigrados);
		farenheits.setText("Grados Farenheit:");
		farenheits.setLocation(new Point(40, 115));
		farenheits.setSize(new Dimension(115, 30));
		contenedor.add(farenheits);
		farenheit.setSize(new Dimension(155, 50));
		farenheit.setLocation(new Point(180, 115));
		contenedor.add(farenheit);
		kelvins.setText("Grados Kelvin:");
		kelvins.setLocation(new Point(40, 175));
		kelvins.setSize(new Dimension(115, 30));
		contenedor.add(kelvins);
		kelvin.setSize(new Dimension(155, 50));
		kelvin.setLocation(new Point(180, 175));
		contenedor.add(kelvin);	
		contenedor.add(getconvertir());
		contenedor.add(getlimpiar());	
	}
	private float x = 0;
	private JButton getconvertir() {
	
	
		if (convertir == null) {
			convertir = new JButton();
			convertir.setSize(new Dimension(130, 40));
			convertir.setText("Calcular");
			convertir.setLocation(new Point(370, 90));
			convertir.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
			if(farenheit.getText().equals("") && kelvin.getText().equals("")){
				x = Float.parseFloat(centigrados.getText());
				farenheit.setText("" + ((x*1.8)+32));
				kelvin.setText("" + (x + 273.15));
				
				
			}else if(centigrados.getText().equals("") && kelvin.getText().equals("")){
				x = Float.parseFloat(farenheit.getText());
				centigrados.setText("" + ((x -32)/1.8));
				kelvin.setText("" + (((x-32)/1.8) + 273.15));
				
				
			}else if (centigrados.getText().equals("") && farenheit.getText().equals("")) {
				x = Float.parseFloat(kelvin.getText());
				centigrados.setText("" + (x - 273.15));
				farenheit.setText("" + (((x- 273.15)*1.8)+32));
				
				
			}else{
				javax.swing.JOptionPane.showMessageDialog(null,"Solo debe de llenar un campo y dejar los otros 2 vacios.");
			}
			}
			});
		}
		return convertir;
	}
	
	
	private JButton getlimpiar() {
	
		if (limpiar == null) {
			limpiar = new JButton();
			limpiar.setSize(new Dimension(130, 40));
			limpiar.setText("Reiniciar");
			limpiar.setLocation(new Point(370, 150));
			limpiar.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e){
				centigrados.setText("");
				farenheit.setText("");
				kelvin.setText("");
			}
			});
		}
		return limpiar;
	}
	
}