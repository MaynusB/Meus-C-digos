package Exercício5;


public class Quadrado implements FormaGeometric {
    
    private double lado = 5;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double getArea() {
        double area = 0;
        area = (lado*lado);
        return area;
    }
    @Override
    public double getPerimetro() {
        double perimetro = 0;
        perimetro = (lado*4);
        return perimetro;
    }
    @Override
    public String getFiguraName() {
        return "FORMA => QUADRADO";
    }
}
