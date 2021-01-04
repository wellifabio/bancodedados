package controll;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Veiculo;
import model.dao.VeiculoDAO;

@WebServlet("/rest")
public class restVeiculo extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Veiculo veiculo;
	private VeiculoDAO vd = new VeiculoDAO();
	private ArrayList<Veiculo> veiculos = vd.open();
	private PrintWriter out;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		out = resp.getWriter();
		// Recebe os dados via request
		String placa = req.getParameter("placa");
		String marca = req.getParameter("marca");
		String modelo = req.getParameter("modelo");
		int ano = 0;
		float km = 0;
		if (req.getParameter("ano") != null) {
			ano = Integer.parseInt(req.getParameter("ano"));
		}
		if (req.getParameter("km") != null) {
			km = Float.parseFloat(req.getParameter("km"));
		}

		// (CREATE)
		if (placa != null && marca != null && modelo != null && ano != 0 && km != 0) {
			veiculo = new Veiculo();
			veiculo.setPlaca(placa);
			veiculo.setMarca(marca);
			veiculo.setModelo(modelo);
			veiculo.setAno(ano);
			veiculo.setKm(km);
			if (veiculos.contains(veiculo)) {
				// Se o ve�culo j� estiver cadastrado informa
				out.print("Este ve�culo j� est� cadastrado");
			} else {
				veiculos.add(veiculo);
				out.print("Ve�culo cadastrado com sucesso.");
			}
			vd.save(veiculos);
		} else {
			out.print("Dados incompletos, verifique se algum campo n�o foi preenchido.");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		out = resp.getWriter();
		for (Veiculo v : veiculos) {
			out.print(v.toCSV().toString());
		}
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		out = resp.getWriter();
		// Verifica e preenche os atributos caso hara requisi��o no objeto request
		String placa = req.getParameter("placa");
		String marca = req.getParameter("marca");
		String modelo = req.getParameter("modelo");
		int ano = 0;
		float km = 0;
		if (req.getParameter("ano") != null) { // Verifica antes de converter
			ano = Integer.parseInt(req.getParameter("ano"));
		}
		if (req.getParameter("km") != null) { // Verifica antes de converter
			km = Float.parseFloat(req.getParameter("km"));
		}

		// (UPDATE)
		if (placa != null && marca != null && modelo != null && ano != 0 && km != 0) {
			veiculo = new Veiculo();
			veiculo.setPlaca(placa);
			veiculo.setMarca(marca);
			veiculo.setModelo(modelo);
			veiculo.setAno(ano);
			veiculo.setKm(km);
			if (veiculos.contains(veiculo)) {
				// Faz a altera��o da lista local
				veiculos.set(veiculos.indexOf(veiculo), veiculo);
				out.print("Ve�culo atualizado com sucesso.");
			} else {
				out.print("Ve�culo n�o encontrado.");
			}
			vd.save(veiculos); // Utiliza o m�todo save do obj DAO para enviar a lista atualizada
		}else {
			out.print("Dados incompletos, verifique se algum campo n�o foi preenchido.");
		}
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		out = resp.getWriter();
		//(DELETE)
		if (req.getParameter("placa")!=null){
			String placa = req.getParameter("placa");
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
		}else {
			out.print("Dados incompletos, � necess�rio preencher a placa.");
		}
	}
}
