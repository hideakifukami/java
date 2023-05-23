package aula14_ex05;

import java.util.Scanner;

public class aula14_ex05 {
	private static Scanner sc = new Scanner(System.in);
	 
	public static void main(String[] args) {
		int vetor[] = new int[20];
		int novoValor = 0;
		int i = 0;
		int j = 0;
		boolean existe = false;
		
		for (i = 0; i < 20; i++) {
			System.out.printf("Informe a posição %d do vetor: ", (i+1));
			vetor[i] = sc.nextInt();
		} 
		
		System.out.println("\nInforme um novo valor: ");
		novoValor = sc.nextInt();
		
		for (i = 0; i < 20; i++) {
			if (vetor[i] == novoValor) {
				
			}
		}
				
	}
}
