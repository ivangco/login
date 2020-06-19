/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ivan_
 */
public class Conexion {
//Connection proporciona una conexión estática a la base de datos
//Connection es el principal objeto utilizado para proporcionar un vínculo entre las bases de datos y una aplicación en Java

    static Connection conn = null;

//Statement se usa para enviar sentencias SQL a la base de datos
//PreparedStatement se usa para ejecutar sentencias SQL precompiladas con o sin parámetros IN
//CallableStatement se usa para ejecutar un procedimieno de base de datos almacenado    
    static Statement st = null;

    //viariables de datos para la conexion
    
    static String driver="com.mysql.jdbc.Driver";
    
//nombre de la base de datos
    //static String bd = "conexionmvc?autoReconnect=true&useSSL=false";
    static String bd = "sistema?autoReconnect=true&useSSL=false";
    //usuario
    static String usuario = "root";
    static String clave = "";
    static String url = "jdbc:mysql://localhost:3306/" + bd;

    public static Connection Enlace(Connection conn) throws SQLException {
        try {
            
            Class.forName(driver);
            conn= DriverManager.getConnection(url,usuario,clave);
            System.out.println("coneccion exitosa");
        } catch (Exception e) {
            System.out.println("coneccion fallida"+ e);

        }
        return conn;
    }

    public static Statement sta(Statement st) throws SQLException {
        conn = Enlace(conn);
        st= conn.createStatement();
        return st;
    }

}
