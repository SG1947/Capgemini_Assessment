package com.mysql.cj.jdbc;
import java.sql.*;
import java.util.Scanner;
public class delete {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/JDBC";
		String username="root";
		String password="#SGiem2026";
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			int id=sc.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url, username, password);
			PreparedStatement ps = conn.prepareStatement(
			    "DELETE FROM USER WHERE UID=?"
			);
			ps.setInt(1, id);

			int rows = ps.executeUpdate();

			if(rows > 0) {

			    System.out.println("Record Deleted Successfully");
			    Statement st = conn.createStatement( );

			    ResultSet res = st.executeQuery("SELECT * FROM USER");
                
			    while(res.next()) {
			        System.out.println(
			            res.getInt("UID") + "," +
			            res.getString("USERNAME") + "," +
			            res.getString(3)
			        );
			    }

			} 
			else {
			    System.out.println("No such record found");
			}

			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
