package dispersao.calculos;

public class CalculosVarianciaDesvioPadrao {

	// Vari�ncia + desvio padr�o
	
	// F�rmula 1 - E(u - x)� / n
	// F�rmula 2 - (E(x�) / n) - u�
	// Coeficiente de Varia��o - Desvio padr�o / m�dia (x 100 para apresentar a porcentagem) 
	// Teste Z - (valor - u) / DP
	
	// x => N�meros
	// u => M�dia
	// n => Quantidade de n�meros
	
	private boolean amostragem;
	private int[] numeros;
	private float media;
	private double variancia;
	private double desvioPadrao;
	private double coeficienteVariacao;
	
	public CalculosVarianciaDesvioPadrao(int[] numeros, boolean amostragem) {
		this.numeros = numeros;
		this.amostragem = amostragem;
		calculoGeral();
	}
	
	private void calculoGeral() {
		// Calcular todas as fun��es e gravar nas vari�veis
		calcularMedia();
		calcularVariancia();
		calcularDesvioPadrao();
		calcularCoeficienteVariacao();
	}
	
	public void calcularTesteZ(int numeroTeste) {
		// Teste Z - (valor - u) / DP
		if (numeroTeste <= 0 || numeroTeste > numeros.length) {
			System.out.println("N�mero inv�lido. Digite do 1 ao " + numeros.length);
			return;
		}
		int numeroSelecionado = numeros[numeroTeste - 1];
		double resultadoTesteZ = (numeroSelecionado - this.media) / this.desvioPadrao;
		
		System.out.println("O teste Z do n�mero " + numeroSelecionado +" � " + resultadoTesteZ);
		
		
	}
	
	public void retornarSumario() {
		if (isAmostragem()) {
			System.out.println("Calculando por amostragem");
		} else {
			System.out.println("Calculando por total");
		}
		
		System.out.println("M�dia : " + this.media);
		System.out.println("Vari�ncia : " + this.variancia);
		System.out.println("Desvio Padr�o : " + this.desvioPadrao);
		System.out.println("Coeficiente de Varia��o : " + this.coeficienteVariacao);
	}
	
	public void instanciarNovosNumeros(int[] numeros) {
		this.numeros = numeros;
		calculoGeral();
	}
	
	private void calcularMedia() {
		// Calcular a m�dia
		float somaTotal = 0;
		for (int i = 0; i < numeros.length; i++) {
			somaTotal += numeros[i];
		}
		this.media = somaTotal / numeros.length;
	}
	 
	public void calcularVariancia() {
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
		
		this.variancia = resultado;
	}
	
	public double calcularVariancia2() {
		// F�rmula 2 - (E(x�) / n) - u�
		double somaNumeros = 0.0f;
		for (int i = 0; i < numeros.length; i++) {
			somaNumeros += Math.pow(numeros[i], 2);
		}
		double resultado = (somaNumeros / numeros.length) - Math.pow(media, 2);		
		return resultado;
	}
	
	public void calcularDesvioPadrao() {
		this.desvioPadrao = Math.sqrt(this.variancia);
	}
	
	public void calcularCoeficienteVariacao() {
		// Coeficiente de Varia��o - Desvio padr�o / m�dia (x 100 para apresentar a porcentagem)
		this.coeficienteVariacao = this.desvioPadrao / this.media;
	}
	
	
	public void calcularPorAmostragem() {
		if (!isAmostragem()) {
			this.amostragem = true;
			calculoGeral();
		}
	}
	
	public void calcularPorTotal() {
		if (isAmostragem()) {
			this.amostragem = false;
			calculoGeral();
		}
	}
	
	public double getCoeficienteVariacao() {
		return this.coeficienteVariacao;
	}
	
	public boolean isAmostragem() {
		return amostragem;
	}

	public float getMedia() {
		return media;
	}

	public double getVariancia() {
		return variancia;
	}

	public double getDesvioPadrao() {
		return desvioPadrao;
	}

	
}
