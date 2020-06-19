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
public class GestorTarifa {
    Conexion cn = new Conexion();
    
    //Metodo para consultar las tarifas que se tienen para carros y motos
    //Ademas es un metodo que calcula el valor total del tiempo que un clinete tuvo su vehiculo en el parqueadero donde tiene en cuenta los minutos y las horas 
    //para asi poder realizar el calculo
    public Tarifa consultarTarifa(String Horas,String Minutos)throws ClassNotFoundException,SQLException{
        Tarifa tarifa = new Tarifa();

        int varHoras = Integer.parseInt(Horas);
        int varMinutos = Integer.parseInt(Minutos);
        
        int varTarifaHora;
        int varTarifaMedioDia;
        int varTarifaDia;
        
        int varTotalPagar=0;
        String varTotal="";
                
        cn.conectar();
        String sql="SELECT * FROM tarifa WHERE idTarifa = 1";
        cn.crearConsulta(sql);
        if (cn.getResultado().next()) {
            tarifa = new Tarifa();
            tarifa.setIdTarifa(cn.getResultado().getString("idTarifa"));
            tarifa.setTarifaHora(cn.getResultado().getString("tarifaHora"));
            tarifa.setTarifaMedioDia(cn.getResultado().getString("tarifaMedioDia"));
            tarifa.setTarifaDia(cn.getResultado().getString("tarifaDia"));
        }
        
        varTarifaHora = Integer.parseInt(tarifa.getTarifaHora()) ;
        varTarifaMedioDia = Integer.parseInt(tarifa.getTarifaMedioDia());
        varTarifaDia = Integer.parseInt(tarifa.getTarifaDia());
    
        if (varMinutos > 0 && varHoras == 0) {
            varTotalPagar = varTarifaHora;
        }
        if(varHoras == 6){
            if (varMinutos > 0) {
                varTotalPagar = (varHoras + 1) * varTarifaHora;
            }else{
               varTotalPagar = varTarifaMedioDia; 
            }
        }
        if (varHoras == 12) {
            if (varMinutos > 0) {
                varTotalPagar = (varHoras + 1) * varTarifaHora;
            }else{
                varTotalPagar = varTarifaDia;
            }
        }
        if (varHoras > 0 && varHoras < 6) {
            if (varMinutos > 0) {
                varHoras = varHoras + 1;
            }
            varTotalPagar = varHoras * varTarifaHora;
        }
        if (varHoras > 6 && varHoras < 12) {
            if (varMinutos > 0) {
                varHoras = varHoras + 1;
            }
        }
        if(varHoras > 12){
            if (varMinutos > 0) {
                varHoras = varHoras + 1;
            }
            varTotalPagar = varHoras * varTarifaHora;
        }
        if (varMinutos==0 && varHoras == 0) {
            varTotalPagar = varTarifaHora;
        }
        
        varTotal = Integer.toString(varTotalPagar);
        tarifa.setValorTotal(varTotal);
        cn.desconectar();
        return tarifa;
    }
    //
    //Consulta tarifa para motos
    //
    public Tarifa consultarTarifaMotos(String Horas,String Minutos)throws ClassNotFoundException,SQLException{
        Tarifa tarifa = new Tarifa();

        int varHoras = Integer.parseInt(Horas);
        int varMinutos = Integer.parseInt(Minutos);
        
        int varTarifaHora;
        int varTarifaMedioDia;
        int varTarifaDia;
        
        int varTotalPagar=0;
        String varTotal="";
                
        cn.conectar();
        String sql="SELECT * FROM tarifa WHERE idTarifa = 2";
        cn.crearConsulta(sql);
        if (cn.getResultado().next()) {
            tarifa = new Tarifa();
            tarifa.setIdTarifa(cn.getResultado().getString("idTarifa"));
            tarifa.setTarifaHora(cn.getResultado().getString("tarifaHora"));
            tarifa.setTarifaMedioDia(cn.getResultado().getString("tarifaMedioDia"));
            tarifa.setTarifaDia(cn.getResultado().getString("tarifaDia"));
        }
        
        varTarifaHora = Integer.parseInt(tarifa.getTarifaHora()) ;
        varTarifaMedioDia = Integer.parseInt(tarifa.getTarifaMedioDia());
        varTarifaDia = Integer.parseInt(tarifa.getTarifaDia());
    
        if (varMinutos > 0 && varHoras == 0) {
            varTotalPagar = varTarifaHora;
        }
        if(varHoras == 6){
            if (varMinutos > 0) {
                varTotalPagar = (varHoras + 1) * varTarifaHora;
            }else{
               varTotalPagar = varTarifaMedioDia; 
            }
        }
        if (varHoras == 12) {
            if (varMinutos > 0) {
                varTotalPagar = (varHoras + 1) * varTarifaHora;
            }else{
                varTotalPagar = varTarifaDia;
            }
        }
        if (varHoras > 0 && varHoras < 6) {
            if (varMinutos > 0) {
                varHoras = varHoras + 1;
            }
            varTotalPagar = varHoras * varTarifaHora;
        }
        if (varHoras > 6 && varHoras < 12) {
            if (varMinutos > 0) {
                varHoras = varHoras + 1;
            }
        }
        if(varHoras > 12){
            if (varMinutos > 0) {
                varHoras = varHoras + 1;
            }
            varTotalPagar = varHoras * varTarifaHora;
        }
        if (varMinutos==0 && varHoras == 0) {
            varTotalPagar = varTarifaHora;
        }
        
        varTotal = Integer.toString(varTotalPagar);
        tarifa.setValorTotal(varTotal);
        cn.desconectar();
        return tarifa;
    }
}
