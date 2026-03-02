package com.jdbc;

import java.sql.*;

public class jdbc {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet res=null;
		String url="jdbc:mysql://localhost:3306/JDBC";
		String username="root";
		String password="#SGiem2026";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			st = con.createStatement();
//			st.executeUpdate("INSERT INTO USER VALUES(1006,'NAMAN','ABC@GMAIL.COM')");
//			st.executeUpdate("DELETE FROM USER WHERE UID=1004");
//			st.executeUpdate("UPDATE USER SET EMAIL='ARAV@gmail.com' WHERE UID=1006");
			res=st.executeQuery("SELECT * FROM USER");
			System.out.println("USER ID ,USERNAME,EMAIL");
			while(res.next()) {
				
                System.out.println(
                    res.getInt("UID") + "," +
                    res.getString(2) + ","+
                    	res.getString(3)
                );
                
            }
			con.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}




//url-api:vendor://ip address:port no/database_name
//username,password
