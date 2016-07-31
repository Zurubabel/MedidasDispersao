<?php
	
	class MedidasDispersao {
		
		// M�dia
		// Variancia (Total ou Amostra)
		// Desvio Padr�o
		// Coefici�nte de Varia��o
		// Teste Z
		
		private $numeros;
		private $media;
		
		
		public function setNumeros($numeros) {
			$this->numeros = explode(" ", $numeros);
		}
		
		/*public function __constructor($textoNumeros, $amostragem = true) {
			$this->numeros = explode(" ", $textoNumeros);
		}*/
		
		public function calcularMedia() {
			// M�dia = Total N�meros / quantidade
			$quantidadeArrayNumeros = count($this->numeros);
			$totalSomaNumeros = 0;
			// Loop para obter todos os n�meros
			for ($i = 0; $i < $quantidadeArrayNumeros; $i++) {
				// Array no PHP inicia pelo 0
				$totalSomaNumeros += $this->numeros[$i];
			}
			$this->media = $totalSomaNumeros / $quantidadeArrayNumeros;
		}
		
		
		public function getMedia() {
			return $this->media;
		}
		
	}
