package dispersao;

import dispersao.calculos.CalculosVarianciaDesvioPadrao;

public class MedidasDispersao {

	// GITHUB - https://github.com/Zurubabel/MedidasDispersao
	
	public static void main(String[] args) {
		int[] numerosArray = {1,2,3,4,5,6,7,8,9,10};
		
		CalculosVarianciaDesvioPadrao vdp = new CalculosVarianciaDesvioPadrao(numerosArray, false);
		vdp.retornarSumario();
		vdp.calcularTesteZ(3);
		
		System.out.println("\n\n");
		
		int[] numerosArray2 = {10,12,45,66,12,11,5};
		CalculosVarianciaDesvioPadrao vdp2 = new CalculosVarianciaDesvioPadrao(numerosArray2, false);
		vdp2.retornarSumario();
		vdp2.calcularTesteZ(3);
	}

}
