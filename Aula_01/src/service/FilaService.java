package service;

import java.util.ArrayList;

import dao.FilaDAO;
import model.Fila;

public class FilaService {
	
FilaDAO dao = new FilaDAO();
	
	public ArrayList<Fila> ListarFilas(Fila fila) {
		return dao.ListarFilas(fila);
	}

}
