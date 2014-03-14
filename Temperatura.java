import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class Temperatura extends JFrame {

	double resultadof, resultadok, resultadoc;
	JFrame jframe;
	JLabel lbltitulo;
	JLabel lblfarenheit;
	JLabel lblcelsius;
	JLabel lblkelvin;
	JButton calcular;
	JButton limpiar;
	JPanel panel;
	JTextField textfarenheit;
	JTextField textcelcius;
	JTextField textkelvin;


	public static void main (String [] args){

		new Temperatura().init();

	}

	public void init(){

		lbltitulo = new JLabel();
		lbltitulo.setText("CONVERSOR DE TEMPERATURAS");
		lbltitulo.setBounds(130,10,200,30);

		lblfarenheit = new JLabel();
		lblfarenheit.setText("Farenheit");
		lblfarenheit.setBounds(120,70,100,30);

		textfarenheit=new JTextField();
 	    textfarenheit.setBounds(120,100,200,50);

		lblcelsius = new JLabel();
		lblcelsius.setText("Celsius");
		lblcelsius.setBounds(120,170,100,30);

		textcelcius=new JTextField();
 	    textcelcius.setBounds(120,210,200,50);


		lblkelvin = new JLabel();
		lblkelvin.setText("Kelvin");
		lblkelvin.setBounds(120,260,100,30);

		textkelvin=new JTextField();
 	    textkelvin.setBounds(120,300,200,50);

 	    calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(170,390,100,40);
		calcular.setForeground(Color.black);

		calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                //LO QUE EJECUTARA EL BOTON AL SER PRESIONADO


               	if (e.getSource()==calcular && textfarenheit.getText().equals("") && textcelcius.getText().equals("")) {
               		
               		String str=textkelvin.getText();
               		double k=Double.parseDouble(str);
               		resultadoc=Math.rint(k-273.15);
               		str=String.valueOf(resultadoc);
               		textcelcius.setText(str);

               		resultadof=Math.rint(((9*(k-273.15))/5)+32);
               		str=String.valueOf(resultadof);
               		textfarenheit.setText(str);
               		
               	}


               	if (e.getSource()==calcular && textkelvin.getText().equals("") && textcelcius.getText().equals("")) {
               		
               		String str=textfarenheit.getText();
               		double f=Double.parseDouble(str);
               		resultadoc=Math.rint((5*(f-32))/9);
               		str=String.valueOf(resultadoc);
               		textcelcius.setText(str);

               		resultadok=Math.rint(((5*(f-32))/9)+273.15);
               		str=String.valueOf(resultadok);
               		textkelvin.setText(str);
               		
               	}

               		if (e.getSource()==calcular && textkelvin.getText().equals("") && textfarenheit.getText().equals("")) {
               		
               		String str=textcelcius.getText();
               		double c=Double.parseDouble(str);
               		resultadof=Math.rint(((5*c)/9)+32);
               		str=String.valueOf(resultadof);
               		textfarenheit.setText(str);
               		

               		resultadok=Math.rint(c+273.15);
               		str=String.valueOf(resultadok);
               		textkelvin.setText(str);
               		
               	}
             
             
            	

                
            }
        });

		limpiar = new JButton();
		limpiar.setText("Limpiar");
		limpiar.setBounds(170,460,100,40);

		limpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
            	if (e.getSource()==limpiar){
            	textfarenheit.setText(null);
            	textcelcius.setText(null);
            	textkelvin.setText(null);
            	}
                
            }
        });

		panel=new JPanel();
		panel.setLayout(null);

		panel.add(lbltitulo);
		panel.add(lblfarenheit);
		panel.add(textfarenheit);
		panel.add(lblcelsius);
		panel.add(textcelcius);
		panel.add(lblkelvin);
		panel.add(textkelvin);
		panel.add(calcular);
		panel.add(limpiar);

		
		add(panel);
		setSize(500,600);
		setForeground(Color.BLUE);
		setVisible(true);
		setTitle("Convertidor de Temperatura :D");
		setDefaultCloseOperation(EXIT_ON_CLOSE);


	} 


}