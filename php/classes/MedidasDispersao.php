<?php
	
	class MedidasDispersao {
		
		// Média
		// Variancia (Total ou Amostra)
		// Desvio Padrão
		// Coeficiênte de Variação
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
			// Média = Total Números / quantidade
			$quantidadeArrayNumeros = count($this->numeros);
			$totalSomaNumeros = 0;
			// Loop para obter todos os números
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
