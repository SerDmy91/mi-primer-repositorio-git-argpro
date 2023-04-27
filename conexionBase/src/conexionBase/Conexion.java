package conexionBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	public static void main(String[] args){
	try{
	    Class.forName("com.mysql.jdbc.Driver");
	    DriverManager.getConnection("jdbc:mysql://localhost:3306/qatar2022","root","Utnarg4.0");
	    System.out.println("Conexion exitosa!!");
	    
	}catch (ClassNotFoundException e){
	    System.out.println("Error al cargar el controlador!!!!");
	   
	}catch (SQLException e){
	    System.out.println("Error en la conexion!!!!");
	    
	}
 }
}
