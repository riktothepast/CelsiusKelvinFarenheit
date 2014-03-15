import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Tarea4_201213061 extends JFrame{
    JTextArea txt_celcius, txt_farenheit, txt_kelvin;
    JLabel lbl1,lbl2,lbl3,titulo;
    JPanel panel;
    JButton calcular, limpiar;
    double variable;
     public static void main(String args[]){
         new Tarea4_201213061();
     }
 
  public Tarea4_201213061(){
  //adding a new jframe
  super("Convertidor de Temperaturas");
  this.setSize(300, 250);
  this.setResizable(false);
  this.setLocationRelativeTo(this);
  this.setVisible(true);
  this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);  
  
  panel = new JPanel();
  panel.setSize(300,250);
  panel.setLayout(null);
  this.add(panel);  
  
  lbl1=new JLabel();
  lbl1.setText("Grados Celcius: ");
  lbl1.setLocation(20, 20);
  lbl1.setSize(100, 10);
  panel.add(lbl1);
  
  txt_celcius=new JTextArea();
  txt_celcius.setSize(100, 20);
  txt_celcius.setBounds(150,15,100,20);
  panel.add(txt_celcius);
  
  lbl2=new JLabel();
  lbl2.setText("Grados Farenheit: ");
  lbl2.setLocation(20, 70);
  lbl2.setSize(125, 10);
  panel.add(lbl2);
  
  txt_farenheit=new JTextArea();
  txt_farenheit.setSize(100, 20);
  txt_farenheit.setBounds(150,65,100,20);
  panel.add(txt_farenheit);
  
  lbl3=new JLabel();
  lbl3.setText("Grados Kelvin: ");
  lbl3.setLocation(20, 120);
  lbl3.setSize(100, 10);
  panel.add(lbl3);
  
  txt_kelvin=new JTextArea();
  txt_kelvin.setSize(100, 20);
  txt_kelvin.setBounds(150,115,100,20);
  panel.add(txt_kelvin);
  
  calcular=new JButton();
  calcular.setText("Calcular");
  calcular.setSize(100, 40);
  calcular.setBounds(20,160,100,40);
  calcular.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
        if(txt_celcius.getText().equals("")&& txt_farenheit.getText().equals("")&&txt_kelvin.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe ingresar un número", "Error", JOptionPane.PLAIN_MESSAGE);
        } 
        else if(!"".equals(txt_celcius.getText())&&!"".equals(txt_farenheit.getText())){
            JOptionPane.showMessageDialog(null,"Debe ingresar solo una casilla", "Error", JOptionPane.PLAIN_MESSAGE);
            calcular.setEnabled(false);
        }
        else if(!"".equals(txt_celcius.getText())&&!"".equals(txt_kelvin.getText())){
            JOptionPane.showMessageDialog(null,"Debe ingresar solo una casilla", "Error", JOptionPane.PLAIN_MESSAGE);
            calcular.setEnabled(false);
        } 
        else if(!"".equals(txt_kelvin.getText())&&!"".equals(txt_farenheit.getText())){
            JOptionPane.showMessageDialog(null,"Debe ingresar solo una casilla", "Error", JOptionPane.PLAIN_MESSAGE);
            calcular.setEnabled(false);
        }
        else if(!"".equals(txt_celcius.getText())&&!"".equals(txt_farenheit.getText())&&!"".equals(txt_kelvin.getText())){
            JOptionPane.showMessageDialog(null,"Debe ingresar solo una casilla", "Error", JOptionPane.PLAIN_MESSAGE);
            calcular.setEnabled(false);
        }
        else{
        if(!"".equals(txt_celcius.getText()) ){
            variable=Double.parseDouble(txt_celcius.getText());
            txt_farenheit.setText(String.format("%.2f", (variable*1.8)+32));
            txt_kelvin.setText(String.format("%.2f", variable+273.15));             
        }
        else{
            if(!"".equals(txt_farenheit.getText()) ){
                variable=Double.parseDouble(txt_farenheit.getText());
                txt_celcius.setText(String.format("%.2f",(variable-32)/1.8));
                txt_kelvin.setText(String.format("%.2f", ((variable-32)/1.8)+273.15));
            }
            else{
                if(!"".equals(txt_kelvin.getText()) ){
                    variable=Double.parseDouble(txt_kelvin.getText());
                    txt_celcius.setText(String.format("%.2f", variable-273.15));
                    txt_farenheit.setText(String.format("%.2f", (variable-273.15)*1.8)+32);                    
                } 
            }
        }
        calcular.setEnabled(false);
    }}});
  panel.add(calcular);
  
  limpiar=new JButton();
  limpiar.setText("Limpiar");
  limpiar.setSize(100, 40);
  limpiar.setBounds(150,160,100,40);
  limpiar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e){
        txt_celcius.setText("");
        txt_farenheit.setText("");
        txt_kelvin.setText("");
        variable=0;
        calcular.setEnabled(true);
    }});
  panel.add(limpiar);
  }
}