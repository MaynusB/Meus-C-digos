
public class Soma extends Calculadora{
    double resultado;
       
    
    @Override
    public void calcular (double valor1, double valor2){
        resultado = valor1+valor2;
    }

    public double calcular(double valor1){
        resultado=valor1+100;
        return resultado;
    }
    
    @Override
    public void exibeResultado(){
        System.out.println("Soma: "+resultado);
    }
    
}
