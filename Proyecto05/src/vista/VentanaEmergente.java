package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaEmergente {
    
    public static void mostrarMensajeVentana(String message){
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, message);
        
    }
    
}
