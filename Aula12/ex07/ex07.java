package ex07;

import java.util.Scanner;

public class ex07 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numeros[] = new int[20];
		
		
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Informe o valor na posição " + (i + 1));
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("O vetor em ordem inversa é: ");
		for (int i = 19; i >= 0 ; i--) {
			System.out.println(numeros[i]);
		}
	}
}
