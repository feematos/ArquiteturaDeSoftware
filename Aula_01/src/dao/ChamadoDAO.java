package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Chamado;


public class ChamadoDAO {
	
	public int abrirChamado(Chamado chamado) {
		String sqlOpen = "INSERT INTO chamado(cliente, descricao, data, hora, status, NumChamado, id) VALUES (?, ?, ?)";
		
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlOpen);) {
			stm.setString(1, chamado.getCliente());
			stm.setString(2, chamado.getDescricao());
			stm.setString(3, chamado.getData());
			stm.setString(4, chamado.getHora());
			stm.setString(5, chamado.getStatus());
			stm.setInt   (6, chamado.getNumChamado());
			stm.setInt   (7, chamado.getId());
			stm.execute();
			String sqlQuery = "SELECT LAST_INSERT_ID()";
			try (PreparedStatement stm2 = conn.prepareStatement(sqlQuery);
					ResultSet rs = stm2.executeQuery();) {
				if (rs.next()) {
					chamado.setId(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return chamado.getId();
	}
	
	@SuppressWarnings("unused")
	public void fecharChamado(Chamado chamado) {
		String sqlClose = "Close chamado cliente, descricao, data, hora, status, NumChamado WHERE id";
	}
	
	@SuppressWarnings("unused")
	public void consultarChamado(Chamado chamado) {
		String sqlConsult = "CONSULT FROM chamado WHERE id = ?";
		
	}
	
	public ArrayList<Chamado> listarChamado(Chamado chamado2) {
		Chamado chamado;
		ArrayList<Chamado> lista = new ArrayList<>();
		String sqlSelect = "SELECT id, cliente, descricao, data, hora, status, NumChamado  FROM chamado";
		
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					chamado = new Chamado();
					chamado.setId(rs.getInt("id"));
					chamado.setCliente(rs.getString("cliente"));
					chamado.setDescricao(rs.getString("descricao"));
					chamado.setData(rs.getString("data"));
					chamado.setHora(rs.getString("hora"));
					chamado.setStatus(rs.getString("status"));
					chamado.setNumChamado(rs.getInt("NumChamado"));
					lista.add(chamado);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return lista;
	}

	public ArrayList<Chamado> listarChamado(String chave) {
		// TODO Auto-generated method stub
		return null;
	}	

}
