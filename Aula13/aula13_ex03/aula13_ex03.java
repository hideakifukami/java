package aula13_ex03;

import java.util.Scanner;

public class aula13_ex03 {
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		float[][] matriz = new float[5][4];
		int i = 0;
		int j = 0;
		int aprovados = 0;
		int reprovados = 0;

		
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Informe o elemento [" + i + "][" + j + "] da matriz: " );
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] >= 7) {
					aprovados++;
				} else {
					reprovados++;
				}
			}
		}
				
		System.out.println("\n A matriz resultante é: \n");
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4; j++) {
				if (j == 3) {
					System.out.printf("[%.2f]\n", matriz[i][j]);
				} else {
					System.out.printf("[%.2f]", matriz[i][j]);	
				}		
			}
		}
		
		System.out.printf("\n A quantidade de aprovados é %d e a de reprovados é %d.", aprovados, reprovados);
	}
}
