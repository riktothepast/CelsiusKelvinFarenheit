import java.awt.event.*;
import javax.swing.*;
public class Tarea4_201212640 extends JFrame{
	JTextArea t1, t2, t3;
	
	public static void main(String arg[]){
	
	Tarea4_201212640 t4=new Tarea4_201212640();
	}
	
	public Tarea4_201212640(){
	super();
	
	JLabel lb1=new JLabel("Grados Kelvin");
	lb1.setBounds(30, 25, 120, 20);
    this.add(lb1);
	t1=new JTextArea();
	t1.setText("0");
    t1.setBounds(160, 25, 100, 20);
	t1.setSize(100, 20);
    this.add(t1);
	
	JLabel lb2=new JLabel("Grados Celsius");
	lb2.setBounds(30, 55, 120, 20);
    this.add(lb2);
	t2=new JTextArea();
	t2.setText("0");
    t2.setBounds(160, 55, 100, 20);
	t2.setSize(100, 20);
    this.add(t2);
	
	JLabel lb3=new JLabel("Grados Farenheit");
	lb3.setBounds(30, 85, 120, 20);
    this.add(lb3);
	t3=new JTextArea();
	t3.setText("0");
    t3.setBounds(160, 85, 100, 20);
	t3.setSize(100, 20);
    this.add(t3);
	
	JButton b1=new JButton("Convertir");
    b1.setBounds(30, 120, 100, 30);
	b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Double k, c, f;
			k=Double.parseDouble(t1.getText());
			c=Double.parseDouble(t2.getText());
			f=Double.parseDouble(t3.getText());
			if(k!=0){
			c=k-273.15;
			f=32+(c*1.8);
			t2.setText(String.valueOf(c));
			t3.setText(String.valueOf(f));
			}else if(c!=0){
			k=c+273.15;
			f=32+(c*1.8);
			t1.setText(String.valueOf(k));
			t3.setText(String.valueOf(f));
			}else if(f!=0){
			c=(f-32)/1.8;
			k=c+273.15;
			t1.setText(String.valueOf(k));
			t2.setText(String.valueOf(c));
			}
        }
    });
	this.add(b1);
	
	JButton b2=new JButton("Limpiar");
    b2.setBounds(150, 120, 100, 30);
	b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
			t2.setText("0");
			t3.setText("0");			
			t1.setText("0");			
        }
    });
	this.add(b2);
	
	this.setSize(300,200);
	this.setLayout(null);
    this.setVisible(true);
    this.setResizable(false);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);	
	}
}