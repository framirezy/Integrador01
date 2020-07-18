/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Sistema
 */
public class clsVariablesGlobales {
    
    public static final ArrayList<clsDispositivo> listaDispositivo = 
            new ArrayList<clsDispositivo>();
    
    public static final clsRouter globalRouter = 
            new clsRouter();
    
    public static final clsSwitch globalSwitch = 
            new clsSwitch();
    
    public static final clsDispositivo globalDispositivo = 
            new clsDispositivo();
    
    //Valores pre-Cargados
    /*
    0: Primeros 6 digitos del numero de serie
    
    1: Marca
        TPLINK
        ASUS
        CISCO
        HPE
        NETGEAR
    2: idMarca
    
    3: Fabricante
        ENTERASYS NETWORK
        ORACLE MICROSYSTEMS
        DELL
        HUAWEI
        JUNIPER
    4: idFabricante
    5: paisFabeicante
        ARGENTINA
        BRASIL
        BRASIL
        PARAGUAY
        PERU
    
    6: Distribuidor
        GRUPO AP CORP SAC
        ELECTRO DATA
        INT COMEX
        TEMSA
        CENTHOS PERU
    7: idDistribuidor
    
    8: Tecnologia
        FIBRA OPTICA
        RADIO
        COBRE
        ACCESO SATELITAL
    9: idTecnologia
    */
    public static final String [][] datos = {
        {
        "123456",
        "TPLINK", "1",
        "ENTERASYS NETWORK", "1", "ARGENTINA",
        "GRUPO AP CORP SAC", "1",
        "FIBRA OPTICA", "1"
        },
        {
        "234567",
        "ASUS", "2",
        "ORACLE MICROSYSTEMS", "2", "BRASIL",
        "INT COMEX", "3",
        "ACCESO SATELITAL", "4"
        },
        {
        "345678",
        "CISCO", "3",
        "HUAWEI", "4", "PARAGUAY",
        "ELECTRO DATA", "2",
        "COBRE", "3"
        },
        {
        "456789",
        "HPE", "4",
        "DELL", "3", "BRASIL",
        "TEMSA", "4",
        "RADIO", "2"
        },
        {
        "567890",
        "NETGEAR", "5",
        "JUNIPER", "5", "PERU",
        "CENTHOS PERU", "5",
        "ACCESO SATELITAL", "4"
        }        
    };
    
}
