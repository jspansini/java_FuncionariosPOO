package testes;

import funcionario.Funcionarios;

public class Main {

	public static void main(String[] args) {
		
		Funcionarios f1 = new Funcionarios();
		
		f1.setId(1);
		f1.setCargo("Engenheira de software");
		f1.setNome("Jessica");
		
		
		System.out.println("Funcionaria: " +f1.getNome()+ "\nTem um salário mensal de R$ " + f1.calcularSalario(15,150.30));

	}

}
