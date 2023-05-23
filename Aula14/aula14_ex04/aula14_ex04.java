package aula14_ex04;

import java.util.Scanner;

public class aula14_ex04 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int aux = 0;
		int vetor[] = new int[10];
		int vetorB[] = new int[11];
		
		for (i = 0; i < 10; i++) {
			System.out.printf("Informe o valor da posição %d do vetor: ", (i+1));
			vetor[i] = sc.nextInt();
		}
		
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 9; j++) {
				if(vetor[j] > vetor[j+1]) {
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		
		for (i = 0; i < 10; i++) {
			System.out.printf("%d, ", vetor[i]);
		}
		
		System.out.println("\n Insira um novo valor para o vetor: ");
		int novoValor = sc.nextInt();
		
		for (i = 0; i < 11; i++) {
			if (i < 10) {
				vetorB[i] = vetor[i];	
			} else {
				vetorB[i] = novoValor;
			}
		}
		
		for (i = 0; i < 11; i++) {
			for (j = 0; j < 10; j++) {
				if(vetorB[j] > vetorB[j+1]) {
					aux = vetorB[j];
					vetorB[j] = vetorB[j+1];
					vetorB[j+1] = aux;
				}
			}
		}
		
		for (i = 0; i < 11; i++) {
			System.out.printf("%d, ", vetorB[i]);
		}
		
		
	}
	
}
