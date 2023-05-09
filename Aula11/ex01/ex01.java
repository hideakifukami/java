package ex01;

import java.util.Scanner;

public class ex01 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int notas[] = new int[10];
		
		for (int i = 0; i < 10; i++) {		
			System.out.println("Informe o número na posição " + (i + 1));
			notas[i] = sc.nextInt();
		}
		
		for (int i = 7; i < 10; i++) {
			System.out.println(notas[i]);
		}	
	}
}
