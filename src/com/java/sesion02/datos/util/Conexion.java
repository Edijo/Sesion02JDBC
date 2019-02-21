package com.java.sesion02.datos.util;

import java.sql.* ;

public class Conexion {
	public static void main(String[] args) {
		Conexion con = new Conexion();
		Connection conn = con.getConnection();
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		Connection conn  = null ; 
		try {
			String url="jdbc:mysql://192.168.99.100:3306/db_matricula?autoReconnect=true&useSSL=false"; 
			String usuario="root"; 
			String password= "abc123";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,usuario, password) ;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			//docker exec -it aplicacion_mysql /bin/bash
			e.printStackTrace();
			
		}
		
		return conn; 
		
	}

}
