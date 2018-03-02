package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Obtém conexão com o banco de dados
	public static ConnectionFactory obtemConexao() throws SQLException {
		return (ConnectionFactory) DriverManager
				.getConnection("jdbc:mysql://localhost/servicedesk?user=alunos&password=alunos");
	}

}