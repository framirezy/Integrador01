/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Sistema
 */
public class clsDispositivo {
    private clsDistribuidor distribuidor;
    private clsUser usuario;
    private String marca;
    private String numeroSerie;
    private int puertos;
    private int voltaje;
    private int velocidad;
    private String tecnologia;
    
    public void registrardispositivo(){
        
    }
    
    public void agregarDistribuidor(clsDistribuidor objDistribuidor){
        this.distribuidor = objDistribuidor;
    }
    
    public void registrarProveedor(){
    
    }
    
    public boolean validarModelo(){        
        return true;
    }
    
    public int capacidadFisica(){    
        return 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getPuertos() {
        return puertos;
    }

    public void setPuertos(int puertos) {
        this.puertos = puertos;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
        
}
