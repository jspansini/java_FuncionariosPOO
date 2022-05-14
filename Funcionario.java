package dev.dojo.treino.sistema.funcionarios;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println("-----------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for(double salario : salarios){
            System.out.println("R$" + salario + " ");
        }

    }
}
