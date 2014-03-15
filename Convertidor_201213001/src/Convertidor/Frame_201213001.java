package Convertidor;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;

public class Frame_201213001 extends JFrame{
	
	
	JPanel panel;
	JLabel titulo,kelvin,cel,far;
	JButton convertir,limpiar;
	JTextField kelvin1,cel1,far1;
	
	public Frame_201213001(){
		
		//ventana
		this.setTitle("Convertidor");
		this.setSize(350,260);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);//hace que la ventana conseve su tamano
		this.setLocationRelativeTo(null);// para centrar la ventana
		this.setLayout(null);
		
		//panel
		panel = new JPanel();
		panel.setBounds(0, 0, 350, 260);
		panel.setLayout(null);
		add(panel);
		panel.setBackground(Color.ORANGE);
		
				
		//titulo del programa
		titulo = new JLabel("CONVERTIDOR DE GRADOS", JLabel.CENTER);
		titulo.setBounds(0, 10, 350, 30);
		titulo.setFont(new Font("Arial Black", Font.BOLD,18));
		panel.add(titulo);
		
		// espacio para los kelvin
		kelvin = new JLabel("KELVIN:");
		kelvin.setBounds(75, 60,100, 25);
		kelvin.setFont(new Font("Verdana",Font.BOLD,12));
		panel.add(kelvin);
		
		kelvin1 = new JTextField("");
		kelvin1.setBounds(175, 60, 100, 25);
		kelvin1.setFont(new Font("Verdana",Font.BOLD,12));
		panel.add(kelvin1);
		
		//espacio para celsius
		cel = new JLabel("CELSIUS:");
		cel.setBounds(75, 95,100, 25);
		cel.setFont(new Font("Verdana",Font.BOLD,12));
		panel.add(cel);
		
		cel1 = new JTextField("");
		cel1.setBounds(175, 95, 100, 25);
		cel1.setFont(new Font("Verdana",Font.BOLD,12));
		panel.add(cel1);
		
		//espacion para farenheit
		far = new JLabel("FARENHEIT:");
		far.setBounds(75, 130,100, 25);
		far.setFont(new Font("Verdana",Font.BOLD,12));
		far.setVisible(true);
		panel.add(far);
		
		far1 = new JTextField("");
		far1.setBounds(175, 130, 100, 25);
		far1.setFont(new Font("Verdana",Font.BOLD,12));
		far1.setVisible(true);
		panel.add(far1);
		
		
		//boton de convertir
		convertir = new JButton("CONVERTIR");
		convertir.setBounds(50,185,120,25);
		convertir.setFont(new Font("Comic Sans MS", Font.BOLD,12));
		convertir.setVisible(true);
		panel.add(convertir);
		
		ActionListener conver = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				
				
				if(kelvin1.getText() != null && cel1.getText().equals("") && far1.getText().equals("")){
					if(Integer.parseInt(kelvin1.getText()) < 0 ){
					JOptionPane.showConfirmDialog(null, "No es permitido usar temperaturas menores que cero!!", "ERROR!!", JOptionPane.CLOSED_OPTION);
					}else{
					convertidorp(Integer.parseInt(kelvin1.getText()), 0, 0);
					}
				}else if(kelvin1.getText().equals("") && cel1.getText() != null && far1.getText().equals("")){
					convertidorp(0, Integer.parseInt(cel1.getText()), 0);					
				}else if(kelvin1.getText().equals("") && cel1.getText().equals("") && far1.getText() != null){
					convertidorp(0,0,Integer.parseInt(far1.getText()));
				}
				
				
				}
			
		};
		
		convertir.addActionListener(conver);
		
		
		//boton limpiar
		limpiar = new JButton("LIMPIAR");
		limpiar.setBounds(180,185,120,25);
		limpiar.setFont(new Font("Comic Sans MS", Font.BOLD,12));
		limpiar.setVisible(true);
		panel.add(limpiar);
		
		ActionListener listener = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				limpiarC();
			}
		};
		
		limpiar.addActionListener(listener);
		
	}
	
	
	public void limpiarC(){
		kelvin1.setText(null);
		cel1.setText(null);
		far1.setText(null);
	}
	
	
	
	
	
	public int kelv;
	public int cels;
	public int fare;
	DecimalFormat decimales = new DecimalFormat("0.00");
	
	public void convertidorp(int kelv, int cel, int fare ){
		this.kelv = kelv;
		this.cels = cel;
		this.fare = fare;
		double C, F , K;
		
		if(this.kelv >=0 && this.cels ==0 && this.fare==0){
			 
			C = (this.kelv - 273.15);
			cel1.setText(decimales.format(C));
			
			F = (C*1.8)+32;
			far1.setText(decimales.format(F));
		}else if(this.kelv == 0 &&  this.cels >=-10000000 && this.fare ==0 ){
			F = (this.cels*1.8)+32;
			far1.setText(decimales.format(F));
			
			K = 273.15 +(F-32)/1.8;
			kelvin1.setText(decimales.format(K));
		}else if(this.kelv == 0 && this.cels ==0 && this.fare >= -1000000000 ){
			C = (this.fare - 32)/1.8;
			cel1.setText(decimales.format(C));
			
			K = 273.15 + this.cels;
			kelvin1.setText(decimales.format(K));
			
		}
		
		
		
	}

}
