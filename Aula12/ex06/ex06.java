package ex06;

import java.util.Scanner;

public class ex06 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double A[] = new double[10];
		double M[] = new double[10];
		double X = 0;
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe valor do vetor na posi��o " + (i+1));
			A[i] = sc.nextDouble();
		}
		
		System.out.println("Informe um n�mero que multiplicar� os valores de vetor: ");
		X = sc.nextDouble();
		
		for (int i = 0; i < 10; i++) {
			M[i] = A[i] * X;
			System.out.println("Resultado da posi��o " + i + M[i] );
		}
		
	}
}
