package dispersao.calculos;

public class CalculosVarianciaDesvioPadrao {

	// Vari�ncia + desvio padr�o
	
	// F�rmula 1 - E(u - x)� / n
	// F�rmula 2 - (E(x�) / n) - u�
	
	// x => N�meros
	// u => M�dia
	// n => Quantidade de n�meros
	
	private float retornarMedia(int[] numeros) {
		// Calcular a m�dia
		float somaTotal = 0;
		for (int i = 0; i < numeros.length; i++) {
			somaTotal += numeros[i];
		}
		return somaTotal / numeros.length;
	}
	
	public void calcularVariancia(int[] numeros) {
		// Calcular a m�dia
		float media = retornarMedia(numeros);
		float somaNumeros = 0.0f;
		for (int i = 0; i < numeros.length; i++) {
			somaNumeros += Math.pow(media - numeros[i], 2);
		}
		float resultado = somaNumeros / numeros.length;
		
		System.out.println("A vari�ncia dos dados �: " + resultado);
		
	}
	
	
}
