public class Temperatura{
	
	public static void main(String[] args) {
		Convertidor Termometro = new Convertidor();
		Termometro.setVisible(true);
		Termometro.setTitle("Convertidor de Temperatura");
		Termometro.setSize(600,400);
		Termometro.setResizable(false); 
		Termometro.setLocationRelativeTo(null);//Lo coloca en el centro de la pantalla
		Termometro.setDefaultCloseOperation(Termometro.EXIT_ON_CLOSE);//Poder cerrar la aplicacion
	}
	
}