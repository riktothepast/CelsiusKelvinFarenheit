import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.geom.Arc2D;

/**
 * Created by Leslie on 12/03/14.
 */


    public class TempEve extends JFrame {

        JLabel Kelvin = new JLabel ("    Kelvin:");
        JTextField TKelvin = new JTextField("");
        JLabel Celsius = new JLabel ("    Celsius:");
        JTextField TCelsius = new JTextField("");
        JLabel Farenheit = new JLabel ("    Farenheit:");
        JTextField TFarenheit = new JTextField("");
        JButton conv = new JButton("Convertir");
        JButton lim = new JButton("Limpiar");
        Double  va1, va2, va3, va11, va22, va33;
        String ca1, ca2, ca3, ca11, ca22, ca33;

        public TempEve(){
            super ("Convertidor");
            Apariencia();
            this.setSize(300, 200);
            setLocationRelativeTo(this);
            setResizable(false);
            this.setBackground(Color.green);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            GridLayout ord = new GridLayout(4,2);
            setLayout(ord);

            lim.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    TKelvin.setText("");
                    TCelsius.setText("");
                    TFarenheit.setText("");
                }
            });


            conv.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   if ((TFarenheit.getText()).equals ("")&& (TKelvin.getText()).equals("")){

                       va11= Double.parseDouble(TCelsius.getText());
                       va22= va11+273;
                       va33 = (va11*1.8)+32;

                       ca11 = String.valueOf(va11);
                       ca22 = String.valueOf(va22);
                       ca33 = String.valueOf(va33);

                       TKelvin.setText(ca22);
                       TCelsius.setText(ca11);
                       TFarenheit.setText(ca33);


                   } else if ((TFarenheit.getText()).equals ("")&& (TCelsius.getText()).equals("")){

                           va1= Double.parseDouble(TKelvin.getText());
                           va2= va1-273;
                           va3 = (va2*1.8)+32;

                           ca1 = String.valueOf(va1);
                           ca2 = String.valueOf(va2);
                           ca3 = String.valueOf(va3);

                           TKelvin.setText(ca1);
                           TCelsius.setText(ca2);
                           TFarenheit.setText(ca3);


                   } else if ((TCelsius.getText()).equals ("")&& (TKelvin.getText()).equals("")){

                       va1= Double.parseDouble(TFarenheit.getText());
                       va2= (va1-32)/1.8;
                       va3 = va2+273;

                       ca1 = String.valueOf(va1);
                       ca2 = String.valueOf(va2);
                       ca3 = String.valueOf(va3);

                       TKelvin.setText(ca3);
                       TCelsius.setText(ca2);
                       TFarenheit.setText(ca1);
                   }

                }
            });

                    add(Kelvin);
                    add(TKelvin);
                    add(Celsius);
                    add(TCelsius);
                    add(Farenheit);
                    add(TFarenheit);
                    add(lim);
                    add(conv);

                setVisible(true);
                }


                public void Apariencia() {
                    try {
                        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                    } catch (Exception exc) {
                        // no mostrar error}
                    }
                }


            }
