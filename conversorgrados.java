import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import javax.swing.*;

public class conversorgrados  extends JFrame{
    
 //By:Daniel Alvizures 
//201313963
    
	JButton convertir, limpiar;
	JLabel celcius,farenheit,kelvin,titulo;
	JTextArea C,K,F;  
	JPanel pan;
        String x,y,z,a,b;
        float cal,Fa,Cel,Kel;
        
    public conversorgrados(){
         setLayout(null);
         setSize(800,600);
         setResizable(false);
         setVisible(true);
         
         titulo=new JLabel("Conversor de Temperaturas");
         titulo.setBounds(50,5,200,30);
         add(titulo);
         
         celcius=new JLabel("Celsius:");
         celcius.setBounds(30,35,100,30);
         add(celcius);
         
         farenheit=new JLabel("Farenheit:");
         farenheit.setBounds(30,80,100,30);
         add(farenheit);
         
         kelvin=new JLabel("Kelvin:");
         kelvin.setBounds(30,120,100,30);
         add(kelvin);
         
         C=new JTextArea();
         C.setBackground(Color.white);
         C.setBounds(100,35,100,25);
         add(C);
        
         
         F=new JTextArea();
         F.setBackground(Color.white);
         F.setBounds(100,80,100,25);
         add(F);
        
         
         K=new JTextArea();
         K.setBackground(Color.white);
         K.setBounds(100,120,100,25);
         add(K);
         
         limpiar=new JButton("Limpiar");
         limpiar.setBackground(Color.gray);
         limpiar.setForeground(Color.white);
         limpiar.setBounds(30,200,100,30);
         add(limpiar);
         
        convertir=new JButton("Calcular");
        convertir.setBackground(Color.gray);
        convertir.setForeground(Color.white);
        convertir.setBounds(150,200,100,30);
         add(convertir);
         
         
         pan=new JPanel();
         pan.setBackground(Color.orange);
         pan.setSize(900, 900);
         pan.setVisible(true);
         add(pan);
    
    
        convertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
         x=C.getText();
         y=F.getText();
         z=K.getText();
         
         if(!x.isEmpty()&&y.isEmpty()&&z.isEmpty()){
             C.setText(x);
             cal=Integer.valueOf(x);
             Fa= (9*cal/5)+32;
             a=String.valueOf(Fa);
             F.setText(a);
             Kel=cal+273;
             b=String.valueOf(Kel);
             K.setText(b);
      }
     else if(x.isEmpty()&&!y.isEmpty()&&z.isEmpty()){
             F.setText(y);
             cal=Integer.valueOf(y);
             Cel=5*(cal-32)/9;
             a=String.valueOf(Cel);
             C.setText(a);
             Kel=Cel+273;
             b=String.valueOf(Kel);
             K.setText(b);
     }
     else if(x.isEmpty()&&y.isEmpty()&&!z.isEmpty()){
             C.setText(z);
             cal=Integer.valueOf(z);
             Cel=cal-273;
             a=String.valueOf(Cel);
             C.setText(a);
             Fa=(9*Cel/5)+32;
             b=String.valueOf(Fa);
             F.setText(b);
     }
     else{
         JOptionPane.showMessageDialog(null,"Debe ingresar el dato en una sola casilla");
     }
            }
        } );
         
            limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
             C.setText("");
             F.setText("");
             K.setText(""); 
            }
        });    
		
    }
}
