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
  
  public class Conversion extends JFrame {
  
  	double faren, kelvin, celsius;
  	JFrame pantalla;
 
  	JLabel lfarenheit, lcelsius, lkelvin;
  	JButton calcular;
	JButton reset;
  	JPanel panel;
  	JTextField tfarenheit;
  	JTextField tcelsius;
  	JTextField tkelvin;
  
  
  	public static void main (String [] args){
  
  		new Conversion().init(); //iniciando el frame
  
  	}
  
  	public void init(){
  //dando valores y puntos a las labels y textfield
  		lfarenheit = new JLabel();
  		lfarenheit.setText("Farenheit");
  		lfarenheit.setBounds(200,70,100,30);
		lfarenheit.setForeground(Color.WHITE);
		
		lcelsius = new JLabel();
  		lcelsius.setText("celsius");
  		lcelsius.setBounds(200,170,100,30);
		lcelsius.setForeground(Color.WHITE);
		
		lkelvin = new JLabel();
  		lkelvin.setText("Kelvin");
  		lkelvin.setBounds(200,260,100,30);
		lkelvin.setForeground(Color.WHITE);
  
  		tfarenheit=new JTextField();
   	    tfarenheit.setBounds(200,100,200,50);
  
  		tcelsius=new JTextField();
   	    tcelsius.setBounds(200,210,200,50);
  	
  		tkelvin=new JTextField();
   	    tkelvin.setBounds(200,300,200,50);
  //dando valores a JButton
		reset = new JButton();
  		reset.setText("reset");
  		reset.setBounds(250,460,100,40);
		reset.setBackground(Color.BLUE);
		reset.setForeground(Color.WHITE);
  //el boton reset es para regresar los textfield a sus valores iniciales
  		reset.addActionListener(new ActionListener() {
		//listener es para escuchar el clic sobre el boton
              public void actionPerformed(ActionEvent e)
              {
                  //actionperformed es para ejecutar una accion despues de escuchar el clic
              	if (e.getSource()==reset){
              	tfarenheit.setText(null);
              	tcelsius.setText(null);
              	tkelvin.setText(null);
              	}
                  
              }
          });
  
  
  
   	    calcular = new JButton();
  		calcular.setText("Convertir");
  		calcular.setBounds(250,390,100,40);
  		calcular.setBackground(Color.BLUE);
		calcular.setForeground(Color.WHITE);
  		calcular.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e)
              {
                 
  //getsource captura la informacion del textfield
  
					if (e.getSource()==calcular && tkelvin.getText().equals("") && tcelsius.getText().equals("")) {
                 		//realizando la conversion de farenheit a celsius y kelvin
                 		String resultadoString=tfarenheit.getText();
                 		double f=Double.parseDouble(resultadoString);
                 		celsius=Math.rint((5*(f-32))/9);
                 		resultadoString=String.valueOf(celsius);
                 		tcelsius.setText(resultadoString);
  
                 		kelvin=Math.rint(((5*(f-32))/9)+273.15);
                 		resultadoString=String.valueOf(kelvin);
                 		tkelvin.setText(resultadoString);
                 		
                 	}
  
                 	if (e.getSource()==calcular && tfarenheit.getText().equals("") && tcelsius.getText().equals("")) {
                 		//conversion de kelvin a celsius y farenheit
                 		String resultadoString=tkelvin.getText();
                 		double k=Double.parseDouble(resultadoString);
                 		celsius=Math.rint(k-273.15);
                 		resultadoString=String.valueOf(celsius);
                 		tcelsius.setText(resultadoString);
  
                 		faren=Math.rint(((9*(k-273.15))/5)+32);
                 		resultadoString=String.valueOf(faren);
                 		tfarenheit.setText(resultadoString);
                 		
                 	}
  
  
                 		if (e.getSource()==calcular && tkelvin.getText().equals("") && tfarenheit.getText().equals("")) {
                 		//conversion de celsius a kelvin y farenheit
                 		String resultadoString=tcelsius.getText();
                 		double c=Double.parseDouble(resultadoString);
                 		faren=Math.rint(((5*c)/9)+32);
                 		resultadoString=String.valueOf(faren);
                 		tfarenheit.setText(resultadoString);
                 		
  
                 		kelvin=Math.rint(c+273.15);
                 		resultadoString=String.valueOf(kelvin);
                 		tkelvin.setText(resultadoString);
                 		
                 	}
               
               
              	
  
                  
              }
          });
  
  		panel=new JPanel();
  		panel.setLayout(null);
  		panel.add(lfarenheit);
  		panel.add(tfarenheit);
  		panel.add(lcelsius);
  		panel.add(tcelsius);
  		panel.add(lkelvin);
  		panel.add(tkelvin);
  		panel.add(calcular);
  		panel.add(reset);
		panel.setBackground(Color.BLACK);
		add(panel);
		setVisible(true);
		setTitle("Conversiones");
  		setSize(600,600);
  		setDefaultCloseOperation(EXIT_ON_CLOSE);
  
  
  	} 
	}
	
	