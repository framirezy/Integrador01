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
public abstract class clsPersona {
    private String idPersona;
    private String apellidos;
    private String nombres;
    private clsDocumento documento;
    
    public abstract void registrar();
    public abstract void actualizar();
    
}
