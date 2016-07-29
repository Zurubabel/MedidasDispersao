package dispersao.calculos;

import java.util.List;

public class CalculosAlcance {
	public void exibirAlcanceArray(int[] numeros) {
		int maiorNumero = 0 ;
		int menorNumero = numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < menorNumero) {
				// É o menor número
				menorNumero = numeros[i];
			}
			
			if (numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
			}
		}
		System.out.println("--- exibirAlcanceArray ---");
		System.out.println("Maior numero : " + maiorNumero + " | menor numero : " + menorNumero);
		System.out.println("Alcance - " + (maiorNumero - menorNumero));
	}
	
	// Alcance - Aula 2
	public void exibirAlcanceLista(List<Integer> numeros) {
		// Cálculo - Maior número - menor
		
		int maiorNumero = 0 ;
		int menorNumero = numeros.get(0);
		
		for (Integer numero : numeros) {
			if (numero < menorNumero) {
				// É o menor número
				menorNumero = numero;
			}
			
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		System.out.println("--- exibirAlcanceLista ---");
		System.out.println("Maior numero : " + maiorNumero + " | menor numero : " + menorNumero);
		System.out.println("Alcance - " + (maiorNumero - menorNumero));
	}
	
}
