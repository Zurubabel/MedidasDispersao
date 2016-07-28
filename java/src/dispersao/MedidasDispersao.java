package dispersao;

import java.util.ArrayList;
import java.util.List;

public class MedidasDispersao {

	// GITHUB - https://github.com/Zurubabel/MedidasDispersao
	
	public static void main(String[] args) {
		List<Integer> numerosLista = new ArrayList<>();
		
		numerosLista.add(1);
		numerosLista.add(1);
		numerosLista.add(2);
		numerosLista.add(2);
		numerosLista.add(2);
		numerosLista.add(3);
		numerosLista.add(3);
		numerosLista.add(3);
		numerosLista.add(3);
		numerosLista.add(4);
		numerosLista.add(4);
		numerosLista.add(4);
		numerosLista.add(5);
		numerosLista.add(5);
		
		exibirAlcanceLista(numerosLista);
		
		// ----------------------
		
		int[] numerosArray = {20,2,2,2,3,3,3,3,4,4,4,5,5};
		exibirAlcanceArray(numerosArray);
		
		

	}
	
	// Alcance - Aula 3
	public static void exibirAlcanceArray(int[] numeros) {
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
	public static void exibirAlcanceLista(List<Integer> numeros) {
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
