package dev.dojo.treino.sistema.funcionarios;

    public class Main {
        public static void main(String[]args){

            Funcionario func1 = new Funcionario();
            Funcionario func2 = new Funcionario();

            func1.nome = "Jess";
            func1.idade = 31;
            func1.salarios = new double[] {1600,255.55,3156};

            func2.nome = "Anderson";
            func2.idade = 30;
            func2.salarios = new double[] {7500,255.53,4156};

            func1.imprime();
            func2.imprime();
        }

}
