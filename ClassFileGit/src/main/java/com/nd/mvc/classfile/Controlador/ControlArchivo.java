/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.nd.mvc.classfile.Controlador;

import com.nd.mvc.classfile.Modelo.Archivo;
import com.nd.mvc.classfile.Vista.InterfazVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ND by Nicolae Dan
 * @version 1.0
 * created on $(date)
 */
public class ControlArchivo implements ActionListener {
    private final InterfazVista vista;
    private final Archivo modelo;

    public ControlArchivo(InterfazVista vista, Archivo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}