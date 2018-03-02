<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Novo chamado</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

</head>
<body>
	<!-- Container Principal -->
	<div id="main" class="container">
		<div class="row" align=center style="margin-bottom: 30px;">
			<div class="col-md-12">
				<h2>Novo chamado</h2>
			</div>
		</div>
		<form action="ManterChamados.do" method="post">
			<div class="row">
				<div class="form-group col-md-12">
					<label for="descricao">Descrição:</label> 
					<input type="text" class="form-control" name="descricao" id="descricao" required maxlength="100" placeholder="Descrição">
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label for="fila">Fila:</label> 
					<select class="form-control" name="fila" id="fila">
						<option value="novosProjetos">Novos Projetos</option>
						<option value="manutencaoSistemDdeVendas">Manutenção Sistema de Vendas</option>
						<option value="manutencaoSistemaERP">Manutenção Sistema ERP</option>
						<option value="servidores">Servidores</option>
						<option value="redes">Redes</option>
						<option value="telefonia">Telefonia</option>
						<option value="desktops">Desktops</option>
					</select>
				</div>
			</div>
			<div class="row" align="center">
				<div class="table-responsive col-md-12">
					<button type="submit" class="btn btn-primary" name="acao" value="Criar">Salvar Chamado</button>	
			    </div>
			 </div>
		</form>
	</div>
	<!-- Fim do Container -->
	
	<script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>
</html>