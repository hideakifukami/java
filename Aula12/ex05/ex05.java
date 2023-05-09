package ex05;

import java.util.Scanner;

public class ex05 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int Q[] = new int[10];
		int menorElemento = 0;
		int posicao = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o valor da posição " + (i+1) + " do vetor: ");
			Q[i] = sc.nextInt();
			while (Q[i] < 0) {
				System.out.println("Informe um valor maior que 0! ");
				System.out.println("Informe o valor da posição " + (i+1) + " do vetor: ");
				Q[i] = sc.nextInt();
			}					
		}
		
		for (int i = 1; i < 10; i++) {
			if (Q[i - 1] < Q[i]) {
				menorElemento = Q[i - 1];
				posicao = i - 1;
			} 
		}
		
		System.out.println("Menor Elemento: " + menorElemento);
		System.out.println("Posição no vetor: " + (posicao + 1));
						
	}
}
