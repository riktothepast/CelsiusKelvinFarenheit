
/**
 * Created by Karen on 14/03/14.
 */
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.text.DecimalFormat;

    import javax.swing.*;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JTextField;
    import javax.swing.event.ChangeListener;

 public class ConvercionGrados {
        JFrame jframe;
        JLabel titulo;
        JLabel Cas1;
        JLabel Cas2;
        JLabel Cas3;
        JTextField celsius;
        JTextField farenheit;
        JTextField kelvin;
        JButton boton1;
        JButton boton2;
        JPanel Panel1;

        public static void main(String[] args){

            new ConvercionGrados().init();
        }

        public void init(){

            jframe = new JFrame();
            jframe.setSize(500, 300);
            jframe.setVisible(true);
            titulo = new JLabel();
            titulo.setText("Convertidor de Grados Celsius, Farenheit y Kelvin");
            titulo.setBounds(200, 100, 100, 50);

            celsius=new JTextField();
            celsius.setBounds(10, 10, 200, 30);
            farenheit=new JTextField();
            farenheit.setBounds(10,10,200,30);
            kelvin=new JTextField();
            kelvin.setBounds(10,10,200,30);

            Cas1 = new JLabel();
            Cas1.setText("Celsius");
            Cas1.setSize(100, 50);
            Cas2 = new JLabel();
            Cas2.setText("Farhenheit");
            Cas2.setSize(100, 50);
            Cas3 = new JLabel();
            Cas3.setText("Kelvin");
            Cas3.setSize(100, 50);

            Panel1 = new JPanel();
            Panel1.setSize(500, 200);
            Panel1.setLayout(new GridLayout(2, 3, 0, 0));
            Panel1.add(Cas1);
            Panel1.add(Cas2);
            Panel1.add(Cas3);

            boton1 = new JButton();
            boton2 = new JButton();
            boton1.setText("Convertir");
            boton2.setText("limpiar Valores");

            boton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    DecimalFormat form = new DecimalFormat("#.##");
                    double f, k, ce;
                    if (farenheit.getText().toString().equals("")) {
                        f = 0;
                        ce = 0;
                        k = 0;
                        f = Double.parseDouble(farenheit.getText().toString());
                        ce = f - (32 / 1.8);
                        k = ce + 273;
                        kelvin.setText("" + form.format(k));
                        celsius.setText("" + form.format(ce));

                    } else if (celsius.getText().toString().equals("")) {
                        f = 0;
                        ce = 0;
                        k = 0;
                        ce = Double.parseDouble(celsius.getText().toString());
                        k = ce + 273;
                        f = (1.8 * ce) + 32;

                        kelvin.setText("" + form.format(k));
                        farenheit.setText("" + form.format(f));
                    } else {

                        f = 0;
                        ce = 0;
                        k = 0;
                        k = Double.parseDouble(kelvin.getText().toString());
                        ce = k - 273;
                        f = (1.8 * ce) + 32;
                        farenheit.setText("" + form.format(f));
                        celsius.setText("" + form.format(ce));
                    }
                }

            });

            boton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)
                {
                    farenheit.setText("");
                    celsius.setText("");
                    kelvin.setText("");

                }
            });

            jframe.add(titulo);
            jframe.add(celsius);
            jframe.add(farenheit);
            jframe.add(kelvin);
            jframe.add(Cas1);
            jframe.add(Cas2);
            jframe.add(Cas3);
            jframe.add(boton1);
            jframe.add(boton2);
        }
}
