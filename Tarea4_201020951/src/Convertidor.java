
 



import javax.swing.*;
import java.awt.event.*;


public class Convertidor extends JFrame implements ActionListener {

   private JLabel labegradof,labegradoc,labegrados,labegradok;
   private JTextField txtgradof,txtgradoc,txtgrados,txtgradok;
   private JButton calcular,limpiar, salir;
   private JComboBox gradosfc;
   private DefaultComboBoxModel dcm;
   
   public Convertidor(){
       
       super("CONVERTIDOR TEMPERATURAS");
       this.setSize(400, 300);
       this.setLocationRelativeTo(null);
       this.setResizable(false);
       this.setLayout(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.objetos();
       this.setVisible(true);
       
       
   }
   
   public void objetos(){
       
      labegrados= new JLabel("Grados");
      labegradof= new JLabel("Grados F");
      labegradoc= new JLabel("Grados C");
      labegradok= new JLabel("Grados K");
      
      txtgrados= new JTextField();
      txtgradof= new JTextField();
      txtgradoc= new JTextField();
      txtgradok= new JTextField();
      
      calcular = new JButton("CALCULAR");
      limpiar = new JButton("LIMPIAR");
      salir = new JButton("SALIR");
  
         
      dcm = new DefaultComboBoxModel(new String[]{"F","C","K"});
      gradosfc= new JComboBox();
      gradosfc.setModel(dcm);
      
      labegrados.setBounds(10, 10, 100, 50);
      this.add(labegrados);
      
      txtgrados.setBounds(100, 25, 100, 25);
      this.add(txtgrados);
      
      gradosfc.setBounds(225, 25, 100, 25);
      this.add(gradosfc);
      
      labegradof.setBounds(10, 70, 100, 50);
      this.add(labegradof);
      
      txtgradof.setBounds(100, 80, 100, 25);
      this.add(txtgradof);
      
      labegradoc.setBounds(10, 130, 100, 50);
      this.add(labegradoc);
      
      txtgradoc.setBounds(100, 140, 100, 25);
      this.add(txtgradoc);
      
      labegradok.setBounds(210, 70, 100, 50);
      this.add(labegradok);
      
      txtgradok.setBounds(270, 80, 100, 25);
      this.add(txtgradok);
      
      calcular.setBounds(10, 200, 100, 25);
      this.add(calcular);
      
      limpiar.setBounds(120, 200, 100, 25);
      this.add(limpiar);
      
      salir.setBounds(230, 200, 100, 25);
      this.add(salir);
      
      calcular.addActionListener(this);
      limpiar.addActionListener(this);
      salir.addActionListener(this);
      
      
      
   }
   
  

    
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == salir  ){
          System.exit(0);
           
       }else if( e.getSource() == limpiar){
         txtgrados.setText(null);
         txtgradof.setText(null);
         txtgradoc.setText(null);
         txtgradok.setText(null);
           
       }
       try{
           float d = Float.parseFloat(txtgrados.getText());
           

           //short d= Short.parseShort(txtgrados.getText());
           if(e.getSource()== calcular && dcm.getSelectedItem().equals("F")){
               
           }
           if(e.getSource() == calcular && dcm.getSelectedItem().equals("F")){
               txtgradof.setText(String.valueOf(d));
               txtgradoc.setText(String.valueOf((d-32)*5/9));
               txtgradok.setText(String.valueOf(((d-32)*5/9)+273));
               
           }else if(e.getSource() == calcular && dcm.getSelectedItem().equals("C")){
             txtgradoc.setText(String.valueOf(d));
             txtgradof.setText(String.valueOf((d*9/5)+32));
             txtgradok.setText(String.valueOf(d+273));
               
           }else if(e.getSource() == calcular && dcm.getSelectedItem().equals("K")){
             txtgradoc.setText(String.valueOf(d-273));
             txtgradof.setText(String.valueOf(((1.8)*(d-273))+32));
             txtgradok.setText(String.valueOf(d)); 
               
               
               
           }
       }catch(NumberFormatException nfe){
           if(txtgrados.getText().equals("") || txtgradof.getText().equals("") || txtgradoc.getText().equals("")){
            return;   
               
               
           }else{
               JOptionPane.showMessageDialog(null, "SOLO SE ACEPTAN NUMEROS");
           }
           
           
       }
    }
    
      public static void main(String[] args) {
        Convertidor c=new Convertidor();
    }
    
}
