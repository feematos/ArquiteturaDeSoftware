package service;

import dao.ChamadoDAO;
import model.Chamado;

public class ChamadoService {
	ChamadoDAO dao = new ChamadoDAO();
	
	public int abrirChamado(Chamado chamado) {
		return dao.abrirChamado(chamado);
	}
	
	public void fecharChamado(Chamado chamado){
		dao.fecharChamado(chamado);
	}
	
	public void consultarChamado(Chamado chamado){
		dao.consultarChamado(chamado);
	}
	
	public void listarChamado(Chamado chamado){
		dao.listarChamado(chamado);
	}
	
}
