
package Exercício4;


public class Calculadora extends Principal4{
    
    int resultado1;
    int resultado2;
    double resultado3;
    
    public void Soma1(int x, int y){
        resultado1 = x + y;
    }
    
    public void Soma1(int x, int y, int z){
        resultado2 = x + y + z;
    }
    
    public void Soma1(double a, double b){
        
        resultado3 = a + b;
    }
    
    public void exibirResultado1(){
        System.out.println("Resultado: "+ resultado1);
        
    }
    
    public void exibirResultado2(){   
        System.out.println("Resultado: "+ resultado2);
        
    }
    
    public void exibirResultado3(){
        
        System.out.println("Resultado: "+ resultado3);
    }
    
    
}
