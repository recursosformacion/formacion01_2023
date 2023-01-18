package curso.g9900.BBDD0;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class OracleJDBC {
	private static Connection conn;
	public final static  String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
	public final static String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	public final static String DATABASE =  "";
	public final static String USUARIO="hr";
	public final static String PASSWORD="hr";
//	public final static String SQL_USE = "USE  ";
//	public final static String SQL_CREATE = "CREATE DATABASE ";

	public static void main(String[] argv) {

		System.out.println("-------- Oracle JDBC Connection Testing ------");
//-----------------Carga driver
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;
		}
		System.out.println("Oracle JDBC Driver Registered!");
		
//-----------------Consigue conexion
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL+DATABASE,USUARIO,PASSWORD);
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	}
}
