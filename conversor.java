import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by itzmar on 3/10/14.
 */

public class conversor extends JFrame {

    JFrame ventana;
    JTextField celcius, fahrenheit, kelvin;
    JLabel cel, fah, kel;
    JButton convert, clear;


    public static void main(String[] args){
        conversor conversor =new conversor();
        conversor.init();
    }
    public void init(){
        /* ventana */
        ventana = new JFrame("Conversor");
        ventana.setBounds(100, 100, 300, 300);
        ventana.setLayout(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);

        /* campos de texto */
        celcius = new JTextField();
        celcius.setBounds(10, 10, 100, 25);
        celcius.setVisible(true);
        ventana.add(celcius);

        fahrenheit = new JTextField();
        fahrenheit.setBounds(10, 50, 100, 25);
        fahrenheit.setLayout(null);
        fahrenheit.setVisible(true);
        ventana.add(fahrenheit);

        kelvin= new JTextField();
        kelvin.setBounds(10,90,100,25);
        kelvin.setLayout(null);
        kelvin.setVisible(true);
        ventana.add(kelvin);

        /* etiquetas */
        cel = new JLabel("Grados Celcius");
        cel.setBounds(120, 10, 200, 25);
        cel.setLayout(null);
        cel.setVisible(true);
        ventana.add(cel);

        fah= new JLabel("Grados Fahrenheit");
        fah.setBounds(120, 50, 200, 25);
        fah.setLayout(null);
        fah.setVisible(true);
        ventana.add(fah);

        kel = new JLabel("Kelvin");
        kel.setBounds(120, 90, 200, 25);
        kel.setLayout(null);
        kel.setVisible(true);
        ventana.add(kel);

        /* botones */
        convert = new JButton("Convertir");
        convert.setBounds(150, 150, 100, 25);
        convert.setLayout(null);
        convert.setVisible(true);
        ventana.add(convert);

        clear = new JButton("Borrar");
        clear.setBounds(150, 200, 100, 25);
        clear.setLayout(null);
        clear.setVisible(true);
        ventana.add(clear);

        convert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                validate();
            }
        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                celcius.setText("");
                fahrenheit.setText("");
                kelvin.setText("");
            }
        });

        }

    public void validate(){
        if(celcius.getText().equals("") && fahrenheit.getText().equals("")) {
            KelvinToCelcius(kelvin.getText());
            KelvinToFahrenheit(kelvin.getText());
        }
        else {
            if(celcius.getText().equals("") && kelvin.getText().equals("")) {
                FahrenheitToCelcius(fahrenheit.getText());
                FahrenheitToKelvin(fahrenheit.getText());
            }
            else {
                if (fahrenheit.getText().equals("") && kelvin.getText().equals("")) {
                    CelciusToFahrenheit(celcius.getText());
                    CelciusToKelvin(celcius.getText());
                }
                else {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la conversión");
                }
            }
        }
    }

    public void CelciusToFahrenheit(String s) {
        double C = Double.parseDouble(s);
        double F = 1.8*C + 32;
        fahrenheit.setText(String.valueOf(F));
    }

    public void CelciusToKelvin(String s) {
        double C = Double.parseDouble(s);
        double K = C + 273.15;
        kelvin.setText(String.valueOf(K));
    }


    public void FahrenheitToCelcius(String s) {
        Double F = Double.parseDouble(s);
        Double C = (5*(F - 32))/9;
        celcius.setText(String.valueOf(C));
    }

    public void FahrenheitToKelvin(String s) {
        Double F = Double.parseDouble(s);
        Double K = ((5*(F - 32))/9) + 273.15;
        kelvin.setText(String.valueOf(K));
    }

    public void KelvinToCelcius(String s) {
        double K = Double.parseDouble(s);
        double C = K - 273.15;
        celcius.setText(String.valueOf(C));
    }

    public void KelvinToFahrenheit(String s) {
        Double K = Double.parseDouble(s);
        Double F = (((K - 273.15)*9)/5) + 32;
        fahrenheit.setText(String.valueOf(F));
    }
}

