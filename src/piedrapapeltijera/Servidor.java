package piedrapapeltijera;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {
    
    private static final int PUERTO = 1600;
    
    void crearConexion(){
      
        try {
            ServerSocket socket = new ServerSocket(PUERTO);
            
            Socket conexionOK = socket.accept();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
}
