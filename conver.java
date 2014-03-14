//Importar librerias 
import javax.swing.JButton;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JTextField;
 import javax.swing.JPanel;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;




import javax.swing.JOptionPane;

public class Convert extends JFrame{
 
   JButton CConvert;
   JLabel Celsius, Fahrenheit, Kelvin;
   JTextField CCelcius, FFahrenheit, FKelvin;
   JPanel panel;
 
 	public static void main(String args[]){
 		new Convert().init();		
 	}
 	
 	public void init(){
 
 	//Crear Ventana
        this.setSize(230, 210);
        this.setVisible(true);
        
       

        //Crear Panel
        panel = new JPanel();
        //panel.setSize(50,50);
        panel.setBackground(Color.blue);
        panel.setLayout(null);
         this.add(panel);
         
         //Crear Labels
        celcius = new JLabel();
        celcius.setForeground(Color.white);
        celcius.setText("Celsius");
        celcius.setBounds(18, 30, 90, 25);
        panel.add(celsius);
        
        fahrenheit = new JLabel();
        fahrenheit.setText("Fahrenheit");
        fahrenheit.setForeground(Color.white);
        fahrenheit.setBounds(18, 30, 90, 25);
        panel.add(fahrenheit);
        
        kelvin = new JLabel();
        kelvin.setText("Kelvin");
        kelvin.setForeground(Color.white);
        kelvin.setBounds(18, 30, 90, 25);
        panel.add(kelvin);
        
        //Crear TextField
        CCelcius = new JTextcel();
        CCelcius.setBounds(90,15,100,25);
        panel.add(CCelcius);
        CCelcius.setForeground(Color.blue);
        CCelcius.setText("0");
        
        FFahrenheit = new JTextFah();
        FFahrenheit.setBounds(90,15,100,25);
        panel.add(FFahrenheit);
        FFahrenheit.setForeground(Color.BLUE);
        FFahrenheit.setText("0");
        
        KKelvin = new JTextKel();
        KKelvin.setBounds(90,15,100,25);
        panel.add(KKelvin);
        KKelvin.setForeground(Color.blue);
        KKelvin.setText("0");
 
        //Crear Botones
        CConvert = new JButtonc();
        CConvert.setText("Convertir");
        CConvert.setBounds(20,100,90,25);
        panel.add(CConvert);
        CConvert.setForeground(Color.blue);
        
        CClean = new JButtCC();
        CClean.setText("Borrar");
        CClean.setBounds(110,100,90,25);
        panel.add(CClean);
        CClean.setForeground(Color.blue);

// funcion
CConvert.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    double Celc = Double.parseDouble(CCelcius.getText());
                    double Fahre= Double.parseDouble(FFahrenheit.getText());
                    double Kelvin= Double.parseDouble(KKelvin.getText());  

                    if(Celc!=0){
                        double resp = (CCelc * 1.8) + 32;
                        double resp2 = CCelc + 273.15;
                        FFahrenheit.setText("" + resp);
                        KKelvin.setText(""+ resp2);
                    }
                    else if(Fahre!=0){
                        double resp =((0.555*(Fahre - 32)))+273.15;
                        double resp2 =(0.555*(Fahre - 32));
                        KKelvin.setText("" + resp);
                        CCelcius.setText(""+ resp2);

                   }
                    else if(KKelvin!=0){
                       double resp = (((KKelvin - 273.15) * (1.8)) + 32);
                       double resp2 = KKelvin - 273.15;
                       FFahrenheit.setText("" + resp);
                       CCelcius.setText(""+ resp2);                            
                    }
                }
           }      

	
      }
  }
 
}