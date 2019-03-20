import java.sql.Connection;
import java.sql.SQLException;

import ConnectionFactory.ConnectionFactory;



public class Sql0000RunAllQueries {

public static void main(String[] args) throws SQLException {
		
		Connection connectionDb = new ConnectionFactory()
				.getConnection("jdbc:mysql://localhost/");
		
		// Create database
		
		new Sql1000DropDatabase(connectionDb).run();
		new Sql1010CreateDatabase(connectionDb).run();

		connectionDb.close();
		
		//Create tables 
		
		Connection connectionTable = new ConnectionFactory()
				.getConnection("jdbc:mysql://localhost/vnuk_contacts");
		
		//Create
		new Sql1000DropDatabase(connectionTable).run();
		new Sql1010CreateDatabase(connectionTable).run();
		new Sql2010CreateContacts(connectionTable).run();
		
		
		
		//Insert
		new Sql5010InsertIntoContacts(connectionTable).run();
		
		connectionTable.close();
	}
	
}
