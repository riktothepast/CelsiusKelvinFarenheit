
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Grados extends JFrame {
    JButton limpiar,Calcular;
    JTextArea Celsius,Farenheit,Kelvin;
    JLabel C, F, K,signo,Resultado,Resultado2,Resultado3; 
    JPanel panel;
    String recibirC,recibirF,recibirK,conver,conver2;
    float convertir;
    float Fa,Cel,Kel;
    public Grados(){
        setLayout(null);
        setSize(800,600);
        setResizable(true);
        setVisible(true);
        
        limpiar=new JButton("Limpiar");
        limpiar.setBackground(Color.BLACK);
        limpiar.setForeground(Color.WHITE);
        limpiar.setBounds(30,30,100,30);
        add(limpiar);
        
        Calcular=new JButton("Calcular");
        Calcular.setBackground(Color.BLACK);
        Calcular.setForeground(Color.WHITE);
        Calcular.setBounds(150,30,100,30);
        add(Calcular);
        
        C=new JLabel("Celsius:");
        C.setBounds(30,90,100,30);
        add(C);
        F=new JLabel("Farenheit:");
        F.setBounds(30,150,100,30);
        add(F);
        
        K=new JLabel("Kelvin:");
        K.setBounds(30,210,100,30);
        add(K);
        Celsius=new JTextArea();
        Celsius.setBackground(Color.PINK);
        Celsius.setBounds(100,90,100,30);
        add(Celsius);
        
        signo=new JLabel("Celsius = ");
        signo.setBounds(255,90,100,30);
        add(signo);
        
        Resultado=new JLabel("0");
        Resultado.setBounds(350,90,200,30);
        add(Resultado);
        
        Farenheit=new JTextArea();
        Farenheit.setBackground(Color.PINK);
        Farenheit.setBounds(100,150,100,30);
        add(Farenheit);
        
        signo=new JLabel("Farenheit = ");
        signo.setBounds(255,150,100,30);
        add(signo);
        
        Resultado2=new JLabel("0");
        Resultado2.setBounds(350,150,200,30);
        add(Resultado2);
        
        Kelvin=new JTextArea();
        Kelvin.setBackground(Color.PINK);
        Kelvin.setBounds(100,210,100,30);
        add(Kelvin);
        
        signo=new JLabel("Kelvin = ");
        signo.setBounds(255,210,100,30);
        add(signo);
        
        Resultado3=new JLabel("0");
        Resultado3.setBounds(350,210,200,30);
        add(Resultado3);
        
         panel=new JPanel();
        panel.setBackground(Color.YELLOW);
        panel.setSize(600, 400);
        panel.setVisible(true);
        add(panel);
        
     ActionListener a=new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
    Object a=e.getSource();
   
    if(a==Calcular){
    recibirC=Celsius.getText();
    recibirF=Farenheit.getText();
    recibirK=Kelvin.getText();

    if(!recibirC.isEmpty()&&recibirF.isEmpty()&&recibirK.isEmpty()){
            Resultado.setText(recibirC);
            convertir=Integer.valueOf(recibirC);
            Fa= (9*convertir/5)+32;
            conver=String.valueOf(Fa);
            Resultado2.setText(conver);
            Kel=convertir+273;
            conver2=String.valueOf(Kel);
            Resultado3.setText(conver2);
     }
    else if(recibirC.isEmpty()&&!recibirF.isEmpty()&&recibirK.isEmpty()){
            Resultado2.setText(recibirF);
            convertir=Integer.valueOf(recibirF);
            Cel=5*(convertir-32)/9;
            conver=String.valueOf(Cel);
            Resultado.setText(conver);
            Kel=Cel+273;
            conver2=String.valueOf(Kel);
            Resultado3.setText(conver2);
    }
    else if(recibirC.isEmpty()&&recibirF.isEmpty()&&!recibirK.isEmpty()){
            Resultado3.setText(recibirK);
            convertir=Integer.valueOf(recibirK);
            Cel=convertir-273;
            conver=String.valueOf(Cel);
            Resultado.setText(conver);
            Fa=(9*Cel/5)+32;
            conver2=String.valueOf(Fa);
            Resultado2.setText(conver2);
    }
    else{
        JOptionPane.showMessageDialog(null,"Ingresar el dato en una  sola casiilla");
    }
    }
     if(a==limpiar){
         Celsius.setText("");
         Farenheit.setText("");
         Kelvin.setText("");
         Resultado.setText("0");
         Resultado2.setText("0");
         Resultado3.setText("0");
     }
    
    }
     };Calcular.addActionListener(a);
       limpiar.addActionListener(a);
 }


}
