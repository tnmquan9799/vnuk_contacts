package vn.edu.vnuk.contacts.test;

import java.sql.Connection;
import java.sql.SQLException;

import vn.edu.vnuk.contacts.ConnectionFactory;

public class TestConnection {

	public static void main(String[] args) throws SQLException{
		
		try {
			Connection connection =  new ConnectionFactory().getConnection("jdbc:mysql://localhost/");
			System.out.println("Connection is open!");
			connection.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Done!");
		}
	}
}