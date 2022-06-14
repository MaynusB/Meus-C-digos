
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    
    
    public static void main(String[] args) {
         new Thread(f1).start();
         new Thread(f2).start(); 
    }
    private static void exibeCorredores(String nomeThread){
        
                      
    }
    
    
     private static Runnable f1 = new Runnable(){
        @Override
        public void run(){
            String nome = "Rubens";
            System.out.println("|LARGADA|");
            System.out.println("Primeira volta: " + nome);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(nome + "TERMINOU A CORRIDA!!!");
                                            
                       
        }        
     };
     
     private static Runnable f2 = new Runnable(){
        @Override
        public void run(){
            String nome = "Rogerio";
            System.out.println("|LARGADA|");
            System.out.println("Primeira volta: " + nome);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(nome + "TERMINOU A CORRIDA!!!");
                                            
                       
        }        
     };
}