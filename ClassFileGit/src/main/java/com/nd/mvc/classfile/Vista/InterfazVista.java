/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.nd.mvc.classfile.Vista;

import com.nd.mvc.classfile.Controlador.ControlCarpeta;

/**
 *Interfaz con los metodos que deben implementar las vistas que se generen para la aplicacion
 * 
 * @author ND by Nicolae Dan
 * @version 1.0
 * created on $(date)
 */
public interface InterfazVista {
    void setControlador(ControlCarpeta c);
   
    void arranca();
    
    String getRuta();
    String getNombre();
    
    static final String CREARCARPETACONRUTACOMPLETA = "Crea carpeta recibiendo la ruta";
    static final String CREARCARPETARUTAPADREYNOMBRE = "Crea carpeta recibiendo la ruta";
}
