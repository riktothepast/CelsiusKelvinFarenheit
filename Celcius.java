

package celcius;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author jairo
 */
public class Celcius extends JFrame implements ActionListener{
   JLabel univ,nomb,ce,fa,ke;
   JTextField txtcelcius,txtfa,txtkelv;
   JButton convertir,limpiar;
   JPanel panel;
   
   public Celcius (){
     univ = new JLabel ("Universidad San Carlos de Guatemala");
     univ.setBounds(100, 0, 300, 20);
     nomb = new JLabel ("Clisman Rocael Acajabon Gudiel");
     nomb.setBounds(100,20,300,20);
     ce = new JLabel ("Celcius");
     ce.setBounds(10, 50, 80, 20);
     fa = new JLabel ("Farenheit");
     fa.setBounds(10,80,80,20);
     ke = new JLabel ("Kelvin");
     ke.setBounds(10,110,80,20);
     
     txtcelcius = new JTextField();
     txtcelcius.setBounds(130, 50, 80, 20);
     txtfa = new JTextField();
     txtfa.setBounds(130,80,80,20);
     txtkelv = new JTextField();
     txtkelv.setBounds(130,110,80,20);
     
     convertir = new JButton("Convertir");
     convertir.setBounds(250,60 , 100,20 );
     convertir.addActionListener(this);
     limpiar = new JButton("Limpiar");
     limpiar.setBounds(250,100 , 80,20);
     limpiar.addActionListener(this);
     
     panel = new JPanel ();
     panel.setLayout(null);
     
     panel.add(univ);
     panel.add(nomb);
     panel.add(ce);
     panel.add(fa);
     panel.add(ke);
     panel.add(txtcelcius);
     panel.add(txtfa);
     panel.add(txtkelv);
     panel.add(convertir);
     panel.add(limpiar);
     
     add (panel);
     setSize(500,300);
     setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   }
   
    
    public static void main(String[] args) {
      Celcius c = new Celcius();
        /**JFrame frame = new JFrame ("Grados");
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        * 
         * JLabel label = new JLabel ("Universidad San Carlos de Guatemala");
        JPanel panel = new JPanel ();
        frame.add(panel);
        panel.add(label);
        JButton button = new JButton ("Convertir");
        panel.add(button);
        */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
      if (e.getSource()==convertir){ 
          int a;
          int b;
          int c;
     if (txtfa.getText().equals("") & txtkelv.getText().equals("")){
        a = Integer.parseInt (txtcelcius.getText());
               b=(9/5*a)+32;
          txtfa.setText(String.valueOf(b));
          c=a + 273;
          txtkelv.setText(String.valueOf(c)); 
     } else{
         if (txtcelcius.getText().equals("") & txtkelv.getText().equals("")){
         a = Integer.parseInt(txtfa.getText());
               b=(a-32)*5/9;
          txtcelcius.setText(String.valueOf(b));
          b=(a-32)*5/9;
          c=b + 273;
          txtkelv.setText(String.valueOf(c));    
         }if (txtcelcius.getText().equals("") & txtfa.getText().equals("")){
           a = Integer.parseInt(txtkelv.getText());
               b=a-273;
          txtcelcius.setText(String.valueOf(b));
          b=a-273;
          c=(9/5*b)+32;
          txtfa.setText(String.valueOf(c));  
         }
     }    
    
}
         if (e.getSource()==limpiar){
          txtcelcius.setText(String.valueOf(""));
          txtfa.setText(String.valueOf(""));
          txtkelv.setText(String.valueOf(""));
      }   
            
            }
      

          /**mostrar lo mismo de una casilla en otra
           * txtfa.setText(txtcelcius.getText());
          txtkelv.setText(txtcelcius.getText());*/
      
      
    }
    

