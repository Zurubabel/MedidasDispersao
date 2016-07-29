package dispersao.calculos;

public class CalculosVarianciaDesvioPadrao {

	// Variância + desvio padrão
	
	// Fórmula 1 - E(u - x)² / n
	// Fórmula 2 - (E(x²) / n) - u²
	
	// x => Números
	// u => Média
	// n => Quantidade de números
	
	private float retornarMedia(int[] numeros) {
		// Calcular a média
		float somaTotal = 0;
		for (int i = 0; i < numeros.length; i++) {
			somaTotal += numeros[i];
		}
		return somaTotal / numeros.length;
	}
	
	public void calcularVariancia(int[] numeros) {
		// Calcular a média
		float media = retornarMedia(numeros);
		float somaNumeros = 0.0f;
		for (int i = 0; i < numeros.length; i++) {
			somaNumeros += Math.pow(media - numeros[i], 2);
		}
		float resultado = somaNumeros / numeros.length;
		
		System.out.println("A variância dos dados é: " + resultado);
		
	}
	
	
}
