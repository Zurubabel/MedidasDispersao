<?php
	
	class MedidasDispersao {
		
		// Média - OK
		// Variancia (Total ou Amostra) - E(u - x)² / n (Total) ou E(u - x)² / (n - 1) (amostragem) ok
		// Desvio Padrão ok
		// Coeficiente de Variação - Desvio padrão / média (x 100 para apresentar a porcentagem)
		// Teste Z - (valor - u) / DP
		
		private $arrNumeros;
		private $bAmostragem;
		private $fMedia;
		private $fVariancia;
		private $fDesvioPadrao;
		private $fCoeficienteVariacao;
		
		public function MedidasDispersao($textoNumeros, $bAmostragem = true) {
			$this->arrNumeros = explode(" ", $textoNumeros);
			$this->bAmostragem = $bAmostragem;
			
			$this->calcularGeral();
		}
		
		public function calcularGeral() {
			$this->calcularMedia();
			$this->calcularVariancia();
			$this->calcularDesvioPadrao();
			$this->calcularCoeficienteVariacao();
		}
		
		public function fRetornarTesteZ($index) {
			if ($index <= 0 || $index > count($this->arrNumeros)) {
				throw new Exception("Digite um número de 0 a " . count($this->arrNumeros));
			}
			return ($this->arrNumeros[$index - 1] - $this->fMedia) / $this->fDesvioPadrao;
		}
		
		public function calcularCoeficienteVariacao() {
			$this->fCoeficienteVariacao = $this->fDesvioPadrao / $this->fMedia;
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
		
		public function getDesvioPadrao() {
			return $this->fDesvioPadrao;
		}
		
		public function getMedia() {
			return $this->fMedia;
		}
		
		public function getVariancia() {
			return $this->fVariancia;
		}
		
		public function getCoeficienteVariacao() {
			return $this->fCoeficienteVariacao;
		}
		
		public function setNumeros($numeros) {
			$this->arrNumeros = explode(" ", $numeros);
		}
		
		
		
	}
