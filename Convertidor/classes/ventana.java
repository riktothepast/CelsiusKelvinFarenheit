/**
 * @(#)ventana.java
 *
 *
 * @author 
 * @version 1.00 2014/3/13
 */
 import javax.swing.*;

public class ventana extends JFrame {
	
	JButton calcular,limpiar;
	//in de entrada.
	JTextField incel,infar,inkel;
	JLabel c,f,k;

    public ventana() {
    
    //dando propiedades a la ventana
    setSize(300,400);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    //coloco botones
    calcular=new JButton("Calcular");
    limpiar=new JButton("Limpiar");
    calcular.setBounds(50,310,100,30);
   	add(calcular);
   	limpiar.setBounds(165,310,100,30);
   	add(limpiar);
   	
   	//colocar Labels.
   	c=new JLabel("Celcius");
   	f=new JLabel("Farenheit");
   	k=new JLabel("Kelvin");
   	c.setBounds(10,75,80,30);
   	f.setBounds(10,115,80,30);
   	k.setBounds(10,155,80,30);
   	add(c);
   	add(f);
   	add(k);
   	
   	//colocar Textfield.
   	incel=new JTextField();
   	infar=new JTextField();
   	inkel=new JTextField();
   	incel.setBounds(90,75,150,30);
   	infar.setBounds(90,115,150,30);
   	inkel.setBounds(90,155,150,30);
   	add(incel);
   	add(infar);
   	add(inkel);
   	 calcular.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
       calculo();
        }});
   	limpiar.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
       limpia();
        }});
   	
    }
    
    public void calculo(){
    	ce=Double.parseDouble(incel.getText());
    	fa=Double.parseDouble(infar.getText());
    	ke=Double.parseDouble(inkel.getText());
    	
    	if(ce!=0&&fa==0&&ke==0){
    		fa=(1.8*ce)+32;
    		
    		infar.setText(""+Double.toString(fa));
    		
    		ke=ce+273.15;
    		String kel=Double.toString(ke);
    		inkel.setText("" +kel);
    		}
    		if(ce==0&&fa!=0&&ke==0){
    		ce=(fa-32)/1.8;
    		
    		incel.setText(""+Double.toString(ce));
    		
    		ke=ce+273.15;
    		String kel=Double.toString(ke);
    		inkel.setText("" +kel);
    		}
    	    if(ce==0&&fa==0&&ke!=0){
    		
    		ce=ke-273.15;
    		incel.setText(""+Double.toString(ce));
    		
    		fa=(1.8*ce)+32;
    		
    		infar.setText("" +Double.toString(fa));
    		}

    	
    	}
    	
	public void limpia(){
		inkel.setText("0");
		infar.setText("0");
		incel.setText("0");
		}
}
