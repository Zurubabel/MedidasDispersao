<?php

	include "classes/MedidasDispersao.php";
	
	// https://github.com/Zurubabel/MedidasDispersao/tree/master/php
	if (isset($_POST["numeros"])) {
		
		$bAmostragem = !isset($_POST["calcularTotal"]);
		
		$medidasDispersao = new MedidasDispersao($_POST["numeros"], $bAmostragem);
		echo "Média : " . $medidasDispersao->getMedia() . "<br />";
		echo "Variancia : " . $medidasDispersao->getVariancia() . "<br / >";
		echo "Desvio Padrão : " . $medidasDispersao->getDesvioPadrao() . "<br / >";
		
		
	}
?>

<html>
	<head>
		<title>Cálculos de Medidas de Dispersão</title>
	</head>
	<body>
		<form method="post" action="">
			<h3>Cálculos de Medidas de Dispersão</h3>
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