
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    
    public static void main(String[] args) {
        try {
            
            ServerSocket serversocket = new ServerSocket(1346);
            
            System.out.println("Aguardando requisição....");
            
            Socket socket = serversocket.accept();
            
            System.out.println("Requisição Aceita...");
            
            PrintStream ps = new PrintStream(socket.getOutputStream());
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Insira os dados no servidor...");
            
            ps.print(br.readLine());
            socket.close();
        }catch (IOException e){
            System.out.println("Dados não encontrados para soquete" + e);
        }
    }
    
}
