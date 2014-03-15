/* Facultad de Ingenieria USAC
* Introduccion a la programacion de computadores 1
* Seccion B
*
* @autor: Cristian Miguel Marroquin Sequen 201314754
* @version: 1.0 Primer Semestre USAC 2014
* 
* Interfaz Grafica
* 
* Conversor de grados celsius a kelvin y farenheit o viseversa
*/

// importar los metodos para la ejecucion de la interfaz grafica
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Conversor extends JFrame//clase principal del conversor
{
public Conversor ()//metodos para el conversor
		{
		// Devclarando Variables
        JButton calcular;//boton para calcular
        JButton limpiar;//boton para limpiar
		JLabel celsius; //etiqueta para nombrar a celsius
		JLabel kelvin; //etiqueta para nombrar a kelvin
		JLabel farenheit;//etiqueta para nombrar farenheit
		final JLabel gradoscelsius;//etiqueta de grados centigrados
		final JLabel gradoskelvin;//etiqueta de grados kelvin
		final JLabel gradosfarenheit;//etiqueta de grados farenheit
		final JTextArea ingresarCelsius; //cuadro de texto para ingreso de datos de celsius
		final JTextArea ingresarKelvin; //cuadro de texto para ingreso de datos de kelvin
		final JTextArea ingresarFarenheit;//cuadro de texto para ingreso de datos de farenheit
		final JTextArea vacio = new JTextArea();//cuadro de texto vacio para comparar en las condiciones
		JTextArea espacio;//cuadro de texto para asignar un espacio entre los botones y el cuadro de texto
		
		// Iniciando Variables
		JPanel fondo =new JPanel();
			fondo.setBackground(new Color(170,230,200));
			fondo.setSize(235,180);
		
		
        calcular = new JButton("Calcular");//Iniciando boton para calcular
        calcular.setBounds(20, 110, 90, 20);//Asignado posicion del boton calcular y dando tamaño
		calcular.setMnemonic(KeyEvent.VK_ENTER);//Combinacion de teclas para la ejecucion de el boton calcular
				
        limpiar = new JButton("Limpiar");//Iniciando boton para limpiar los cudros de texto
        limpiar.setBounds(120, 110, 90, 20);//Asignando posicion del boton limpiar y dando tamaño
			
        celsius = new JLabel("Celsius: "); //Iniciando etiqueta de nombre celsius
		celsius.setBounds (20,20,60,20);//Asignando posicion al cuadro celsius y dando tamaño
			
        gradoscelsius = new JLabel(" °C"); //Iniciando etiqueta grados celsius
		gradoscelsius.setBounds (190,20,20,20);//Asignando posicion al cuadro gradoscelsius y dando tamaño
		
        kelvin = new JLabel("Kelvin"); //Iniciando etiqueta de nombre kelvin
		kelvin.setBounds (20,50,60,20);//Asinando posicion al cuadro kelvin y dando tamaño
			
        gradoskelvin = new JLabel(" °K"); //Iniciando etiqueta grados kelvin
		gradoskelvin.setBounds (190,50,20,20);//Asignando posicion al cuadro celsius y dando tamaño
		
        farenheit = new JLabel("Farenheit"); //Iniciando etiqueta de farenheit
		farenheit.setBounds (20,80,60,20);//Asignndo posicion al cuadro farenheit y dando tamaño
			
        gradosfarenheit = new JLabel(" °F"); //Iniciando etiqueta de grados farenheit
		gradosfarenheit.setBounds (190,80,20,20);//Asignando posicion al cuadro gradosfarenheit y dando tamaño
		
        ingresarCelsius = new JTextArea();//Inicando cuadro de texto de ingreso de datos para celusius
		ingresarCelsius.setBounds (80,20,110,20);//Asignando posicion al cuadro de ingreso de datos celsius y dando tamaño
		ingresarCelsius.setBackground(new Color(255,255,236)); //dando color al cuadro de texto
		ingresarCelsius.addKeyListener(new KeyAdapter() {//validar el cuadro de texto de ingreso de datos de celsius
			@Override
			public void keyTyped(KeyEvent e) {//iniciar el metodo de validacion
				char c = e.getKeyChar();//variable tipo caracter para validarlo donde se guardara la el caracter que se ingreso
					if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
					&& (c != '.') && (c != '-') && (c != 'E')) { //asignacion de caracteres permitidos en el cuadro de texto
				e.consume();//consumir todos los caracteres restantes
				}
					if (c == '.' && ingresarCelsius.getText().contains("E")) {//condicion para no colocar un punto despues de la exponencial
				e.consume();//consumir el punto si ya existe una exponencial
				}
					if (c == '.' && ingresarCelsius.getText().contains(".")) {//condicion para no colocar dos veces un punto
				e.consume();//consumir el punto si ya se ingreso un punto
				}
					if (c == 'E' && ingresarCelsius.getText().contains("E")) {//condicion para no colocar dos veces la exponencial
				e.consume();//consumir la exponencial si ya se ingreso una
				}
					if (c == 'E' && ingresarCelsius.getText().equals(vacio.getText())) {//condicion para no colocar una exponencial si no se ha ingresado ningun dato
				e.consume();//consumir la exponencial si el cuadro esta vacio
				}
					if (c == '-' && ingresarCelsius.getText().contains("-")) {//condicion para no colocar dos veces un signo negativo
				e.consume(); //consumir el negativo si ya se ingreso una vez
				}
			}
		});
		
        ingresarKelvin = new JTextArea();// Iniciando cuadro de texto para ingreso de datos para kelvin
		ingresarKelvin.setBounds (80,50,110,20);//Asignando posicion al cuadro de ingreso de datos para kelvin y dando tamaño
		ingresarKelvin.setBackground(new Color(255,255,236)); //dando color al cuadro de texto
		ingresarKelvin.addKeyListener(new KeyAdapter() {//variable tipo caracter para validarlo donde se guardara la el caracter que se ingreso
			@Override
			public void keyTyped(KeyEvent e) {//iniciar el metodo de validacion
				char c = e.getKeyChar();//variable tipo caracter para validarlo donde se guardara la el caracter que se ingreso
					if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
					&& (c != '.') && (c != '-') && (c != 'E')) {//asignacion de caracteres permitidos en el cuadro de texto
				e.consume();//consumir todos los caracteres restantes
				}
					if (c == '.' && ingresarKelvin.getText().contains("E")) {//condicion para no colocar un punto despues de la exponencial
				e.consume();//consumir el punto si ya existe una exponencial
				}
					if (c == '.' && ingresarKelvin.getText().contains(".")) {//condicion para no colocar dos veces un punto
				e.consume();//consumir el punto si ya se ingreso un punto
				}
					if (c == 'E' && ingresarKelvin.getText().contains("E")) {//condicion para no colocar dos veces la exponencial
				e.consume();//consumir la exponencial si ya se ingreso una
				}
					if (c == 'E' && ingresarKelvin.getText().equals(vacio.getText())) {//condicion para no colocar una exponencial si no se ha ingresado ningun dato
				e.consume();//consumir la exponencial si el cuadro esta vacio
				}
					if (c == '-' && ingresarKelvin.getText().contains("-")) {//condicion para no colocar dos veces un signo negativo
				e.consume(); //consumir el negativo si ya se ingreso una vez
				}
			}
		});
		
        ingresarFarenheit = new JTextArea();//Iniciando cuadro de texto para ingreso de datos para farenheit
		ingresarFarenheit.setBounds (80,80,110,20);//Asignando posicion al cuadro de ingreso de datos para farenheit y dando tamaño
		ingresarFarenheit.setBackground(new Color(255,255,236)); //dando color al cuadro de texto
		ingresarFarenheit.addKeyListener(new KeyAdapter() {//variable tipo caracter para validarlo donde se guardara la el caracter que se ingreso
			@Override
			public void keyTyped(KeyEvent e) {//iniciar el metodo de validacion
				char c = e.getKeyChar();//variable tipo caracter para validarlo donde se guardara la el caracter que se ingreso
					if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
					&& (c != '.') && (c != '-') && (c != 'E')) {//asignacion de caracteres permitidos en el cuadro de texto
				e.consume();//consumir todos los caracteres restantes
				}
					if (c == '.' && ingresarFarenheit.getText().contains("E")) {//condicion para no colocar un punto despues de la exponencial
				e.consume();//consumir el punto si ya existe una exponencial
				}
					if (c == '.' && ingresarFarenheit.getText().contains(".")) {//condicion para no colocar dos veces un punto
				e.consume();//consumir el punto si ya se ingreso un punto
				}
				if (c == 'E' && ingresarFarenheit.getText().contains("E")) {//condicion para no colocar dos veces la exponencial
				e.consume();//consumir la exponencial si ya se ingreso una
				}	
				if (c == 'E' && ingresarFarenheit.getText().equals(vacio.getText())) {//condicion para no colocar una exponencial si no se ha ingresado ningun dato
				e.consume();//consumir la exponencial si el cuadro esta vacio
				}
					if (c == '-' && ingresarFarenheit.getText().contains("-")) {//condicion para no colocar dos veces un signo negativo
				e.consume();//consumir el negativo si ya se ingreso una vez
				}
			}
		});
		
        espacio = new JTextArea();//cuadro de texto vacio para asignar un espacio en blanco entre los cuadros de texto de datos y los botones
		espacio.setEditable(false);//bloqueando la edicion al cuadro de texto vacio para que no interfiera con los demas cuadros de texto ni la interfaz grafica
		espacio.setBounds (100,110,100,5);//dando posicion y tamaño al cuadro de texto vacio
		espacio.setVisible (false);//no hacer visible este cuadro
		

		// Añadiendo botones y cuadros de Texto
			add(calcular);//añadir boton para calcular a la interfaz
            add(limpiar);//añadir boton para limpiar a la interfaz
			add(celsius);//añadir etiqueta de nombre celsius a la interfaz
            add(kelvin);//añadir etiqueta de nombre kelvin a la interfaz
			add(farenheit);//añadir etiqueta de nombre farenheit a la interfaz
            add(ingresarCelsius);//añadir cuadro de ingreso de datos para celsius a la interfaz
			add(ingresarKelvin);//añadir cuadro de ingreso de datos para kelvin a la interfaz
            add(ingresarFarenheit);//añadir cuadro de ingreso de datos para farenheit a la interfaz
			add(gradoscelsius);//añadit etiqueta de grados celsius
			add(gradoskelvin);// añadir etiqueta de grados kelvin
			add(gradosfarenheit);// añadir etiqueta de grados farenheit
            add(espacio);//añadir el cuadro de texto para un espacio a la interfaz
			add(fondo);
			
		//añadir accion al boton limpiar 
		limpiar.addActionListener(new ActionListener() {//añadiendo una accion al boton limpiar 
            public void actionPerformed(ActionEvent e)//inicando metodo para la accion del boton limpiar
            {
                ingresarCelsius.setText(null);//cambiar el contendo del cuadro de texto para ingreso de datos de celsius a vacio
                ingresarKelvin.setText(null);//cambiar el contendo del cuadro de texto para ingreso de datos de kelvin a vacio
                ingresarFarenheit.setText(null);//cambiar el contendo del cuadro de texto para ingreso de datos de farenheit a vacio
            }
        });
		//añadir accion al boton calcular
		calcular.addActionListener(new ActionListener() {//añadir una lista de acciones al boton calcular
            public void actionPerformed(ActionEvent e)//iniciar el metodo para asignar la lista de acciones
            {
			if (!ingresarCelsius.getText().equals(vacio.getText())){//verificar si el cuadro de texto de celsius no este vacio
				String cadenacelsius=ingresarCelsius.getText();//extraer los datos del cuadro de texto de celsius
				float celsius = Float.parseFloat(cadenacelsius);//extraer el valor de la variable con los datos ingresados
				float kelvin = celsius+273; //Grados Celsius a grados Kelvin
				float farenheit = ((9*celsius)/5)+32; //Grados Centígrados a grados Fahrenheit
				String cadenacelsius2=String.valueOf(celsius);//integrar los valores de celsius en una nueva cadena de valores
				String cadenakelvin=String.valueOf(kelvin);//integrar los valores de kelvin en una cadena de valores
				String cadenafarenheit=String.valueOf(farenheit);//integrar los valores de farenheit en una cadena de valores
				ingresarCelsius.setText(cadenacelsius2);//imprimir los valores de celsius 
				ingresarKelvin.setText(cadenakelvin);//impirimir los valores de kelvin
				ingresarFarenheit.setText(cadenafarenheit);//imprimir los valores de farenheit
				}
			else if (!ingresarKelvin.getText().equals(vacio.getText())){//verificar que el cuadro de texto de kelvin contenga valores
				 String cadenakelvin=ingresarKelvin.getText();//extraer los datos del cuadro de texto de kelvin
				float kelvin = Float.parseFloat(cadenakelvin);//extraer el valor de la variable con los datos ingresados
				float celsius = kelvin - 273; //Grados Kelvin a grados Celsius
				float farenheit = ((9*celsius)/5)+32; //Grados Centígrados a grados Fahrenheit
				String cadenakelvin2=String.valueOf(kelvin);//integrar los valores de kelvin en una nueva cadaena de valores
				String cadenacelsius=String.valueOf(celsius);//integrar los valores de celsius en una cadena de valores
				String cadenafarenheit=String.valueOf(farenheit);//integrar los valores de farenheit en una cadena de valores
				ingresarKelvin.setText(cadenakelvin2);//imprimir en el cuadro de texto kelvin la nueva cadena de valores
				ingresarCelsius.setText(cadenacelsius);//imprimir en el cuadro de texto de celsius la cadena de valores
				ingresarFarenheit.setText(cadenafarenheit);//imprimir en el cuadro de texto de farenheit la cadena de valores
				}
			else if (!ingresarFarenheit.getText().equals(vacio.getText())){//verificar que el cuadro de texto de farenheit contenga valores
				 String cadenafarenheit=ingresarFarenheit.getText();//extrear los datos del cuadro de texto de farenheit
				float farenheit = Float.parseFloat(cadenafarenheit);//extraer el valor de la cadena de valores con los datos ingresados
				float celsius = ((5*(farenheit-32)/9)); // Grados Fahrenheit a grados Celsius
				float kelvin = celsius + 273; //Grados Celsius a grados Kelvin 
				String cadenacelsius=String.valueOf(celsius);//integrar los valores de celsius en una cadena de valores
				String cadenakelvin=String.valueOf(kelvin);//integrar los valores de kelvin en una cadena de valores
				String cadenafarenheit2=String.valueOf(farenheit);//integrar los valores de farenheit en una nueva cadena de valores
				ingresarCelsius.setText(cadenacelsius);//imprimir en el cuadro de texto de celsius la cadena de valores de celsius
				ingresarKelvin.setText(cadenakelvin);//imprimir en el cuadro de texto de kelvin la cadena de valores de kelvin
				ingresarFarenheit.setText(cadenafarenheit2);//imprimir en el cuadro de texto de farenheit la nueva cadena de valores de farenheit
				}
            }
        });
		
			
	}
	
	public static void main(String[] args) {//metodo principal
	
	
	
	Conversor skin;//crear una nueva ventana 
	skin = new Conversor ();//iniciar la nueva ventana
	skin.setTitle ("Conversor");//titulo de la ventana
	skin.setSize (235,180);//tamaño de la ventana
	skin.setResizable (true);//bloquear el tamaño de la ventana
    skin.setLocationRelativeTo(null);//colocar la ventana en el centro de la pantalla
	skin.setVisible (true);//hacer visible la ventana
	skin.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);//terminar los procesos de la ventana al cerrarla
	}
}