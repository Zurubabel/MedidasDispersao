package dispersao.calculos;

public class CalculosVarianciaDesvioPadrao {

	// Variância + desvio padrão
	
	// Fórmula 1 - E(u - x)² / n
	// Fórmula 2 - (E(x²) / n) - u²
	// Coeficiente de Variação - Desvio padrão / média (x 100 para apresentar a porcentagem) 
	
	// x => Números
	// u => Média
	// n => Quantidade de números
	
	private boolean amostragem;
	private int[] numeros;
	private float media;
	
	public CalculosVarianciaDesvioPadrao(int[] numeros, boolean amostragem) {
		this.numeros = numeros;
		this.amostragem = amostragem;
		calcularMedia();
		if (amostragem == true) {
			// Amostragem
			System.out.println("Amostragem:");
		} else {
			// Total
			System.out.println("Total:");
		}
	}
	
	private void calcularMedia() {
		// Calcular a média
		float somaTotal = 0;
		for (int i = 0; i < numeros.length; i++) {
			somaTotal += numeros[i];
		}
		System.out.println("Média " + (somaTotal / numeros.length));
		this.media = somaTotal / numeros.length;
	}
	 
	public double calcularVariancia() {
		// Calcular a média
		float somaNumeros = 0.0f;
		for (int i = 0; i < numeros.length; i++) {
			somaNumeros += Math.pow(media - numeros[i], 2);
		}
		
		
		double resultado;
		if (amostragem == true) {
			// Amostragem
			resultado = somaNumeros / (numeros.length - 1);
		} else {
			// Total
			resultado = somaNumeros / numeros.length;
		}
		
		System.out.println("A variância dos dados é: " + resultado);
		return resultado;
	}
	
	public double calcularVariancia2() {
		// Fórmula 2 - (E(x²) / n) - u²
		double somaNumeros = 0.0f;
		for (int i = 0; i < numeros.length; i++) {
			somaNumeros += Math.pow(numeros[i], 2);
		}
		double resultado = (somaNumeros / numeros.length) - Math.pow(media, 2);
		
		System.out.println("(Cálculo Variância 2) A variância dos dados é: " + resultado);
		
		return resultado;
	}
	
	public double calcularDesvioPadrao() {
		double variancia = this.calcularVariancia();
		double desvioPadrao = Math.sqrt(variancia);
		
		System.out.println("O desvio padrão é " + desvioPadrao);
		
		return desvioPadrao;
	}
	
	public void calcularCoeficienteVariacao() {
		// Coeficiente de Variação - Desvio padrão / média (x 100 para apresentar a porcentagem)
		double coeficienteVariacao = this.calcularDesvioPadrao() / this.media;
		System.out.println("O coeficiente de variação é : " + coeficienteVariacao);
	}
	
	
	public void calcularPorAmostragem() {
		System.out.println("Agora calculando por Amostragem:");
		this.amostragem = true;
	}
	
	public void calcularPorTotal() {
		System.out.println("Agora calculando por Total:");
		this.amostragem = false;
	}
	
}
