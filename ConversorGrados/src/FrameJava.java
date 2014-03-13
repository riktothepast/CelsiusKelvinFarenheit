//ipc1 b 200212461 tarea 4

import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class FrameJava extends JFrame {
        JButton Boton1;
        JButton Boton2;
        JTextArea campo1=null;
        JTextArea campo2=null;
        JTextArea campo3=null;
       
        JLabel etiqueta1;
        JLabel etiqueta2;
        JLabel etiqueta3;
   
    
    public FrameJava(){
                 
        Boton1= new JButton("Convertir");
        Boton2 = new JButton("Limpiar");
        etiqueta1= new JLabel("C°");
        etiqueta2= new JLabel("K°");
        etiqueta3= new JLabel("F°");
        campo1= new JTextArea(1,5);
        campo2= new JTextArea(1,5);
        campo3= new JTextArea(1,5);
        JPanel panel = new JPanel();
        panel.add(Boton1);
        panel.add(Boton2);
        panel.add(etiqueta1);
        panel.add(campo1);
        panel.add(etiqueta2);
        panel.add(campo2);
        panel.add(etiqueta3);
        panel.add(campo3);
        add(panel);
        
       
       
        AccionDeBoton accion = new AccionDeBoton();
        Boton1.addActionListener(accion);
        Boton2.addActionListener(accion);
       
        
    }

    public class AccionDeBoton implements ActionListener{
    DecimalFormat formato = new DecimalFormat(); 
    double celcios=0;
    double kelvin=0;
    double far=0;
    double decimal = 1.00;
    public void actionPerformed(ActionEvent event){
        
            if(event.getSource()==Boton1){
                try{
                if(campo1.getText()!=null&&campo2.getText().equals("")&&campo3.getText().equals("")){
                    celcios=Double.parseDouble(campo1.getText());
                    
                    kelvin=celcios +273.15;
                    
                    far = (9*celcios/5) + 32;
                    campo2.setText(formato.format(kelvin));
                    campo3.setText(formato.format(far));
                    
                }else if(campo2.getText()!=null&&campo1.getText().equals("")&&campo3.getText().equals("")){
                  
                  kelvin=Double.parseDouble(campo2.getText());
                  celcios=kelvin-273.15;
                  far=(9*(kelvin-273.15)/5)+32;
                  campo1.setText(formato.format(celcios));
                  campo3.setText(formato.format(far));
                  
                }else if(campo3.getText()!=null&&campo1.getText().equals("")&&campo2.getText().equals("")){
                far=  Double.parseDouble(campo3.getText()); 
                celcios=(5*(far-32)/9);
                kelvin=(5*(far-32)/9)+273.15;
                campo1.setText(formato.format(celcios));
                campo2.setText(formato.format(kelvin));   
                }
                else{
                 JOptionPane.showMessageDialog(null,"No se puede llenar mas de una opcion");
                 campo1.setText("");
                 campo2.setText("");
                 campo3.setText("");
                    
                }
                }catch(NumberFormatException e){
                    
                 JOptionPane.showMessageDialog(null,"No se ha llenado una Opcion");
                 campo1.setText("");
                 campo2.setText("");
                 campo3.setText("");
                    
                }
                
               
            }else{
                 campo1.setText("");
                 campo2.setText("");
                 campo3.setText("");
                 
            }
            
                
            
        
        
        
    }
    
}
}

   
