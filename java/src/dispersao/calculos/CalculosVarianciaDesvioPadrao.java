package dispersao.calculos;

public class CalculosVarianciaDesvioPadrao {

	// Vari�ncia + desvio padr�o
	
	// F�rmula 1 - E(u - x)� / n
	// F�rmula 2 - (E(x�) / n) - u�
	
	// x => N�meros
	// u => M�dia
	// n => Quantidade de n�meros
	
	private boolean amostragem;
	private int[] numeros;
	
	public CalculosVarianciaDesvioPadrao(int[] numeros, boolean amostragem) {
		this.numeros = numeros;
		this.amostragem = amostragem;
		if (amostragem == true) {
			// Amostragem
			System.out.println("Amostragem:");
		} else {
			// Total
			System.out.println("Total:");
		}
	}
	
	private float retornarMedia() {
		// Calcular a m�dia
		float somaTotal = 0;
		for (int i = 0; i < numeros.length; i++) {
			somaTotal += numeros[i];
		}
		System.out.println("M�dia " + (somaTotal / numeros.length));
		return somaTotal / numeros.length;
	}
	 
	public double calcularVariancia() {
		// Calcular a m�dia
		float media = retornarMedia();
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
		float media = retornarMedia();
		double somaNumeros = 0.0f;
		for (int i = 0; i < numeros.length; i++) {
			somaNumeros += Math.pow(numeros[i], 2);
		}
		double resultado = (somaNumeros / numeros.length) - Math.pow(media, 2);
		
		System.out.println("(C�lculo Vari�ncia 2) A vari�ncia dos dados �: " + resultado);
		
		return resultado;
	}
	
	public void calcularDesvioPadrao() {
		double variancia = this.calcularVariancia();
		
		double desvioPadrao = Math.sqrt(variancia);
		
		System.out.println("O desvio padr�o � " + desvioPadrao);
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
