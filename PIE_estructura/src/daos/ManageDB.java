package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManageDB {
	
	public static Connection connectToDB() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.1.23:3306/agencia", "fp", "1234");
		return conexion;
	}
	
	public static void closeConnection(Connection connection) throws SQLException{
		connection.close();
	}

}
