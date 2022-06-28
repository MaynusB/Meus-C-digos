package Calculadora;

public class Soma extends Calculadora{
    int resultado;
    
    public void calcular (int valor1, int valor2){
        resultado = valor1 + valor2;
    }
    
    public void exibirResultado(){
        System.out.println("Soma: " + resultado);
    }
}
