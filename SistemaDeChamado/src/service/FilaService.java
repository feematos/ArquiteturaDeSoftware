package service;

import java.util.ArrayList;

import model.Fila;
import model.FilaDAO;

public class FilaService {
	FilaDAO dao = new FilaDAO();
	
	public ArrayList<Fila> listarFilas(){
		return dao.listarFilas();
	}

}
