package funcionarioAjusteSalario;

import java.util.Scanner;

public class FuncionariosReajuste {

	public static void main(String[] args) {
		System.out.println("==Reajuste de salário conforme demanda==");
		Scanner scan = new Scanner(System.in);
		
		int TAM = 2;
		String[] nome = new String[TAM];
		double[] salario = new double[TAM];
		double reajuste;
		
		for(int i = 0; i < TAM; i++) {
			System.out.println("Nome do "+(i+1)+"º Funcionário:");
			nome[i] = scan.next();
			System.out.println("Salario do "+(i+1)+"º Funcionário:");
			salario[i] = scan.nextDouble();
		}
		System.out.println("==Novo Salário==");
		System.out.println("Digite o valor do reajuste dos funcionários:");
		reajuste = scan.nextDouble();
		
		System.out.println("==atualização de salários==");
		for(int i = 0; i < TAM; i++) {
			System.out.println("Nome: " +nome[i]+ "Salario: " + (salario[i] += (reajuste * salario[i] /100)));
				
		}
		scan.close();
	}		
}

