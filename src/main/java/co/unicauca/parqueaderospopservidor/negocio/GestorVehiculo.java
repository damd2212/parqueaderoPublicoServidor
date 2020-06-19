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
 * @author Danny Diaz-Jhon Zuñiga
 */


public class GestorVehiculo {
   
    Conexion cn = new Conexion();
    
    //Metodo para insertar un nuevo registro en la base de datos
    public void registarVehiculo(String placa,String TipoVehiculo)throws ClassNotFoundException,SQLException{
        cn.conectar();
        cn.actualizar("INSERT INTO vehiculo (placaVehiculo,tipoVehiculo) VALUES("
                + "'" + placa + "',"
                + "'" + TipoVehiculo + "'"
                + ")");
        cn.desconectar();
    }
    
    //Metodo para consultar la exitencia de un vehiculo en la ase de datos
    public Vehiculo consultarVehiculo(String placa)throws ClassNotFoundException,SQLException{
        Vehiculo vehi = null;
        cn.conectar();
        
        cn.crearConsulta("SELECT * FROM vehiculo WHERE placaVehiculo ='"+ placa +"'");
        if (cn.getResultado().next()) {
            vehi = new Vehiculo();
            vehi.setPlacaVehiculo(cn.getResultado().getString("placaVehiculo"));
            vehi.setTipoVehiculo(cn.getResultado().getString("tipoVehiculo"));
        }
        cn.desconectar();
        return vehi;
    }
}
