import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Yovanni on 11/03/14.
 */
public class InterfazGrafica extends JFrame {
    JTextArea celcius,farenheitt,kelvin;
    JLabel etic,etif,etik;
    JButton calcular,limpiar;
    JPanel panel;
    double cel,far,kel;
    String c,k,f,c2,k2,f2;
    public InterfazGrafica(){
        //Ventana creada
        super("Conversor");
        this.setSize(800,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Panel a trabajar
        panel = new JPanel();
        panel.setSize(200,200);
        panel.setBackground(Color.darkGray);
        panel.setLayout(null);
        this.add(panel);
        //Etiquetas de los tipos de temperaturas
        etic = new JLabel();
        etic.setBackground(Color.white);
        etic.setLocation(300,100);
        etic.setSize(100,20);
        etic.setText("Celcius");
        etic.setOpaque(true);

        etif = new JLabel();
        etif.setBackground(Color.white);
        etif.setLocation(300,300);
        etif.setSize(100,20);
        etif.setText("Farenheitt");
        etif.setOpaque(true);

        etik = new JLabel();
        etik.setBackground(Color.white);
        etik.setLocation(300,500);
        etik.setSize(100,20);
        etik.setText("Kelvin");
        etik.setOpaque(true);

        panel.add(etic);
        panel.add(etif);
        panel.add(etik);
        //Cuadros de texto donde se ingresan los valores
        celcius = new JTextArea();
        celcius.setBounds(600,100,100,20);

        farenheitt = new JTextArea();
        farenheitt.setBounds(600,300,100,20);

        kelvin = new JTextArea();
        kelvin.setBounds(600,500,100,20);

        panel.add(celcius);
        panel.add(farenheitt);
        panel.add(kelvin);
        c2 = celcius.getText();
        f2 = farenheitt.getText();
        k2 = kelvin.getText();
        //Botones para cacular y limpiar
        calcular = new JButton();
        calcular.setBounds(300,600,100,20);
        calcular.setText("Calcular");
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((f2.equals("")) & (k2.equals(""))) {
                    cel = Double.parseDouble(celcius.getText());
                    kel = cel + 273.15;
                    k = String.valueOf(kel);
                    kelvin.setText(k);
                    far = (1.8 * cel) + 32;
                    f = String.valueOf(far);
                    farenheitt.setText(f);
                }
                if ((c2.equals("")) & (k2.equals(""))) {
                    far = Double.parseDouble(farenheitt.getText());
                    cel = (far - 32) / 1.8;
                    c = String.valueOf(cel);
                    celcius.setText(c);
                    kel = cel + 273.15;
                    k = String.valueOf(kel);
                    kelvin.setText(k);
                }
                if ((c2.equals("")) & (f2.equals(""))) {
                    kel = Double.parseDouble(kelvin.getText());
                    cel = kel - 273.15;
                    c = String.valueOf(cel);
                    celcius.setText(c);
                    far = (1.8 * cel) + 32;
                    f = String.valueOf(far);
                    farenheitt.setText(f);
                }
            }
        });
        limpiar = new JButton();
        limpiar.setBounds(500,600,100,20);
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                celcius.setText("");
                farenheitt.setText("");
                kelvin.setText("");
            }
        });
        panel.add(limpiar);
        panel.add(calcular);
    }
}
