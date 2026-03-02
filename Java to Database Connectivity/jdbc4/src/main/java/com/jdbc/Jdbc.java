package com.jdbc;

import java.sql.*;

public class Jdbc {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/JDBC";
		String username="root";
		String password="#SGiem2026";
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection(url, username, password);
		    Statement st = con.createStatement();

		    st.executeUpdate(
		        "CREATE TABLE IF NOT EXISTS STUDENT ( "
		        + "ID INT PRIMARY KEY,"
		        + "NAME VARCHAR(20),"
		        + "COURSEID INT)"
		    );

		    st.executeUpdate("INSERT INTO STUDENT VALUES(2001,'KAMAL',3002)");
		    st.executeUpdate("INSERT INTO STUDENT VALUES(2002,'AMAL',3001)");
		    st.executeUpdate("INSERT INTO STUDENT VALUES(2003,'TAMAL',3002)");
		    st.executeUpdate("INSERT INTO STUDENT VALUES(2004,'VIMAL',3003)");
		    st.executeUpdate("INSERT INTO STUDENT VALUES(2005,'SIMAL',3002)");

		    ResultSet res = st.executeQuery("SELECT * FROM STUDENT");
		    System.out.println("ID, NAME, COURSEID");
		    while (res.next()) {
		        System.out.println(
		            res.getInt("ID") + "," +
		            res.getString("NAME") + "," +
		            res.getInt("COURSEID")
		        );
		    }

		    con.close();
		}
		catch (Exception e) {
		    System.out.println(e.getMessage());
		}
		

	}

}
