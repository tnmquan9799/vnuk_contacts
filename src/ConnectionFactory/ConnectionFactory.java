package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(String dbUrl) {
		try {
			return DriverManager.getConnection(
				dbUrl, 
				System.getenv("dbUser"), 
				System.getenv("dbPassword")
			);
		}
		
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}