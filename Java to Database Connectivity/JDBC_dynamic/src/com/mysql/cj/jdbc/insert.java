package com.mysql.cj.jdbc;
import java.sql.*;
import java.util.*;
public class insert {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/JDBC";
		String username="root";
		String password="#SGiem2026";
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name");
			String name=sc.nextLine();
			System.out.println("Enter email");
			String email=sc.nextLine();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url, username, password);
			PreparedStatement ps = conn.prepareStatement("INSERT INTO USER VALUES(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
            int rows = ps.executeUpdate();
            if(rows>0) {
            	System.out.println("Data inserted successfully");
            	Statement st = conn.createStatement();
            	ResultSet res = st.executeQuery("SELECT * FROM USER");
            	while(res.next()) {
            		System.out.println(
            				res.getInt(1)+","+
            				res.getString(2)+","+
            				res.getString(3));
            	}
            }
            else {
            	System.out.println("Could not be inserted");
            }
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
