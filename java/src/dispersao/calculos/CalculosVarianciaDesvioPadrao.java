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
	
	public double calcularVariancia2(int[] numeros) {
		// Fórmula 2 - (E(x²) / n) - u²
		float media = retornarMedia(numeros);
		double somaNumeros = 0.0f;
		for (int i = 0; i < numeros.length; i++) {
			somaNumeros += Math.pow(numeros[i], 2);
		}
		double resultado = (somaNumeros / numeros.length) - Math.pow(media, 2);
		
		System.out.println("(Cálculo Variância 2) A variância dos dados é: " + resultado);
		
		return resultado;
	}
	
	public void calcularDesvioPadrao(int[] numeros) {
		double variancia = this.calcularVariancia2(numeros);
		
		double desvioPadrao = Math.sqrt(variancia);
		
		System.out.println("O desvio padrão é " + desvioPadrao);
	}
	
	public double calcularVarianciaAmostragem(int[] numeros) {
		// Calcular a média
		float media = retornarMedia(numeros);
		float somaNumeros = 0.0f;
		for (int i = 0; i < numeros.length; i++) {
			somaNumeros += Math.pow(media - numeros[i], 2);
		}
		double resultado = somaNumeros / (numeros.length -1);
		
		System.out.println("A variância da amostragem dos dados é: " + resultado);
		
		return resultado;
	}
	
	public void calcularDesvioPadraoAmostragem(int[] numeros) {
		double variancia = this.calcularVarianciaAmostragem(numeros);
		
		double desvioPadrao = Math.sqrt(variancia);
		
		System.out.println("O desvio padrão da amostragem é " + desvioPadrao);
	}
	
}
