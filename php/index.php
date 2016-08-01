<?php

	include "classes/MedidasDispersao.php";
	
	// https://github.com/Zurubabel/MedidasDispersao/tree/master/php
	if (isset($_POST["numeros"])) {
		
		$bAmostragem = !isset($_POST["calcularTotal"]);
		
		$medidasDispersao = new MedidasDispersao($_POST["numeros"], $bAmostragem);
		echo "M�dia : " . $medidasDispersao->getMedia() . "<br />";
		echo "Variancia : " . $medidasDispersao->getVariancia() . "<br / >";
		echo "Desvio Padr�o : " . $medidasDispersao->getDesvioPadrao() . "<br / >";
		echo "Coeficiente de Varia��o : " . $medidasDispersao->getCoeficienteVariacao() . "<br / >";
		try {
			echo "O teste Z do n�mero � " . $medidasDispersao->fRetornarTesteZ(-1) . "</br>";
		} catch (Exception $e) {
			echo "----***----<br />";
			echo "ERRO!<BR />";
			echo $e->getMessage();
			echo "<br />----***----<br />";
		}
		
	}
?>

<html>
	<head>
		<title>C�lculos de Medidas de Dispers�o</title>
	</head>
	<body>
		<form method="post" action="">
			<h3>C�lculos de Medidas de Dispers�o</h3>
			<textarea name="numeros" rows="5" cols="25"><?php 
				if (isset($_POST["numeros"])) {
					echo $_POST["numeros"];
				}
			?></textarea><br />
			<input type="checkbox" name="calcularTotal" <?php 
				if (isset($_POST["calcularTotal"])) {
					echo "checked";
				}
			?>>Calcular por Total<br />
			<button type="submit">Enviar</button>
		</form>
	</body>
</html>