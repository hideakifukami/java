package ex02;

import java.util.Scanner;

public class ex02 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean presente = false;
		String nomes[] = new String[3];
		
		System.out.println("Escreva três nomes a serem inseridos no vetor: ");		
		for (int i = 0; i < 3; i++) {
			nomes[i] = sc.next();
		}
		
		System.out.println("Escreva um nome a ser verificado na lista: ");
		String nome = sc.next();
		
		for (int i = 0; i < 3; i++) {
			if (nome.equalsIgnoreCase(nomes[i])) {
				presente = true;
			}
		}
		
		if (presente) {
			System.out.println("Nome encontrado! ");
		} else {
			System.out.println("Nome não encontrado! ");
		}
		
		
		
	}
}
