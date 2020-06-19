/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueaderospopservidor.negocio;

import co.unicauca.parqueaderospopservidor.acceso.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author danny
 */
public class GestorEstadistica {
    
    Conexion cn = new Conexion();
    
    public ArrayList<EstadisticaIngreso> consultarEstadistica(String Fecha)throws ClassNotFoundException,SQLException{
        ArrayList<EstadisticaIngreso> listaEstadistica = new ArrayList();
        cn.conectar();
        String sql = "SELECT " + 
                "DATE(regHoraYFechaEntrada) Fecha," +
                "HOUR(regHoraYFechaEntrada) Hora," +
                "COUNT(*) ConteoTotal " + 
                "FROM registrarvehiculo " + 
                "WHERE DATE(regHoraYFechaEntrada) IS NOT NULL AND DATE(regHoraYFechaEntrada)='"+ Fecha + "' " + 
                "GROUP BY CONCAT(DATE(regHoraYFechaEntrada),HOUR(regHoraYFechaEntrada)) " + 
                "ORDER BY HOUR(regHoraYFechaEntrada) ASC";
        System.out.println(sql);
        cn.crearConsulta(sql);
        while(cn.getResultado().next()){
            listaEstadistica.add(new EstadisticaIngreso(cn.getResultado().getString("Fecha"),cn.getResultado().getString("Hora"),cn.getResultado().getString("ConteoTotal")));
        }
        cn.desconectar();
        return listaEstadistica;
    }
    
}
