

public class Principal {

    
    public static void main(String[] args) {
        Soma soma = new Soma();
        System.out.println("Retorno da soma, Sobrecarga: "+soma.calcular(2));
        soma.exibeResultado();
        soma.calcular(2, 3);
        soma.exibeResultado();
        
        
    }
    
}
