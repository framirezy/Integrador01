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
public class clsRouter extends clsDispositivo implements iConfiguracion{
    private String hostname;
    private String user;
    private String password;
    private String dns;
    private boolean ssh;
    private String aaa;
    private String ntp;
    private String numeroPuertos;
    private String hInterface;
    private String interfacemnask;
    
    public boolean validarInterfaz(){
        
        return true;
    }
    
    @Override
    public int capacidadFisica(){
        
        return 0;
    }

    @Override
    public void generarScrip() {
        
    }

    @Override
    public void generarUsuarioDispositivo() {
        
    }

    @Override
    public void generarClaveDispositivo() {
        
    }
    
}
