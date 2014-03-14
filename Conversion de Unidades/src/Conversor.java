import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * Created by erickchali on 3/9/14.
 */
public class Conversor extends JFrame implements ActionListener, ChangeListener {
    JTextField far,cen,cel;
    JButton b1,b2,clean;
    JLabel op,titulo,lbl1,lbl2,lbl3;
    JRadioButton rb1,rb2,rb3;
    ButtonGroup opciones;
    JPanel p1,p2,p3,p4;
    public Conversor(){
        titulo = new JLabel();
        titulo.setText("Conversor de unidades de temperatura");
        op = new JLabel();
        op.setText("Elija una de las opciones para realizar la conversion");
        rb1 = new JRadioButton("Farehnheit");
        rb1.addChangeListener(this);
        rb2 = new JRadioButton("Kelvin");
        rb2.addChangeListener(this);
        rb3 = new JRadioButton("Celsius");
        rb3.addChangeListener(this);
        opciones = new ButtonGroup();
        opciones.add(rb1);
        opciones.add(rb2);
        opciones.add(rb3);
        p1 = new JPanel();
        p1.setSize(500,50);
        p1.setLayout(new FlowLayout());
        p1.add(rb1);
        p1.add(rb2);
        p1.add(rb3);

        far = new JTextField();
        far.setPreferredSize(new Dimension(100,10));
        cen = new JTextField();
        far.setPreferredSize(new Dimension(100, 10));
        cel = new JTextField();
        far.setPreferredSize(new Dimension(100, 10));
        lbl1 = new JLabel();
        lbl1.setText("Farhenheit");
        lbl1.setSize(100,50);
        lbl2 = new JLabel();
        lbl2.setText("Kelvin");
        lbl2.setSize(100,50);
        lbl3 = new JLabel();
        lbl3.setText("Celsius");
        lbl3.setSize(100,50);
        p2 = new JPanel();
        p2.setSize(500,200);
        p2.setLayout(new GridLayout(2,3,0,0));
        p2.add(lbl1);
        p2.add(lbl2);
        p2.add(lbl3);
        p2.add(far);
        p2.add(cen);
        p2.add(cel);

        b1 = new JButton("Convertir Unidades");
        b1.addActionListener(this);
        b2 = new JButton("Salir");
        b2.addActionListener(this);
        b1.setEnabled(false);
        clean = new JButton("Limpiar Todos los campos");
        clean.addActionListener(this);
        clean.setPreferredSize(new Dimension(400,50));

        far.setEditable(false);
        cen.setEditable(false);
        cel.setEditable(false);
        //Añadiendo componentes
        add(titulo);
        add(op);
        add(p1);
        add(p2);
        add(b1);
        add(b2);
        add(clean);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DecimalFormat formato = new DecimalFormat("#.##");
        double f,k,ce;
        if(e.getSource()==b1){
            if(rb1.isSelected()){
                if(far.getText().toString().equals("")){
                    JOptionPane.showMessageDialog(this,"Debe Ingresar algo en casilla de Farhenheit");
                }else{
                    try{
                        f=0;
                        ce=0;
                        k=0;
                        f = Double.parseDouble(far.getText().toString());
                        ce= f - (32/1.8);
                        k = ce + 273;
                        cen.setText("" + formato.format(k));
                        cel.setText("" + formato.format(ce));
                        b1.setEnabled(false);
                    }catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(this,"La casilla debe contener numeros");
                    }
                }
            }else if(rb2.isSelected()){
                if(cen.getText().toString().equals("")){
                    JOptionPane.showMessageDialog(this,"Debe Ingresar algo en casilla de Kelvin");
                }else{
                    try{
                        f=0;
                        ce=0;
                        k=0;
                        k = Double.parseDouble(cen.getText().toString());
                        ce = k - 273;
                        f= (1.8*ce)+32;
                        far.setText("" + formato.format(f));
                        cel.setText("" + formato.format(ce));
                        b1.setEnabled(false);
                    }catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(this,"La casilla debe contener numeros");
                    }
                }
            }else if(rb3.isSelected()){
                if(cel.getText().toString().equals("")){
                    JOptionPane.showMessageDialog(this,"Debe Ingresar algo en casilla de Kelvin");
                }else{
                    try{
                        f=0;
                        ce=0;
                        k=0;
                        ce = Double.parseDouble(cel.getText().toString());
                        k=ce+273;
                        f= (1.8*ce)+32;

                        cen.setText("" + formato.format(k));
                        far.setText("" + formato.format(f));
                        b1.setEnabled(false);
                    }catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(this,"La casilla debe contener numeros");
                    }
                }
            }
        }else if(e.getSource()==b2){
            System.exit(0);
        }else if(e.getSource()==clean){
            opciones.clearSelection();
            far.setText("");
            far.setEnabled(false);
            cel.setText("");
            cel.setEnabled(false);
            cen.setText("");
            cen.setEnabled(false);
            b1.setEnabled(false);
            f=0;
            ce=0;
            k=0;
            String titulo = "Campos limpiados";
            JOptionPane.showMessageDialog(this,"Los campos han sido limpiados,",titulo,JOptionPane.PLAIN_MESSAGE);
        }

    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        if(rb1.isSelected()){
            far.setText("");
            cel.setText("");
            cen.setText("");
            b1.setEnabled(true);
            far.setEditable(true);
            cen.setEditable(true);
            cel.setEditable(true);
            cen.setEditable(false);
            cel.setEditable(false);
        }else if(rb2.isSelected()){
            far.setText("");
            cel.setText("");
            cen.setText("");
            b1.setEnabled(true);
            far.setEditable(true);
            cen.setEditable(true);
            cel.setEditable(true);
            far.setEditable(false);
            cel.setEditable(false);
        }else if(rb3.isSelected()){
            far.setText("");
            cel.setText("");
            cen.setText("");
            b1.setEnabled(true);
            far.setEditable(true);
            cen.setEditable(true);
            cel.setEditable(true);
            far.setEditable(false);
            cen.setEditable(false);
        }
    }
}
