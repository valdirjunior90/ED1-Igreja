package igreja.ModelDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectBD {
	private static Connection connection = null;
	private static final String url = "jdbc:mariadb://127.0.0.1:3306/test";
	private static final String user = "root";
	private static final String senha = "94219489";

	public Connection getConnection() {
		if (connection == null) {
			try {
				connection = DriverManager.getConnection(url, user, senha);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		} else
			return connection;
	}

	public void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
