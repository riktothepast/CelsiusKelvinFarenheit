/**
 * Created by David on 14/03/14.
 */
import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grados extends JFrame{
    //constructor
    JLabel titulo,F,C,K;
    JTextField celsius,fahrenheit,kelvin;
    JPanel fondo;
    JButton boton;
    JButton limpia;




    public  Grados(){

        super.setLayout(null);
        super.setSize(400, 350);
        super.setVisible(true);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        DecimalFormat decimal= new DecimalFormat();


        //panel
        fondo=new JPanel();
        fondo.setBounds(2,2,380,310);
        //fondo.setBackground(Color.white);
        fondo.setLayout(null);
        fondo.setVisible(true);

        //etiquetas
        titulo=new JLabel();//se llama al lebol
        titulo.setBounds(130,10, 200, 70);
        titulo.setText("CONVERSION DE GRADOS");
        fondo.add(titulo);

        C=new JLabel();//pondra etiqueta con celsius
        C.setBounds(10, 100, 100, 20);
        C.setText("Celsius");
        fondo.add(C);

        F= new JLabel();
        F.setBounds(10, 150, 100, 20);
        F.setText("Kelvin");
        fondo.add(F);

        K=new JLabel();
        K.setBounds(10, 200, 100, 20);
        K.setText("Fahrenheit");
        fondo.add(K);

//Cuadros de texto
        celsius = new JTextField();
        celsius.setForeground(Color.BLUE);
        celsius.setVisible(true);
        celsius.setBounds(100,100,150,20);
        fondo.add(celsius);

        kelvin=new JTextField();
        kelvin.setForeground(Color.BLUE);
        kelvin.setVisible(true);
        kelvin.setBounds(100,150,150,20);
        fondo.add(kelvin);

        fahrenheit =new JTextField();
        fahrenheit.setForeground(Color.BLUE);
        fahrenheit.setVisible(true);
        fahrenheit.setBounds(100,200,150,20);
        fondo.add(fahrenheit);


        //botones
        boton=new JButton();
        boton.setText("Calcular");
        boton.setBounds(50,250,90,30);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


                String cel = celsius.getText();
                String kel=kelvin.getText();
                String far=fahrenheit.getText();
                int grados;

                Double fr,kl,cl;

                if(cel.equals("")&&kel.equals("")&&far.equals("")){
                    JOptionPane.showMessageDialog(null,"Ingrese un dato");

                } else if(far.equals("")&&kel.equals("")){
                    try{
                        grados=Integer.parseInt(cel);
                        fr=(1.8*grados)+32;
                        fr=Math.rint(fr*100)/100;
                        kl=grados+273.15;
                        kl=Math.rint(kl*100)/100;
                        fahrenheit.setText(String.valueOf(fr));
                        kelvin.setText(String.valueOf(kl));


                    } catch (NumberFormatException ex){

                        JOptionPane.showMessageDialog(null,"Numero Incorrecto");
                    }
                } else if(kel.equals("")&&cel.equals("")){
                    try{
                        grados=Integer.parseInt(far);
                        cl=(grados -32)/1.8;
                        cl=Math.rint(cl*100)/100;
                        kl=cl+273.15;
                        kl=Math.rint(kl*100)/100;
                        celsius.setText(String.valueOf(cl));
                        kelvin.setText(String.valueOf(kl));
                    } catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null,"Numero Incorrecto");
                    }
                } else if(far.equals("")&&cel.equals("")){
                    try{
                        grados=Integer.parseInt(kel);
                        cl=grados-273.15;
                        cl=Math.rint(cl*100)/100;
                        fr=(cl*1.8)+32;
                        fr=Math.rint(fr*100)/100;
                        celsius.setText(String.valueOf(cl));
                        fahrenheit.setText(String.valueOf(fr));
                    } catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(null,"Numero Incorrecto");
                    }
                }
            }
        });

        fondo.add(boton);
        limpia=new JButton();
        limpia.setText("Borrar");
        limpia.setBounds(200,250,90,30);
        limpia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fahrenheit.setText("");
                celsius.setText("");
                kelvin.setText("");
            }
        });
        fondo.add(limpia);
        super.add(fondo);
        super.setVisible(true);

    }



    //este es lo principal
    public static void main(String [] arg){
        Grados g=new Grados();
        g.fondo.repaint();

    }
}

