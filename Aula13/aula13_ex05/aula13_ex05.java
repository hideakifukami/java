package aula13_ex05;

public class aula13_ex05 {
	public static void main(String[] args) {
		int i, j = 0;
		int[][] matriz = {
				{12,55,6,34,77},
				{98,66,43,32,7},
				{21,45,53,20,11}
				};
		
		int referencia = matriz[0][0];
		int referenciaX = 0;
		int referenciaY = 0;
		
		
		
		System.out.println("Considerando a seguinte matriz: \n");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 5; j++) {
				if (matriz[i][j] < referencia) {
					referencia = matriz[i][j];
					referenciaX = i;
					referenciaY = j;
				}
				if (j == 4) {
					System.out.printf("[%d]\n", matriz[i][j]);
				} else {
					System.out.printf("[%d]", matriz[i][j]);	
				}		
			}
		}
		
		System.out.printf("\n O menor valor da matriz está no índice [%d][%d], e seu conteúdo é %d.", referenciaX, referenciaY, referencia);
		
		
	}
}
