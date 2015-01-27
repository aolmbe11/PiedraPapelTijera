package piedrapapeltijera;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    
    private static final String DIRECCION_SERVIDOR = "localhost";
    private static final int PUERTO = 1600;
    
    void enviarDatos(){
        try {
            Socket socket = new Socket(DIRECCION_SERVIDOR, PUERTO);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
