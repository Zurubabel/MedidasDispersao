<?php
	
	class MedidasDispersao {
		
		// M�dia - OK
		// Variancia (Total ou Amostra) - E(u - x)� / n (Total) ou E(u - x)� / (n - 1) (amostragem) ok
		// Desvio Padr�o
		// Coefici�nte de Varia��o
		// Teste Z
		
		private $arrNumeros;
		private $bAmostragem;
		private $fMedia;
		private $fVariancia;
		private $fDesvioPadrao;
		
		public function MedidasDispersao($textoNumeros, $bAmostragem = true) {
			$this->arrNumeros = explode(" ", $textoNumeros);
			$this->bAmostragem = $bAmostragem;
			
			$this->calcularGeral();
		}
		
		public function calcularGeral() {
			$this->calcularMedia();
			$this->calcularVariancia();
			$this->calcularDesvioPadrao();
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
		
		public function calcularDesvioPadrao() {
			$this->fDesvioPadrao = sqrt($this->fVariancia);
		}
		
		public function calcularMedia() {
			// M�dia = Total N�meros / quantidade
			$quantidadeArrayNumeros = count($this->arrNumeros);
			$totalSomaNumeros = 0;
			// Loop para obter todos os n�meros
			for ($i = 0; $i < $quantidadeArrayNumeros; $i++) {
				// Array no PHP inicia pelo 0
				$totalSomaNumeros +=  $this->arrNumeros[$i];
			}
			$this->fMedia = $totalSomaNumeros / $quantidadeArrayNumeros;
		}
		
		public function getDesvioPadrao() {
			return $this->fDesvioPadrao;
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
