import javax.swing.*;
import java.awt.*;

/**
 * Created by erickchali on 3/9/14.
 */
public class Launch {

    public static void main(String[] args){
        Conversor c = new Conversor();
        c.setSize(400, 275);
        c.setLayout(new FlowLayout());
        c.setVisible(true);
        c.setTitle("Conversor de Unidades");
        c.setLocationRelativeTo(null);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
