/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.nd.mvc.classfile.Modelo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ND by Nicolae Dan
 * @version 1.0
 * created on $(date)
 */
public class Carpeta {
    
    public void crearCarpeta(String nombreDirectorio){
       Path p = Paths.get(nombreDirectorio); 
       
       if (Files.exists(p)){
           
           //return ("Directorio ya existe");
       }else{
           try{
              Path donePath= Files.createDirectories(p);
           //return ("El directorio ha sido creado"); 
           }catch(IOException ex){
               Logger.getLogger(Carpeta.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
    }
    
    public void crearCarpeta(Path directorioRaiz, String nombreDirectorio){
        crearCarpeta(directorioRaiz.toString()+"\\"+nombreDirectorio);
    }
    
    
}
