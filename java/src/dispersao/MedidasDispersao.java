package dispersao;

import java.util.ArrayList;
import java.util.List;

import dispersao.calculos.CalculosAlcance;
import dispersao.calculos.CalculosVarianciaDesvioPadrao;

public class MedidasDispersao {

	// GITHUB - https://github.com/Zurubabel/MedidasDispersao
	
	public static void main(String[] args) {
		int[] numerosArray = {1,2,3,4,5,6};
		/*List<Integer> numerosLista = new ArrayList<>();
		
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
		
		CalculosAlcance calculosDispersao = new CalculosAlcance();
		
		calculosDispersao.exibirAlcanceLista(numerosLista);
		
		// ----------------------
		
		
		calculosDispersao.exibirAlcanceArray(numerosArray);*/
		
		CalculosVarianciaDesvioPadrao vdpAmostragem = new CalculosVarianciaDesvioPadrao(numerosArray, true);
		//vdp.calcularVariancia(numerosArray);
		//vdp.calcularVariancia2(numerosArray);
		vdpAmostragem.calcularDesvioPadrao();
		vdpAmostragem.calcularPorTotal();
		vdpAmostragem.calcularDesvioPadrao();
		
		

	}

}
