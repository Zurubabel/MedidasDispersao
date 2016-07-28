package dispersao;

import java.util.ArrayList;
import java.util.List;

public class MedidasDispersao {

	// GITHUB - https://github.com/Zurubabel/MedidasDispersao
	
	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(1);
		numeros.add(2);
		numeros.add(2);
		numeros.add(2);
		numeros.add(3);
		numeros.add(3);
		numeros.add(3);
		numeros.add(3);
		numeros.add(4);
		numeros.add(4);
		numeros.add(4);
		numeros.add(5);
		numeros.add(5);
		
		exibirAlcance(numeros);

	}
	
	// Alcance - Aula 1
	public static void exibirAlcance(List<Integer> numeros) {
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
		
		System.out.println("Maior numero : " + maiorNumero + " | menor numero : " + menorNumero);
		System.out.println("Alcance - " + (maiorNumero - menorNumero));
	}

}
