<?php
	
	class MedidasDispersao {
		
		// Média - OK
		// Variancia (Total ou Amostra) - E(u - x)² / n (Total) ou E(u - x)² / (n - 1) (amostragem)
		// Desvio Padrão
		// Coeficiênte de Variação
		// Teste Z
		
		private $arrNumeros;
		private $bAmostragem;
		private $fMedia;
		private $fVariancia;
		
		public function MedidasDispersao($textoNumeros, $bAmostragem = true) {
			$this->arrNumeros = explode(" ", $textoNumeros);
		}
		
		public function calcularVariancia() {
			$iQuantidadeDivisao = 0;
			$iSomaTotal = 0;
			if ($this->bAmostragem === true) {
				// Se for amostragem
				$iQuantidadeDivisao = count($this->arrNumeros) - 1;
			} else {
				// Total
				$iQuantidadeDivisao = count($this->arrNumeros);
			}
			
			for ($i = 0; $i < count($this->arrNumeros); $i++) {
				$iSomaTotal += pow(($this->fMedia - $this->arrNumeros[$i]), 2);
			}
			$this->fVariancia = $iSomaTotal / $iQuantidadeDivisao;			
		}
		
		public function calcularMedia() {
			// Média = Total Números / quantidade
			$quantidadeArrayNumeros = count($this->arrNumeros);
			$totalSomaNumeros = 0;
			// Loop para obter todos os números
			for ($i = 0; $i < $quantidadeArrayNumeros; $i++) {
				// Array no PHP inicia pelo 0
				$totalSomaNumeros +=  $this->arrNumeros[$i];
			}
			$this->fMedia = $totalSomaNumeros / $quantidadeArrayNumeros;
		}
		
		
		public function getMedia() {
			return $this->fMedia;
		}
		
		public function getVariancia() {
			return $this->fVariancia;
		}
		
		public function setNumeros($numeros) {
			$this->arrNumeros = explode(" ", $numeros);
		}
		
	}
