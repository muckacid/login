package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

public class Data {
    private Conexion con;
    
    public Data() throws ClassNotFoundException, SQLException{
        con = new Conexion("cortinas");
    }

    public boolean existUser(String rut, String pass) throws SQLException {
        String sql = "SELECT COUNT(rut_user) FROM usuario WHERE email_user = '"+rut+"' and pass_user = SHA2('"+pass+"',0);";
        ResultSet rs = con.ejecutar(sql);
        boolean existe = false;
        if (rs.next()){
            if(rs.getInt(1) == 1){
                existe = true;
            }
        }
        con.close();
        return existe;
    }

    public int getRango(String email) throws SQLException {
        String sql = "SELECT tipo_usuario.rango AS 'tipo' FROM usuario INNER JOIN tipo_usuario ON usuario.type_user = tipo_usuario.id_tipo WHERE usuario.email_user = '"+email+"';";
        ResultSet rs = con.ejecutar(sql);
        int rango = 0;
        if (rs.next()){
            rango = rs.getInt("tipo");
        }
        con.close();
        return rango;
    }
}

