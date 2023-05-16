package aula13_ex2;

import java.util.Scanner;

public class aula13_ex2 {
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] matriz = new int[3][4];
		int i = 0;
		int j = 0;
		int quantidadeImpares = 0;
		String impares = "";
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Informe o elemento [" + i + "][" + j + "] da matriz: " );
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] % 2 != 0) {
					quantidadeImpares++;
					impares += matriz[i][j] + ", ";
				}
			}
		}
				
		System.out.println("\n A matriz resultante é: \n");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				if (j == 3) {
					System.out.printf("[%d]\n", matriz[i][j]);
				} else {
					System.out.printf("[%d]", matriz[i][j]);	
				}		
			}
		}
		
		System.out.println("\n A quantidade de números ímpares é: " + quantidadeImpares);
		System.out.println("São eles: " + impares);

		
			
	}
}
