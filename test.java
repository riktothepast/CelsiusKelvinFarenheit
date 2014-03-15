import java.awt.*; import javax.swing.*; import java.awt.event.*;

public class test extends JFrame{
  JTextArea textarea1;
  JTextArea textarea2; JButton boton1, boton2;
  JLabel texto1;
  JLabel texto2; /* c*/
  JLabel texto3; /* K*/
  JLabel texto4; /* F*/







  public test(){

 setLayout( new FlowLayout());
 texto1 = new JLabel("Ingresar temperatura a convertir seguido por 'C', 'F' o 'K' para indicar si es Celsius, Farenheiht o Kelvin, respectivamente.");
 add (texto1);

 textarea1 = new JTextArea(1, 10);
 add (textarea1);
 textarea2 = new JTextArea(1, 10);
 add (textarea2);

 JButton boton1 = new JButton("Convertir");
 add(boton1);

 texto2 = new JLabel("");
 add(texto2);

 texto3 = new JLabel("");
 add(texto3);

 texto4 = new JLabel("");
 add(texto4);
event e = new event(); boton1.addActionListener(e);
event ef = new event(); boton1.addActionListener(ef);
 }








public class event implements ActionListener{

    public void actionPerformed(ActionEvent e) {      
	String text = textarea1.getText(); String text2 = "Por favor ingresar numero valido:";
        String temperatura= textarea1.getText(); 
        long temp; long kel; long cel; long far;


     try { temp = Long.parseLong(temperatura);
         System.out.println(temp); texto2.setText(text); texto3.setText(text); texto4.setText(text);
          }
      catch (NumberFormatException nfe) {
         System.out.println("Por favor ingresar numero valido:" + nfe.getMessage());
	texto2.setText(text2);
         }


	


            }
        




}















public static void main (String args[]){

  test frame = new test(); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(1000,250); frame.setVisible(true); 




  }



}
