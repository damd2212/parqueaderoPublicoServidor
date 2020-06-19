/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueaderospopservidor.negocio;

import co.unicauca.parqueaderospopservidor.acceso.Conexion;
import java.sql.SQLException;

/**
 *
 * @author danny
 */
public class GestorPersona {
    Conexion cn = new Conexion();
    
    //Metodo para consultar la existencia de un usuario con el user y contraseña que se enten ingresando desde el cliente 
    public Persona consultarPersona(String Usuario,String Contraseña)throws ClassNotFoundException,SQLException{
        Persona per=null;
        cn.conectar();
        String sql = "SELECT * FROM persona WHERE perUsuario='" + Usuario + "' AND perContraseña='" + Contraseña + "'";
        System.out.println(sql);
        cn.crearConsulta(sql);
        if (cn.getResultado().next()) {
            per = new Persona();
            per.setPerID(cn.getResultado().getString("perID"));
            per.setPerNombres(cn.getResultado().getString("perNombres"));
            per.setPerApellidos(cn.getResultado().getString("perApellidos"));
            per.setPerRol(cn.getResultado().getString("perRol"));
            per.setPerTelefono(cn.getResultado().getString("perTelefono"));
            per.setPerUsuario(cn.getResultado().getString("perUsuario"));
            per.setPerContraseña(cn.getResultado().getString("perContraseña"));
        }
        cn.desconectar();
        return per;
    }
}
