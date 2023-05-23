package aula14_ex01;

import java.util.Scanner;

public class aula14_ex01 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Informe o tamanho dos vetores: ");
		int tamanhoVetor = sc.nextInt();
		int i = 0;
		
		
		int vetorA[] = new int[tamanhoVetor];
		int vetorB[] = new int[tamanhoVetor];
		int vetorSoma[] = new int[tamanhoVetor];
		int soma = 0;
		
		System.out.println("\n VETOR A: ");
		for (i = 0; i < tamanhoVetor; i++) {
			System.out.printf("Informe o valor da posição %d no vetor A: ", (i+1));
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("\n VETOR B: ");
		for (i = 0; i < tamanhoVetor; i++) {
			System.out.printf("Informe o valor da posição %d no vetor B: ", (i+1));
			vetorB[i] = sc.nextInt();
		}
		
		for (i = 0; i < tamanhoVetor; i++) {
			vetorSoma[i] = vetorA[i] + vetorB[i];
			soma += vetorSoma[i];
		}
		
		System.out.println("\n A soma dos elementos no vetorSoma é: " + soma);
					
	}
}