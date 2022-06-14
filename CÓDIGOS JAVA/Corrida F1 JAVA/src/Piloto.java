
import java.util.logging.Level;
import java.util.logging.Logger;

public class Piloto extends Thread{
    private String nome;
    
    public Piloto (String nome){
        this.nome=nome;
    }
    @Override
     public void run(){
         System.out.println(nome + " LARGADA");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Piloto.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println("Primeira volta: "+ nome);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Piloto.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println(nome + " -> TERMINO A CORRIDA");
     }
}
