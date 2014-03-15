import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Juan RA on 13/03/14.
 */
public class convertirgrados {
    JTextField area1,area2,area3;
    JFrame a1;
    JLabel l1,l2,l3;
    JButton b1,b2;
    public static void main (String[] args){

        new convertirgrados().init();
    }


        public void init(){

            a1= new JFrame();
            a1.setSize(500, 500);
            a1.setVisible(true);
            l1=new JLabel("Celcius");
            l1.setBounds(10, 20, 50, 40);
            area1=new JTextField();
            area1.setBounds(145, 20, 150, 40);
            a1.add(area1);
            l2=new JLabel("Fahrenheit");
            l2.setBounds(10,180,50,40);
            area2=new JTextField();
            area2.setBounds(145, 100, 150, 40);
            a1.add(area2);
            l3=new JLabel("Kelvin");
            l3.setBounds(10,100,80,40);
            area3=new JTextField();
            area3.setBounds(145, 180, 150, 40);
            a1.add(area3);
            a1.add(l1);
            a1.add(l2);
            a1.add(l3);
            b1=new JButton("Calcular");
            b1.setBounds(100,300,90,40);
            b1.setLayout(null);
            b2=new JButton("Limpiar");
            b2.setBounds(300,300,90,40);
            b2.setLayout(null);
            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    String d1=area1.getText();
                    String d2=area2.getText();
                    String d3=area3.getText();
                    if(d3.equals("")&& d2.equals("")){
                        double c=Double.parseDouble(d1);
                        double f=(c*(9/5))+32;
                        double k=c+273.15;
                        String t1=String.valueOf(f);
                        String t2=String.valueOf(k);

                        area2.setText(t1);
                        area3.setText(t2);
                    }

                    if(d1.equals("")&&d3.equals("")){
                        double f=Double.parseDouble(d2);
                        double c=(f-32)*(5/9);
                        double k=((f-32)*(5/9))+273.15;
                        String t1=String.valueOf(c);
                        String t2=String.valueOf(k);

                        area1.setText(t1);
                        area3.setText(t2);
                    }

                  if(d1.equals("")&&d2.equals("")){

                      double k=Double.parseDouble(d3);
                      double c=k-273.15;
                      double f=((k-273.15)*(9/5))+32;
                      String t1=String.valueOf(c);
                      String t2=String.valueOf(f);

                      area1.setText(t1);
                      area2.setText(t2);
                  }




                }
            });

            b2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    area1.setText("");
                    area2.setText("");
                    area3.setText("");

                }
            });

            a1.add(b1);
            a1.add(b2);
        }

}
