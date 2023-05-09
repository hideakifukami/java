package ex01;

public class ex01 {
	public static void main(String[] args) {
		int numeros[] = {5,1,4,2,7,8,3,6};
		int numero;
		
		for (int i = 7; i > 3; i--) {
			numero = numeros[i];
			numeros[i] = numeros[7 - i + 1];
		}
		
		numeros[3] = numeros[1];
		numeros[numeros[3]] = numeros[numeros[2]];
		
		for (int i = 0; i < 8; i++) {
			System.out.println(numeros[i]);
		}
		
	}
}
