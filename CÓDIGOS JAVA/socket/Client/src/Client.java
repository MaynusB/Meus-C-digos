import java.io.IOException;
import java.net.Socket;

public class Client {

    
    public static void main(String[] args) throws IOException {
        try {
            Socket cliente = new Socket ("localhost", 1346);
            
        }catch (Exception e){
            System.out.println("ERRO "+ e.getMessage());
        }
    }
    
}
