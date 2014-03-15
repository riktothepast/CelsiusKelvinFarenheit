/**
 * Created by Raquel on 14/03/14.
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Ventana extends JFrame{
    JPanel panelFondo;
    JLabel etiquetaMedida, etiquetaCelcius, etiquetaFahrenheit, etiquetaKelvin;
    JFormattedTextField celcius,fahrenheit,kelvin;
    JButton convertir,limpiar;
    double vCelcius = 0;
    double vFahrenheit = 0;
    double vKelvin = 0;
    String tCelcius, tFahrenheit, tKelvin;


    public Ventana(){
        //Ventana
        this.setBounds(100, 100, 400, 500);
        this.setTitle("Conversor de Temperatura");
        this.setVisible(true);

        //Panel
        panelFondo = new JPanel();
        panelFondo.setBounds(100, 100, 400, 500);
        panelFondo.setBackground(Color.black);
        panelFondo.setLayout(null);
        this.add(panelFondo);

        //Etiqueta "Ingrese Medida:"
        etiquetaMedida  = new JLabel();
        etiquetaMedida.setBackground(Color.black);
        etiquetaMedida.setForeground(Color.white);
        etiquetaMedida.setLocation(50,50);
        etiquetaMedida.setSize(100,15);
        etiquetaMedida.setText("Ingrese Medida:");
        etiquetaMedida.setOpaque(true);


        //Etiqueta "Grados Celcius:"
        etiquetaCelcius = new JLabel();
        etiquetaCelcius.setBackground(Color.black);
        etiquetaCelcius.setForeground(Color.white);
        etiquetaCelcius.setLocation(50, 100);
        etiquetaCelcius.setSize(30, 20);
        etiquetaCelcius.setText("ºC");
        etiquetaCelcius.setOpaque(true);

        //Etiqueta "Grados Fahrenheit:"
        etiquetaFahrenheit = new JLabel();
        etiquetaFahrenheit.setBackground(Color.black);
        etiquetaFahrenheit.setForeground(Color.white);
        etiquetaFahrenheit.setLocation(50,130);
        etiquetaFahrenheit.setSize(30,20);
        etiquetaFahrenheit.setText("ºF");
        etiquetaFahrenheit.setOpaque(true);

        //Etiqueta "Kelvin:"
        etiquetaKelvin = new JLabel();
        etiquetaKelvin.setBackground(Color.black);
        etiquetaKelvin.setForeground(Color.white);
        etiquetaKelvin.setLocation(50,160);
        etiquetaKelvin.setSize(30,20);
        etiquetaKelvin.setText("K");
        etiquetaKelvin.setOpaque(true);

        //Agregando etiquetas
        panelFondo.add(etiquetaMedida);
        panelFondo.add(etiquetaCelcius);
        panelFondo.add(etiquetaFahrenheit);
        panelFondo.add(etiquetaKelvin);


        //Cuandro de texto con medidas
        celcius = new JFormattedTextField(new Double(0));
        celcius.setBounds(100,100,100,20);

        fahrenheit = new JFormattedTextField(new Double(0));
        fahrenheit.setBounds(100,130,100,20);

        kelvin = new JFormattedTextField(new Double(0));
        kelvin.setBounds(100,160,100,20);

        //Agregando textos
        panelFondo.add(celcius);
        panelFondo.add(fahrenheit);
        panelFondo.add(kelvin);

        //Botón limpiar


        limpiar = new JButton();
        limpiar.setText("Limpiar");
        limpiar.setBounds(100,220,100,20);

        limpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                celcius.setValue(0);
                fahrenheit.setValue(0);
                kelvin.setValue(0);

            }
        });


        //Botón convertir
        convertir = new JButton();
        convertir.setText("Convertir");
        convertir.setBounds(100,190,100,20);

        convertir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                vCelcius = Double.parseDouble(celcius.getText());
                vFahrenheit = Double.parseDouble(fahrenheit.getText());
                vKelvin = Double.parseDouble(kelvin.getText());

                //Si se ingresó cantidad en Celcius
                if((vFahrenheit==0)&&(vKelvin==0)){

                    vFahrenheit = ((vCelcius*9)/5)+32;
                    tFahrenheit = Double.toString(vFahrenheit);
                    fahrenheit.setText(tFahrenheit);

                    vKelvin =  (vCelcius + 273.15);
                    tKelvin = Double.toString(vKelvin);
                    kelvin.setText(tKelvin);

                //Si se ingresó cantidad en Fahrenheit
                }else {
                    if ((vCelcius == 0) && (vKelvin == 0)) {

                        vCelcius = (vFahrenheit - 32) * (5 / 9);
                        tCelcius = Double.toString(vCelcius);
                        celcius.setText(tCelcius);

                        vKelvin = vCelcius + 273.15;
                        tKelvin = Double.toString(vKelvin);
                        kelvin.setText(tKelvin);

                        //Si se ingresó valor en Kelvin
                    } else {

                        vCelcius = vKelvin + 237.15;
                        tCelcius = Double.toString(vCelcius);
                        celcius.setText(tCelcius);

                        vFahrenheit = ((vKelvin - 273.15)*(9/5))+32;
                        tFahrenheit = Double.toString(vFahrenheit);
                        fahrenheit.setText(tFahrenheit);

                    }
                }


            }
        });

        //Agregando botones
        panelFondo.add(convertir);
        panelFondo.add(limpiar);




    }

    public static void main(String[] Argumentos){
        Ventana ventana = new Ventana() ;
        ventana.show();
}


}
