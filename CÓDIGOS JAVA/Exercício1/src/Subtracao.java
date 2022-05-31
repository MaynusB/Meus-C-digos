public class Subtracao extends Calculadora {
    double resultado;
    
    public void calcular (double valor1, double valor2){
        resultado = valor1-valor2;
    }
    
    public void exibeResultado(){
        System.out.println("Subtração: "+ resultado);
    }
    
}
