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
public class RegVehiculo {
    private String regNumFicha;
    private String regPlacaVehiculo;
    private String regTipoVehiculo;
    private String regHoraYFechaEntrada;
    private String regEstadoVehiculo;
    private String regLlaves;
    private String regNumCascos;
    private String regNitParqueadero;
    private String regNumCasillero;
    private String regHoraYFechaSalida;
    private String regUsuario;

    //Constructor parametrizado de la clase RegVehiculo
    public RegVehiculo(String regNumFicha, String regPlacaVehiculo, String regTipoVehiculo, String regHoraYFechaEntrada, String regEstadoVehiculo, String regLlaves, String regNumCascos, String regNitParqueadero, String regNumCasillero,String regUsuario,String regHoraYFechaSalida) {
        this.regNumFicha = regNumFicha;
        this.regPlacaVehiculo = regPlacaVehiculo;
        this.regTipoVehiculo = regTipoVehiculo;
        this.regHoraYFechaEntrada = regHoraYFechaEntrada;
        this.regEstadoVehiculo = regEstadoVehiculo;
        this.regLlaves = regLlaves;
        this.regNumCascos = regNumCascos;
        this.regNitParqueadero = regNitParqueadero;
        this.regNumCasillero = regNumCasillero;
        this.regHoraYFechaSalida=regHoraYFechaSalida;
        this.regUsuario=regUsuario;
    }
    
    // Constructor sin parametros de la calse RegVehiculo
    public RegVehiculo(){
        regNumFicha = "";
        regPlacaVehiculo = "";
        regTipoVehiculo = "";
        regHoraYFechaEntrada = "";
        regEstadoVehiculo = "";
        regLlaves = "";
        regNumCascos = "";
        regNitParqueadero = "";
        regNumCasillero = "";
        regHoraYFechaSalida="";
        regUsuario = "";
    }
    
    //Getters y Setters de los atributos de la clase RegVehiculo
    public String getRegNumFicha() {
        return regNumFicha;
    }

    public void setRegNumFicha(String regNumFicha) {
        this.regNumFicha = regNumFicha;
    }

    public String getRegPlacaVehiculo() {
        return regPlacaVehiculo;
    }

    public void setRegPlacaVehiculo(String regPlacaVehiculo) {
        this.regPlacaVehiculo = regPlacaVehiculo;
    }

    public String getRegTipoVehiculo() {
        return regTipoVehiculo;
    }

    public void setRegTipoVehiculo(String regTipoVehiculo) {
        this.regTipoVehiculo = regTipoVehiculo;
    }

    public String getRegHoraYFechaEntrada() {
        return regHoraYFechaEntrada;
    }

    public void setRegHoraYFechaEntrada(String regHoraYFechaEntrada) {
        this.regHoraYFechaEntrada = regHoraYFechaEntrada;
    }

    public String getRegEstadoVehiculo() {
        return regEstadoVehiculo;
    }

    public void setRegEstadoVehiculo(String regEstadoVehiculo) {
        this.regEstadoVehiculo = regEstadoVehiculo;
    }

    public String getRegLlaves() {
        return regLlaves;
    }

    public void setRegLlaves(String regLlaves) {
        this.regLlaves = regLlaves;
    }

    public String getRegNumCascos() {
        return regNumCascos;
    }

    public void setRegNumCascos(String regNumCascos) {
        this.regNumCascos = regNumCascos;
    }

    public String getRegNitParqueadero() {
        return regNitParqueadero;
    }

    public void setRegNitParqueadero(String regNitParqueadero) {
        this.regNitParqueadero = regNitParqueadero;
    }

    public String getRegNumCasillero() {
        return regNumCasillero;
    }

    public void setRegNumCasillero(String regNumCasillero) {
        this.regNumCasillero = regNumCasillero;
    }

    public String getRegHoraFechaSalida() {
        return regHoraYFechaSalida;
    }

    public void setRegHoraYFechaSalida(String regHoraYFechaSalida) {
        this.regHoraYFechaSalida = regHoraYFechaSalida;
    }

    public String getRegUsuario() {
        return regUsuario;
    }

    public void setRegUsuario(String regUsuario) {
        this.regUsuario = regUsuario;
    }
}
