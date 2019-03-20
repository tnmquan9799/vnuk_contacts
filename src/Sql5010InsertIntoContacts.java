import java.sql.Connection;
import java.sql.SQLException;

public class Sql5010InsertIntoContacts {
	private final Connection connection;
	private final String sqlQuery;
	
	public Sql5010InsertIntoContacts(Connection connection) {
		this.connection = connection;
		
		this.sqlQuery = "INSERT INTO contacts (name, email, address, date_of_register) "
				+ 	"values "
				
				+ 	"('Minh Quan', 'meehouse@gmail.com', '327 Hung Vuong, Da Nang, Viet Nam', '2019-03-20' ) "
				+ ";"
			;
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  Sql5010InsertIntoContacts started");
		
		try {
	        connection.prepareStatement(sqlQuery).execute();
	        System.out.println("   DATA successfully loaded in \'contacts\'");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<  Sql5010InsertIntoContacts ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}
}
