package com.mysql.cj.jdbc;
import java.sql.*;
import java.util.Scanner;
public class Dynamic_select {

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
//			conn.prepareStatement("SELECT * FROM USER WHERE UID=1001");//complete query-static
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM USER WHERE UID=?");//dynamic query
			ps.setInt(1, id);
			ResultSet res = ps.executeQuery();
			boolean found = false;

			while(res.next()) {
			    found = true;
			    System.out.println(res.getInt(1)+","+
			                       res.getString(2)+","+
			                       res.getString(3));
			}

			if(!found) {
			    System.out.println("No such records exist");
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
