package persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
public class Dao {
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;

	String url="jdbc:postgresql://localhost:5432/exercicio5";
	String usuario="postgres";
	String senha= "postgres";

	 protected void open()throws Exception{
		 Class.forName("org.postgresql.Driver");
		 con = DriverManager.getConnection(url, usuario, senha);
	 }

	 protected void close()throws Exception{
		 con.close();
	 } 
}
