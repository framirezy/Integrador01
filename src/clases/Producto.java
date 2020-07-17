/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Milagros Ramirez
 */
public class Producto {
    
    private String nombres;
    private String apellidos;
    private String nroDocumento;
    private String usuario;
    private String contraseña;

    public Producto(String nombres, String apellidos, String nroDocumento, String usuario, String contraseña) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nroDocumento = nroDocumento;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Producto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
