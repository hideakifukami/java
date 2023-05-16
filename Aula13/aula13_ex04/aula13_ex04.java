package aula13_ex04;

import java.util.Scanner;

public class aula13_ex04 {
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int i = 0;
		int j = 0;
		int soma = 0;

		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Informe o elemento [" + i + "][" + j + "] da matriz: " );
				matriz[i][j] = sc.nextInt();
				soma += matriz[i][j]; 
			}
		}
				
		System.out.println("\n A matriz resultante é: \n");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (j == 2) {
					System.out.printf("[%d]\n", matriz[i][j]);
				} else {
					System.out.printf("[%d]", matriz[i][j]);	
				}		
			}
		}
		
		System.out.printf("\n A soma dos números da matriz é: %d", soma);
	}
}
