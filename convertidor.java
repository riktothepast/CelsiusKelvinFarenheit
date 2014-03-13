import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class convertidor extends JFrame{
    JFrame ventana;
    JLabel[]titulo=new JLabel[3];
    JTextField[] valores = new JTextField[3];
    JButton conv = new JButton("Convertir");
    JButton limpiar= new JButton("Limpiar");


    public convertidor(){

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setSize(350, 350);
        setLayout(null);

        for(int i=0;i<3;i++){
            titulo[i]= new JLabel();
            titulo[i].setBounds(10, (i * 30) + 30, 150, 30);

            valores[i] = new JTextField();
            valores[i].setBounds(180,(i*30)+30,100, 30);
            add(valores[i]);
            add(titulo[i]);

        }



        titulo[0].setText("Kelvin");
        titulo[1].setText("Celsius");
        titulo[2].setText("Fahrenheit");



        conv.setBounds(20,140, 100, 30);
        limpiar.setBounds(130,140,100,30);
        add(limpiar);
        add(conv);

        conv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==conv) {

                    if(!"".equals(valores[0].getText())&&"".equals(valores[1].getText())&&"".equals(valores[2].getText())){
                        convertidor1();
                    }else if("".equals(valores[0].getText())&&!"".equals(valores[1].getText())&&"".equals(valores[2].getText())){
                        convertidor2();
                    }else if("".equals(valores[0].getText())&&"".equals(valores[1].getText())&&!"".equals(valores[2].getText())){
                        convertidor3();
                    }else if("".equals(valores[0].getText())&&"".equals(valores[1].getText())&&"".equals(valores[2].getText())){
                        JOptionPane.showMessageDialog(ventana,"Casillas Vacias");
                    }else{
                        JOptionPane.showMessageDialog(ventana,"Ingrese valor en una sola casilla");
                    }
                }
            }
        });


        limpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == limpiar) {
                    valores[0].setText("");
                    valores[1].setText("");
                    valores[2].setText("");
                }
            }
        });



        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void convertidor1()
    {
        double kelvin= Integer.parseInt(valores[0].getText());
        double cel1= kelvin-273.15;
        double fah1=((1.8)*(cel1))+32;
        String resultado1=Double.toString(cel1);
        String resultado2=Double.toString(fah1);
        valores[1].setText(resultado1);
        valores[2].setText(resultado2);

    }

    public void convertidor2(){
        double celsius=Integer.parseInt(valores[1].getText());
        double k1=celsius+273.15;
        double fah2=((1.8)*(celsius))+32;
        String resultado3=Double.toString(k1);
        String resultado4=Double.toString(fah2);
        valores[0].setText(resultado3);
        valores[2].setText(resultado4);
    }
    public void convertidor3(){
        double farenheit=Integer.parseInt(valores[2].getText());
        double cel2=((farenheit-32)/(1.8));
        double k2=cel2+273.15;
        String resultado5=Double.toString(cel2);
        String resultado6=Double.toString(k2);
        valores[0].setText(resultado6);
        valores[1].setText(resultado5);
    }





    public static void main(String args[]){
        convertidor ventana= new convertidor();
    }

}