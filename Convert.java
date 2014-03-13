import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Convert extends JFrame{

    JButton btConvert, btClean;
    JLabel celcius, fahrenheit, kelvin;
    JTextField tfCelcius, tfsFahrenheit, tfKelvin;
    JPanel panel;

	public static void main(String args[]){
		new Convert().init();		
	}
	
	public void init(){

	//Crear Ventana
        this.setSize(245, 220);
        this.setVisible(true);
        this.setTitle("Convertidor - 201314237 HerberthO.");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Crear Panel
        panel = new JPanel();
        //panel.setSize(50,50);
        panel.setBackground(Color.darkGray);
        panel.setLayout(null);
        this.add(panel);
        
        //Crear Labels
        celcius = new JLabel();
        celcius.setForeground(Color.white);
        celcius.setText("Celcius");
        celcius.setBounds(15, 10, 100, 20);
        panel.add(celcius);
        
        fahrenheit = new JLabel();
        fahrenheit.setText("Fahrenheit");
        fahrenheit.setForeground(Color.white);
        fahrenheit.setBounds(15, 40, 100, 20);
        panel.add(fahrenheit);
        
        kelvin = new JLabel();
        kelvin.setText("Kelvin");
        kelvin.setForeground(Color.white);
        kelvin.setBounds(15, 70, 100, 20);
        panel.add(kelvin);
        
        //Crear TextField
        tfCelcius = new JTextField();
        tfCelcius.setBounds(105,10,113,20);
        panel.add(tfCelcius);
        tfCelcius.setForeground(Color.black);
        tfCelcius.setText("0");
        
        tfsFahrenheit = new JTextField();
        tfsFahrenheit.setBounds(105,40,113,20);
        panel.add(tfsFahrenheit);
        tfsFahrenheit.setForeground(Color.black);
        tfsFahrenheit.setText("0");
        
        tfKelvin = new JTextField();
        tfKelvin.setBounds(105,70,113,20);
        panel.add(tfKelvin);
        tfKelvin.setForeground(Color.black);
        tfKelvin.setText("0");

        //Crear Botones
        btConvert = new JButton();
        btConvert.setText("Convertir");
        btConvert.setBounds(15,100,96,20);
        panel.add(btConvert);
        btConvert.setForeground(Color.black);
        
        btClean = new JButton();
        btClean.setText("Borrar");
        btClean.setBounds(120,100,96,20);
        panel.add(btClean);
        btClean.setForeground(Color.black);
        
        //Crear accion
        btConvert.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    double iCelc = Double.parseDouble(tfCelcius.getText());
                    double ifahre= Double.parseDouble(tfsFahrenheit.getText());
                    double ikelvin= Double.parseDouble(tfKelvin.getText());  

                    if(iCelc!=0){
                        double resp = (iCelc * 1.8) + 32;
                        double resp2 = iCelc + 273.15;
                        tfsFahrenheit.setText("" + resp);
                        tfKelvin.setText(""+ resp2);
                    }
                    else if(ifahre!=0){
                        double resp =((5*(ifahre - 32))/9)+273.15;
                        double resp2 =(5*(ifahre - 32))/9;
                        tfKelvin.setText("" + resp);
                        tfCelcius.setText(""+ resp2);

                    }
                    else if(ikelvin!=0){
                        double resp = (((ikelvin - 273.15) * (1.8)) + 32);
                        double resp2 = ikelvin - 273.15;
                        tfsFahrenheit.setText("" + resp);
                        tfCelcius.setText(""+ resp2);                            
                    }
                }
            }                
         );
        btClean.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    tfKelvin.setText("0");
                    tfCelcius.setText("0");
                    tfsFahrenheit.setText("0");
                }
            }
        	
        ); 
        
		
	}
	
}
