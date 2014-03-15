import java.awt.event.*;
import javax.swing.*;

public class ConvertDegrees extends JFrame implements ActionListener{
    
        //CREACION DE VARIABLES
		JLabel labelTitle, labelK, labelC, labelF;
        JButton buttonConvert, buttonClean;
        JTextField txtK, txtC, txtF;
        JPanel panel;
        double nFaren, nKelvin, nCelsius;
        String kelvin, celsius, faren;
    
    
    public ConvertDegrees(){
    
        //CONSTRUCTOR
		super("Conversor de Grados");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        labelTitle = new JLabel("CONVERSOR DE GRADOS");
        labelK = new JLabel("Kelvin: ");
        labelC = new JLabel("Celsius: ");
        labelF = new JLabel("Farenheit: ");
        buttonConvert = new JButton("Convertir");
        buttonClean = new JButton("Limpiar Campos");
        txtK =  new JTextField();
        txtC =  new JTextField();
        txtF =  new JTextField();
        panel = new JPanel(null);
        
        labelTitle.setBounds(10, 10, 300, 50);
        labelK.setBounds(10, 100, 300, 50);
        labelC.setBounds(10, 150, 300, 50);
        labelF.setBounds(10, 210, 300, 50);
        
        buttonConvert.setBounds(130, 400, 150, 30);
        buttonClean.setBounds(300, 400, 150, 30);
        
        txtK.setBounds(100, 120, 150, 25);
        txtC.setBounds(100, 170, 150, 25);
        txtF.setBounds(100, 220, 150, 25);
        
        panel.add(buttonConvert);
        panel.add(buttonClean);
        panel.add(labelTitle);
        panel.add(labelK);
        panel.add(labelC);
        panel.add(labelF);
        panel.add(txtK);
        panel.add(txtC);
        panel.add(txtF);
        
        setContentPane(panel);
        
        buttonConvert.addActionListener(this);
        buttonClean.addActionListener(this);
        setVisible(true);
        
    }
    //CREACION DE DE EVENTOS
    @Override
    public void actionPerformed(ActionEvent e){
    
        
        if(e.getSource()==buttonConvert){
        
            if((txtK.getText().compareTo("")==0)&&(txtC.getText().compareTo("")==0)){
            
                faren = txtF.getText();
                nFaren = Double.parseDouble(faren);
                onlyFarenheit(faren, nFaren);
                
            }else if((txtC.getText().compareTo("")==0)&&(txtF.getText().compareTo("")==0)){
            
                kelvin = txtK.getText();
                nKelvin = Double.parseDouble(kelvin);
                onlyKelvin(kelvin, nKelvin);
                
            }else if((txtK.getText().compareTo("")==0)&&(txtF.getText().compareTo("")==0)){
            
                celsius = txtC.getText();
                nCelsius = Double.parseDouble(celsius);
                onlyCelsius(celsius, nCelsius);
            
            }
        
        }
        
        if(e.getSource()==buttonClean){
        
            txtK.setText("");
            txtC.setText("");
            txtF.setText("");
        
        }
    
    }
    //METODO DE PROCEDIMIENTO CUANDO SOLO ESTA EL CAMPO DE FARENHEIT
    public void onlyFarenheit(String faren, double nFaren){
    
        nKelvin = (((5*(nFaren-32))/9)+273.15);
        nCelsius = ((nFaren-32)*5)/9;
        
        kelvin = String.valueOf(nKelvin);
        celsius = String.valueOf(nCelsius);
        
        txtK.setText(kelvin);
        txtC.setText(celsius);
        txtF.setText(faren);
        
    }
    //METODO DE PROCEDIMIENTO CUANDO SOLO ESTA EL CAMPO KELVIN
    public void onlyKelvin(String kelvin, double nKelvin){
    
        nCelsius = (nKelvin-273.12);
        nFaren = ((nKelvin*1.8)-459.67);
        
        celsius = String.valueOf(nCelsius);
        faren = String.valueOf(nFaren);
        
        txtK.setText(kelvin);
        txtC.setText(celsius);
        txtF.setText(faren);
    
    }
    //METODO DE PROCEDIMIENTO CUANDO SOLO ESTA EL CAMPO CELSIUS
    public void onlyCelsius(String celsius, double nCelsius){
    
        nKelvin = (nCelsius+273.15);
        nFaren = ((nCelsius*1.8)+32);
        
        kelvin = String.valueOf(nKelvin);
        faren = String.valueOf(nFaren);
        
        txtK.setText(kelvin);
        txtC.setText(celsius);
        txtF.setText(faren);
    
    }
    
	//METODO MAIN
    public static void main(String[] args) {
        
        //CREACION DEL OBJETO
		ConvertDegrees home = new ConvertDegrees();
        
    }
    
    
}