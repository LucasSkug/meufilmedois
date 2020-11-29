package br.com.meufilme.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	/** M�dulo de conex�o  **/
	// Par�metros de conex�o
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbfilme?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "ail4354";
	// M�todo de conex�o
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	
}
