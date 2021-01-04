<%@page import="java.util.ArrayList"%>
<%@page import="model.Veiculo"%>
<%@page import="model.dao.VeiculoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF8">
<title>Veiculos</title>
</head>
<body>
	<table>
		<tbody>
			<%
				//Cabe�alho
			Veiculo veiculo; //Cria um onjeto ve�culo
			VeiculoDAO vd = new VeiculoDAO(); //cria um objeto DAO
			ArrayList<Veiculo> veiculos = vd.open(); //Cria uma lista com todos os dados do arquivo

			//Verifica se o objeto request recebeu uma placa e executa o (DELETE)
			if (request.getParameter("placa")!=null){
				String placa = request.getParameter("placa");
				veiculo = new Veiculo();
				veiculo.setPlaca(placa);
				if(veiculos.contains(veiculo)){
					//Se a lista local contiver um ve�culo com a placa informada, � removido
					veiculos.remove(veiculos.indexOf(veiculo));
					//O m�todo save do objeto DAO salva a nova lista
					if(vd.save(veiculos)){
						out.print("Ve�culo removido com sucesso.");
					}
				}else{
					out.print("Ve�culo n�o encontrado no cadastro.");
				}
			} else {
				out.print("Aguardando dados para exclus�o de registro.");
			}
			%>

		</tbody>
	</table>
</body>
</html>