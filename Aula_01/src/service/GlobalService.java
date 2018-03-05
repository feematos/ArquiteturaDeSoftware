package service;

import java.util.ArrayList;

import model.Chamado;
import dao.ChamadoDAO;

public class GlobalService {
	ChamadoDAO dao;
	
	public GlobalService(){
		dao = new ChamadoDAO();
	}
	
	public ArrayList<Chamado> listarChamado(String chave){
		return dao.listarChamado(chave);
	}

}
