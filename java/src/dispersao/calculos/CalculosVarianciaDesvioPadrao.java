package dispersao.calculos;

public class CalculosVarianciaDesvioPadrao {

	// Vari�ncia + desvio padr�o
	
	// F�rmula 1 - E(u - x)� / n
	// F�rmula 2 - (E(x�) / n) - u�
	// Coeficiente de Varia��o - Desvio padr�o / m�dia (x 100 para apresentar a porcentagem) 
	
	// x => N�meros
	// u => M�dia
	// n => Quantidade de n�meros
	
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
		// Calcular a m�dia
		float somaTotal = 0;
		for (int i = 0; i < numeros.length; i++) {
			somaTotal += numeros[i];
		}
		System.out.println("M�dia " + (somaTotal / numeros.length));
		this.media = somaTotal / numeros.length;
	}
	 
	public double calcularVariancia() {
		// Calcular a m�dia
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
		
		System.out.println("A vari�ncia dos dados �: " + resultado);
		return resultado;
	}
	
	public double calcularVariancia2() {
		// F�rmula 2 - (E(x�) / n) - u�
		double somaNumeros = 0.0f;
		for (int i = 0; i < numeros.length; i++) {
			somaNumeros += Math.pow(numeros[i], 2);
		}
		double resultado = (somaNumeros / numeros.length) - Math.pow(media, 2);
		
		System.out.println("(C�lculo Vari�ncia 2) A vari�ncia dos dados �: " + resultado);
		
		return resultado;
	}
	
	public double calcularDesvioPadrao() {
		double variancia = this.calcularVariancia();
		double desvioPadrao = Math.sqrt(variancia);
		
		System.out.println("O desvio padr�o � " + desvioPadrao);
		
		return desvioPadrao;
	}
	
	public void calcularCoeficienteVariacao() {
		// Coeficiente de Varia��o - Desvio padr�o / m�dia (x 100 para apresentar a porcentagem)
		double coeficienteVariacao = this.calcularDesvioPadrao() / this.media;
		System.out.println("O coeficiente de varia��o � : " + coeficienteVariacao);
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
