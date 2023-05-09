package ex04;

import java.util.Scanner;

public class ex04 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int Q[] = new int[10];
		int maiorElemento = 0;
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
			if (Q[i] > Q[i-1]) {
				maiorElemento = Q[i];
				posicao = i;
			}
		}
		
		System.out.println("Maior Elemento: " + maiorElemento);
		System.out.println("Posição no vetor: " + (posicao + 1));
						
	}
}

