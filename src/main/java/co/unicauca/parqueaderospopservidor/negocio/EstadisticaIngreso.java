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
public class EstadisticaIngreso {
    
    private String Fecha;
    private String Hora;
    private String ConteoTotal;

    public EstadisticaIngreso(String Fecha, String Hora, String ConteoTotal) {
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.ConteoTotal = ConteoTotal;
    }
    
    public EstadisticaIngreso(){
        Fecha="";
        Hora="";
        ConteoTotal="";
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getConteoTotal() {
        return ConteoTotal;
    }

    public void setConteoTotal(String ConteoTotal) {
        this.ConteoTotal = ConteoTotal;
    }
    
}
