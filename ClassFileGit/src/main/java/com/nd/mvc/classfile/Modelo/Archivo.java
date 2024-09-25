/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.nd.mvc.classfile.Modelo;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author ND by Nicolae Dan
 * @version 1.0
 * created on $(date)
 */
public class Archivo {
    
    public void crearArchivo() throws IOException{
       File archivoNuevo = new File(this.ruta, this.nombre);
    
    archivoNuevo.createNewFile(); 
    }
    
public boolean renombrarArchivo(String ruta, String nombreAntiguo, String nuevoNombre){
        boolean exito = false;
        File archivoOriginal = new File (nombreAntiguo);
        if(archivoOriginal.exists()){
            File archivoNuevo= new File(nuevoNombre);
            return archivoOriginal.renameTo(archivoNuevo);
        }else{
            System.out.println("No se ha podido renombrar el archivo");
        }
        return exito;
    }
}