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
public class Vehiculo {
    private String placaVehiculo;
    private String tipoVehiculo;

    //Constructor parametrizado de la clase Vehiculo
    public Vehiculo(String placaVehiculo, String tipoVehiculo) {
        this.placaVehiculo = placaVehiculo;
        this.tipoVehiculo = tipoVehiculo;
    }
    
    //Constructor sin parametros de la clase Vehiculo
    public Vehiculo(){
        placaVehiculo = "";
        tipoVehiculo = "";
    }
    
    //Getters y Setters para los atributos de la clase Vehiculo
    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    
}
