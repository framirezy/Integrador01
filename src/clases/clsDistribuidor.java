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
public class clsDistribuidor {
    private String idDistribuidor;
    private String nombreDistribuidor;
    private clsDocumento documento;
    private clsFabricante fabricante;
    
    public void registrarDistribuidor(clsFabricante objFabricante){
        this.fabricante = objFabricante;
    }
        
    public void actualizarProveedor(){
        
    }

    public String getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(String idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public String getNombreDistribuidor() {
        return nombreDistribuidor;
    }

    public void setNombreDistribuidor(String nombreDistribuidor) {
        this.nombreDistribuidor = nombreDistribuidor;
    }

    public clsDocumento getDocumento() {
        return documento;
    }

    public void setDocumento(clsDocumento documento) {
        this.documento = documento;
    }

    public clsFabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(clsFabricante fabricante) {
        this.fabricante = fabricante;
    }
        
}
