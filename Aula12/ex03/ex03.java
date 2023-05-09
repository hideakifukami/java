package ex03;

import java.util.Scanner;

public class ex03 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Informe a quantidade de alunos da turma: ");
		int quantidadeDeAlunos = sc.nextInt();
		int notas[] = new int[quantidadeDeAlunos];
		int contagem = 0;
		double soma = 0;
		double media = 0;
		
		
		for (int i = 0; i < quantidadeDeAlunos; i++) {
			System.out.println("Informe a nota do aluno " + (i+1));
			notas[i] = sc.nextInt();
			soma += notas[i];
		}
		
		media = soma / quantidadeDeAlunos;
		
		for (int i = 0; i < quantidadeDeAlunos; i++) {
			if (notas[i] >= media) {
				contagem++;
			}
		}
		
		System.out.println("A média da turma foi: " + media);
		System.out.println("A quantidade de alunos com nota maior que a média é: " + contagem);
		
	}
}
