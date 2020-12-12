<?php

	require("../process/process.vagas.php");

	include("configs.php");

	$vp = new VagasProcess();

	switch($_SERVER['REQUEST_METHOD']) {
		case "GET":
			$vp->doGet($_GET);
			break;

		case "POST":
			$vp->doPost($_POST);
			break;

		case "PUT":
			$vp->doPut($_PUT);
			break;

		case "DELETE":
			$vp->doDelete($_DELETE);
			break;
	}