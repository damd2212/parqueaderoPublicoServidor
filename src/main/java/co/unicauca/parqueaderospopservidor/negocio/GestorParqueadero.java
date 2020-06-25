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

//Metodo para consultar los datos de un parqueadero dependiendo del usuario que se este ingresando desde la vista de iniciar sesion
public class GestorParqueadero {
    Conexion cn = new Conexion();
    public Parqueadero consultarParqueadero(String Usuario)throws ClassNotFoundException,SQLException{
        Parqueadero par = null;
        cn.conectar();
        String sql="SELECT * FROM parqueadero WHERE usuarioPar='"+Usuario+"'";
        System.out.println(sql);
        cn.crearConsulta(sql);
        if (cn.getResultado().next()) {
            par = new Parqueadero();
            par.setNitParqueadero(cn.getResultado().getString("nitParqueadero"));
            par.setNomParqueadero(cn.getResultado().getString("nomParqueadero"));
            par.setDirecParqueadero(cn.getResultado().getString("direcParqueadero"));
            par.setTelParqueadero(cn.getResultado().getString("telParqueadero"));
            par.setUsuarioPar(cn.getResultado().getString("usuarioPar"));
            par.setPuestosLibres(cn.getResultado().getString("puestosLibres"));
            par.setPuestosOcupados(cn.getResultado().getString("puestosOcupados"));
        }
        cn.desconectar();
        return par;
    }
    //Metodo para actualizar los puestos libres donde se le resta uno y los puestos ocupados donde se le suma uno
    public void actualizarIngreso(String nitParqueadero)throws ClassNotFoundException,SQLException{
        cn.conectar();
        String sql = "UPDATE parqueadero SET puestosLibres = puestosLibres - 1,puestosOcupados = puestosOcupados + 1 where nitParqueadero ='"+nitParqueadero+"'";
        System.out.println(sql);
        cn.actualizar(sql);
        cn.desconectar();
    }
    
    //Metodo para actualizar los puestos libres donde se le suma uno y los puestos ocupados donde se le resta uno
    public void actualizarSalida(String nitParqueadero)throws ClassNotFoundException,SQLException{
        cn.conectar();
        String sql = "UPDATE parqueadero SET puestosLibres = puestosLibres + 1,puestosOcupados = puestosOcupados - 1 where nitParqueadero ='"+nitParqueadero+"'";
        System.out.println(sql);
        cn.actualizar(sql);
        cn.desconectar();
    }
}
