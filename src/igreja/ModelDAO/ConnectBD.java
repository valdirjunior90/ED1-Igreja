package igreja.ModelDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectBD {
	private static Connection connection = null;
	private static final String url = "jdbc:mariadb://localhost:3303/igrejaed1";
	private static final String user = "root";
	private static final String senha = "197513";

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
