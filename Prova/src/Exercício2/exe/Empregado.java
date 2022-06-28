package Exercício2.exe;

import javax.swing.JOptionPane;


public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;
    private double salariofinal;
    

    public double getSalariofinal() {
        return salariofinal;
    }

    public void setSalariofinal(double salariofinal) {
        this.salariofinal = salariofinal;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public Empregado() {
        this.nome = JOptionPane.showInputDialog("Nome: ");
        this.sobrenome = JOptionPane.showInputDialog("Sobrenome: ");
        salario = Integer.parseInt(JOptionPane.showInputDialog("Salário inicial: "));
        salariofinal = salario + ((salario*10)/100);
    }
    
    public void EmpregadoTeste(){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Salário inicial: " + salario + "Reais");
        System.out.println("Salário final com 10%: " + salariofinal + "Reais" );
        System.out.println("Salário Anual: "+ salario * 12);
    }
}
