//ipc1 b 200212461 tarea 4
import javax.swing.*;
/**
 *
 * @author Amochi
 */
public class Principal  {
    public static void main(String[] args){
        FrameJava frame= new FrameJava();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("conversor"); 
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
}
