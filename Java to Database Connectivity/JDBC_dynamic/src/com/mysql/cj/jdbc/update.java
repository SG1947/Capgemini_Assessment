package com.mysql.cj.jdbc;
import java.sql.*;
import java.util.Scanner;
public class update {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/JDBC";
		String username="root";
		String password="#SGiem2026";
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter new username");
			String name=sc.nextLine();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url, username, password);
			PreparedStatement ps = conn.prepareStatement(
			    "UPDATE USER SET USERNAME=? WHERE UID=?"
			);

			ps.setString(1, name);
			ps.setInt(2, id);

			int rows = ps.executeUpdate();

			if(rows > 0) {

			    System.out.println("Record Updated Successfully");
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