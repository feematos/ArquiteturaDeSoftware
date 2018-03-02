package service;

import java.util.ArrayList;

import model.Chamado;
import model.ChamadoDAO;

public class ChamadoService {
	ChamadoDAO dao = new ChamadoDAO();
	
	public int abrirChamado(Chamado chamado) {
		return dao.abrirChamado(chamado);
	}
	
	public void consultarChamado(Chamado chamado){
		dao.consultarChamado(chamado);
	}
	
	public void fecharChamado(int id_Chamado){
		dao.fecharChamado(id_Chamado);
	}
	
	public ArrayList<Chamado> listarChamados(){
		return dao.listarChamados();
	}

	public Chamado consultarChamado(int id_Chamado) {
		// TODO Auto-generated method stub
		return null;
	}


}
