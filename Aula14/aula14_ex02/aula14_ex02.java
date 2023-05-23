package aula14_ex02;

import java.util.Scanner;

public class aula14_ex02 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int i = 0;
		int soma = 0;
		int inferiorMedia = 0;
		int vetorTemperatura[] = new int[7];
		
		System.out.println("Informe a temperatura média dos dias da semana: \n");
		
		for (i = 0; i < 7; i++) {
			System.out.printf("Informe a temperatura média do dia %d: ", (i+1));
			vetorTemperatura[i] = sc.nextInt();
		}
		
		int refMaior = vetorTemperatura[0];
		int refMenor = vetorTemperatura[0];
		
		for (i = 0; i < 7; i++) {
			if (refMenor > vetorTemperatura[i]) {
				refMenor = vetorTemperatura[i];
			}
			
			if (refMaior < vetorTemperatura[i]) {
				refMaior = vetorTemperatura[i];	
			}
			
			soma += vetorTemperatura[i];	
		}
		
		double media = soma / 7;
		
		for (i = 0; i < 7; i++) {
			if (vetorTemperatura[i] < media) {
				inferiorMedia++;
			}
		}
		
		System.out.println("\n MENOR TEMPERATURA: " + refMenor);
		
		System.out.println("MAIOR TEMPERATURA: " + refMaior);
		
		System.out.println("TEMPERATURA MEDIA: " + media);
		
		System.out.println("QUANTIDADE INFERIOR A MEDIA: " + inferiorMedia);
	}
}
