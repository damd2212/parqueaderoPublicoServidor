/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueaderospopservidor.servidor;

/**
 *
 * @author danny
 */

//Aplicacion principal para lanzar el servidor
public class Main {
    
    public static void main(String args[]){
        parqueaderosPopServer parSer = new parqueaderosPopServer(0);
        parSer.iniciar();
    }
    
}
