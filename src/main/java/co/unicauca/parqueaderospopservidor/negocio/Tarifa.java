/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueaderospopservidor.negocio;

/**
 *
 * @author danny
 */
public class Tarifa {
    
    private String idTarifa;
    private String tarifaHora;
    private String tarifaMedioDia;
    private String tarifaDia;
    private String ValorTotal;
    
    //Constructor parametrizado para la clase Tarifa
    public Tarifa(String idTarifa, String tarifaHora, String tarifaMedioDia, String tarifaDia, String ValorTotal) {
        this.idTarifa = idTarifa;
        this.tarifaHora = tarifaHora;
        this.tarifaMedioDia = tarifaMedioDia;
        this.tarifaDia = tarifaDia;
        this.ValorTotal = ValorTotal;
    }
    
    //Constructor sin parametros para la clase Tarifa
    public Tarifa(){
        idTarifa ="";
        tarifaHora = "";
        tarifaMedioDia = "";
        tarifaDia = "";
        ValorTotal = "";
    }

    //Getters y Setters para los atributos de la clase tarifa
    public String getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(String idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(String tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public String getTarifaMedioDia() {
        return tarifaMedioDia;
    }

    public void setTarifaMedioDia(String tarifaMedioDia) {
        this.tarifaMedioDia = tarifaMedioDia;
    }

    public String getTarifaDia() {
        return tarifaDia;
    }

    public void setTarifaDia(String tarifaDia) {
        this.tarifaDia = tarifaDia;
    }

    public String getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(String ValorTotal) {
        this.ValorTotal = ValorTotal;
    }
    
}
