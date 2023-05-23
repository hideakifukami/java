package aula14_ex03;

import java.util.Scanner;

public class aula14_ex03 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int aux = 0;
		int vetor[] = new int[10];
		
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
	}
}
