package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Fila;

public class FilaDAO {
	
	public ArrayList<Fila> ListarFilas(Fila fila) {
		
		ArrayList<Fila> lista = new ArrayList<>();
		String sqlSelect = "SELECT NovoProjeto, ManutencaoSV, ManutencaoSERP, Servidore, Rede, Telefonia, Desktop  FROM fila";
		
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					fila = new Fila();
					fila.setNovoProjeto(rs.getString("NovoProjeto"));
					fila.setManutencaoSV(rs.getString("ManutencaoSV"));
					fila.setManutencaoSERP(rs.getString("ManutencaoSERP"));
					fila.setServidore(rs.getString("Servidore"));
					fila.setRede(rs.getString("Rede"));
					fila.setTelefonia(rs.getInt("Telefonia"));
					fila.setDesktop(rs.getString("Desktop"));
					lista.add(fila);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return lista;
	}

}
