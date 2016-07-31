package dispersao;

import dispersao.calculos.CalculosVarianciaDesvioPadrao;

public class MedidasDispersao {

	// GITHUB - https://github.com/Zurubabel/MedidasDispersao
	
	public static void main(String[] args) {
		int[] numerosArray = {1,2,3,4,5,6};
		
		CalculosVarianciaDesvioPadrao vdp = new CalculosVarianciaDesvioPadrao(numerosArray, false);
		vdp.retornarSumario();
		vdp.calcularPorAmostragem();
		System.out.println("\n\n");
		vdp.retornarSumario();
		System.out.println("\n\n");
		vdp.calcularPorTotal();
		vdp.retornarSumario();
		

	}

}
