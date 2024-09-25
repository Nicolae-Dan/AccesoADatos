/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nd.mvc.classfile;

import com.nd.mvc.classfile.Controlador.ControlCarpeta;
import com.nd.mvc.classfile.Modelo.Carpeta;
import com.nd.mvc.classfile.Vista.CarpetaVistaTexto;
import com.nd.mvc.classfile.Vista.InterfazVista;

/**
 *
 * @author ND by Nicolae Dan
 */
public class ClassFile {

    public static void main(String[] args) {
        InterfazVista vista=new CarpetaVistaTexto();
        Carpeta modelo = new Carpeta();
        ControlCarpeta control= new ControlCarpeta(vista, modelo);
        
    }
}
