<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Listar Chamados Abertos</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

</head>
<body>
	<div class="container">
	<table class="table">
  		<thead>
    		<tr>
      			<th scope="col">Fechar</th>
      			<th scope="col">Número</th>
      			<th scope="col">Descrição</th>
      			<th scope="col">Abertura</th>
    		</tr>
  		</thead>
  		<tbody>
    		<tr>
      			<th scope="row"><input type="checkbox"></th>
      			<td>1</td>
      			<td>Teste</td>
      			<td>01/03/2018</td>
    		</tr>
    		<tr>
      			<th scope="row"><input type="checkbox"></th>
      			<td>2</td>
      			<td>Teste</td>
      			<td>01/03/2018</td>
    		</tr>
    		<tr>
      			<th scope="row"><input type="checkbox"></th>
      			<td>3</td>
      			<td>Teste</td>
      			<td>01/03/2018</td>
    		</tr>
  		</tbody>
		</table>
		<div class="row" align="center">
				<div class="table-responsive col-md-12">
					<button type="submit" class="btn btn-primary" id="fechar" name="acao" value="Fechar">Fechar Chamados</button>	
			    </div>
		</div>       
	</div>
</body>
</html>