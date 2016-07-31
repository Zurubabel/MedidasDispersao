<?php

	include "classes/MedidasDispersao.php";
	
	// https://github.com/Zurubabel/MedidasDispersao/tree/master/php
	if (isset($_POST["numeros"])) {
		
		$medidasDispersao = new MedidasDispersao();
		$medidasDispersao->setNumeros($_POST["numeros"]);
		$medidasDispersao->calcularMedia();
		
		echo "M�dia : " . $medidasDispersao->getMedia();
		
		
	}
?>

<html>
	<head>
		<title>C�lculos de Medidas de Dispers�o</title>
	</head>
	<body>
		<form method="post" action="">
			<h3>C�lculos de Medidas de Dispers�o</h3>
			<textarea name="numeros" rows="5" cols="25"></textarea>
			<button type="submit">Enviar</button>
		</form>
	</body>
</html>