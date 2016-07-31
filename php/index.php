<?php 
	// https://github.com/Zurubabel/MedidasDispersao/tree/master/php
	if (isset($_POST["numeros"])) {
		print_r($_POST["numeros"]);
	}
?>

<html>
	<head>
		<title>Cálculos de Medidas de Dispersão</title>
	</head>
	<body>
		<form method="post" action="">
			<h3>Cálculos de Medidas de Dispersão</h3>
			<textarea name="numeros" rows="5" cols="25"></textarea>
			<button type="submit">Enviar</button>
		</form>
	</body>
</html>